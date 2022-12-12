package com.curso.ecommerce.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.ecommerce.model.Canjeo;
import com.curso.ecommerce.repository.canjeoRepository;

import antlr.collections.List;

@Service
@Transactional
public class CanjeoServiceImpl {
	@Autowired
	private canjeoRepository reposito;
	
	
	
	public java.util.List<Canjeo> listAll() {
		return reposito.findAll();
	}
	
	public List findByParcela(Long idparcela) {
		return reposito.findByParcela(idparcela);
	}
	
	public void save(Canjeo product) {
		reposito.save(product);
	}
	
	public Canjeo get(long id) {
		return reposito.findById(id).get();
	}

	public Canjeo get(long idpremio, long idusuario) {
		return reposito.get(idpremio, idusuario);
	}
	
	public void delete(long id) {
		reposito.deleteById(id);
	}
	
	public void delete(long idpremio, long idusuario) {
		reposito.deleteByIds(idpremio, idusuario);
	}

}
