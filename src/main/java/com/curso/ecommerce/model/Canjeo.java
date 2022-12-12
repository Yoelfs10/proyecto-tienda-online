package com.curso.ecommerce.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



public class Canjeo {
	@Embeddable
	public static class Id implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Column(name = "id_registrado")
		private int idregistrado;

		@Column(name = "id_premio")
		private int idpremio;

		public Id() {
		}

		public Id(int idregistrado, int idpremio) {
			this.idregistrado = idregistrado;
			this.idpremio = idpremio;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + idpremio;
			result = prime * result + idregistrado;
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
			Id other = (Id) obj;
			if (idpremio != other.idpremio)
				return false;
			if (idregistrado != other.idregistrado)
				return false;
			return true;
		}
		
		

	}

	@EmbeddedId
	private Id id = new Id();
	
	

	@Column(nullable=false)
	private int num_canjees;
	@ManyToOne
	@JoinColumn(name = "id_premio", insertable = false, updatable = false)
	private Premio premio;

	@ManyToOne
	@JoinColumn(name = "id_registrado", insertable = false, updatable = false)
	private Usuario usuario;

	public Canjeo(Id id, int num_canjees, Premio premio, Usuario usuario) {
		super();
		this.id = id;
		this.num_canjees = num_canjees;
		this.premio = premio;
		this.usuario = usuario;
	}

	public Canjeo() {
		// TODO Auto-generated constructor stub
	}

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public int getNum_canjees() {
		return num_canjees;
	}

	public void setNum_canjees(int num_canjees) {
		this.num_canjees = num_canjees;
	}

	public Premio getPremio() {
		return premio;
	}

	public void setPremio(Premio premio) {
		this.premio = premio;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, num_canjees, premio, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Canjeo other = (Canjeo) obj;
		return Objects.equals(id, other.id) && num_canjees == other.num_canjees && Objects.equals(premio, other.premio)
				&& Objects.equals(usuario, other.usuario);
	}

	@Override
	public String toString() {
		return "Canjeo [id=" + id + ", num_canjees=" + num_canjees + ", premio=" + premio + ", usuario=" + usuario
				+ "]";
	}

	
	
}

