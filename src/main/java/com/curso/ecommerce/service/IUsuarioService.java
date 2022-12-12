package com.curso.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.curso.ecommerce.model.Usuario;

public interface IUsuarioService {
	List<Usuario> findAll();
	Usuario findById(long l);
	Usuario save (Usuario usuario);
	Optional<Usuario> findByEmail(String email);
	Optional<Usuario> findById(Integer id);

}
