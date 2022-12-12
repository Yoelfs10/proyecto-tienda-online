package com.curso.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.ecommerce.model.Categoria;
import com.curso.ecommerce.repository.categoriaRepository;
@Service

public class CategoriaServiceImpl {

	@Autowired
	private categoriaRepository categoriaRepository;

	public Categoria save(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}

	public Optional<Categoria> get(Integer id) {
		return categoriaRepository.findById(id);
	}

	public void update(Categoria categoria) {
		categoriaRepository.save(categoria);		
	}

	public void delete(Integer id) {
		categoriaRepository.deleteById(id);		
	}

	public List<Categoria> findAll() {
		return categoriaRepository.findAll();
	}
}

