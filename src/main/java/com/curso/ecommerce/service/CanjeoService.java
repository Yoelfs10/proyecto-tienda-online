package com.curso.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.curso.ecommerce.model.Canjeo;
import com.curso.ecommerce.model.Producto;

public interface CanjeoService {
	public Canjeo save( Canjeo canjeo);
	public Optional<Canjeo> get(Integer id);
	public void update(Canjeo producto);
	public void delete(Integer id);
	public List<Canjeo> findAll();
	

}
