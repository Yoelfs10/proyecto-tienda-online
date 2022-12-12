package com.curso.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.curso.ecommerce.model.Canjeo;
import com.curso.ecommerce.model.Producto;

import antlr.collections.List;


@Repository
public interface canjeoRepository extends JpaRepository<Canjeo, Integer>{

	void deleteByIds(long idpremio, long idusuario);

	void deleteById(long id);

	Canjeo get(long idpremio, long idusuario);

	Optional<Canjeo> findById(long id);

	List findByParcela(Long idparcela);

}
