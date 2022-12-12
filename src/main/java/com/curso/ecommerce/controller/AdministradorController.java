package com.curso.ecommerce.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.curso.ecommerce.model.Orden;
import com.curso.ecommerce.model.Premio;
import com.curso.ecommerce.model.Producto;
import com.curso.ecommerce.service.CanjeoService;
import com.curso.ecommerce.service.IOrdenService;
import com.curso.ecommerce.service.IUsuarioService;
import com.curso.ecommerce.service.PremioService;
import com.curso.ecommerce.service.ProductoService;

@Controller
@RequestMapping("/administrador")
public class AdministradorController {

	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private IOrdenService ordensService;
	
	@Autowired
	private PremioService premioService;
	
	@Autowired
	private CanjeoService canjeoService;
	
	private Logger logg= LoggerFactory.getLogger(AdministradorController.class);

	@GetMapping("")
	public String home(Model model) {

		List<Producto> productos = productoService.findAll();
		model.addAttribute("productos", productos);


		return "administrador/home";
	}
	
	@GetMapping("/usuarios")
	public String usuarios(Model model) {
		model.addAttribute("usuarios", usuarioService.findAll());
		return "administrador/usuarios";
	}
	
	@GetMapping("/ordenes")
	public String ordenes(Model model) {
		model.addAttribute("ordenes", ordensService.findAll());
		return "administrador/ordenes";
	}
	
	@GetMapping("/detalle/{id}")
	public String detalle(Model model, @PathVariable Integer id) {
		logg.info("Id de la orden {}",id);
		Orden orden= ordensService.findById(id).get();
		
		model.addAttribute("detalles", orden.getDetalle());
		
		return "administrador/detalleorden";
	}
	@GetMapping("/premios")
	public String premios(Model model) {
		model.addAttribute("premios", premioService.findAll());
		return "administrador/premios";
	}
	
	@RequestMapping("/newpremio")
	public String NuevoPremio(Model model) {
		Premio p = new Premio();
		model.addAttribute("p", p);

		return "nuevo planta";
	}

	@RequestMapping(value = "/savepremio", method = RequestMethod.POST)
	public String salvarPremio(@ModelAttribute("p") Premio p) {
		premioService.save(p);

		return "redirect:/indexplantas";
	}

	@RequestMapping("/editarpremio/{id}")
	public ModelAndView enseñarpremios(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("editar premio");
		Premio p = PremioService.get(id);
		mav.addObject("p", p);

		return mav;
	}

	@RequestMapping("/eliminarpremio/{id}")
	public String eliminarpremio(@PathVariable(name = "id") int id) {
		premioService.delete(id);
		return "redirect:/indexplantas";
	}

	
	
}
