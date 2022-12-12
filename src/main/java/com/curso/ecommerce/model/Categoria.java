package com.curso.ecommerce.model;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name = "categorias")

public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_categoria;

	@Column(nullable = false)
	private String tipo;

	@ManyToOne
	@JoinColumn(name = "id_producto")
	private Producto producto;
	
	public Categoria(int id_categoria, String tipo) {
		super();
		this.id_categoria = id_categoria;
		this.tipo = tipo;
	}
	
	public Categoria() {
		
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_categoria;
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id_categoria != other.id_categoria)
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "categoria [id_categoria=" + id_categoria + ", tipo=" + tipo + "]";
	}
	
	
	
}

