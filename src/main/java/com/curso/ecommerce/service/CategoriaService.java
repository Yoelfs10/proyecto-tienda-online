package com.curso.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.curso.ecommerce.model.Categoria;


public interface CategoriaService {
	public Categoria save(Categoria producto);
	public Optional<Categoria> get(Integer id);
	public void update(Categoria categoria);
	public void delete(Integer id);
	public List<Categoria> findAll();

}
