package com.curso.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.ecommerce.model.Premio;
import com.curso.ecommerce.repository.premioRepository;

@Service

public class PremioServiceImpl {

	@Autowired
	private premioRepository premioRepository;

	public Premio save(Premio premio) {
		return premioRepository.save(premio);
	}

	public Optional<Premio> get(Integer id) {
		return premioRepository.findById(id);
	}

	public void update(Premio premio) {
		premioRepository.save(premio);		
	}

	public void delete(Integer id) {
		premioRepository.deleteById(id);		
	}

	public List<Premio> findAll() {
		return premioRepository.findAll();
	}
}

