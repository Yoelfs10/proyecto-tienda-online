package com.curso.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.ecommerce.model.Premio;



@Repository
public interface premioRepository extends JpaRepository<Premio, Integer>{

}

