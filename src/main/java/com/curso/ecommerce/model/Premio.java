package com.curso.ecommerce.model;

import java.sql.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity

@Table(name = "premios")

public class Premio {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_premio;

	@Column(nullable = false)
	private String tipo;
	
	private double cantidad_puntos;

	@ManyToMany(mappedBy = "premios")
	private Set<Usuario> registrados = new HashSet<Usuario>();

	public Premio() {
		
	}
	public Premio(int id_premio, String tipo, double cantidad_puntos, Set<Usuario> registrados) {
		super();
		this.id_premio = id_premio;
		this.tipo = tipo;
		this.cantidad_puntos = cantidad_puntos;
		this.registrados = registrados;
	}

	public int getId_premio() {
		return id_premio;
	}

	public void setId_premio(int id_premio) {
		this.id_premio = id_premio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getCantidad_puntos() {
		return cantidad_puntos;
	}

	public void setCantidad_puntos(double cantidad_puntos) {
		this.cantidad_puntos = cantidad_puntos;
	}

	public Set<Usuario> getRegistrados() {
		return registrados;
	}

	public void setRegistrados(Set<Usuario> registrados) {
		this.registrados = registrados;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantidad_puntos, id_premio, registrados, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Premio other = (Premio) obj;
		return Double.doubleToLongBits(cantidad_puntos) == Double.doubleToLongBits(other.cantidad_puntos)
				&& id_premio == other.id_premio && Objects.equals(registrados, other.registrados)
				&& Objects.equals(tipo, other.tipo);
	}

	@Override
	public String toString() {
		return "Premio [id_premio=" + id_premio + ", tipo=" + tipo + ", cantidad_puntos=" + cantidad_puntos
				+ ", registrados=" + registrados + "]";
	}
	
	
	
	
	

}

