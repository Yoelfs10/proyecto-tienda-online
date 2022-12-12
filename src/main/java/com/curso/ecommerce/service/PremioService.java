package com.curso.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.curso.ecommerce.model.Premio;
import com.curso.ecommerce.model.Producto;

public interface PremioService {
	public Premio save( Premio p);
	public static Premio get(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	public void update(Producto producto);
	public void delete(Integer id);
	public List<Producto> findAll();

}
