package com.ejemplos.models.entity;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "alimento")
public class Alimento implements Serializable, Comparable<Alimento>{
	
	@Id
	private String codigo;
	
	private String nombre;
	
	private String marca;
	
	private Integer proteinas;

	public Alimento() {
		super();
	}

	public Alimento(@NotEmpty String codigo, String nombre, String marca, Integer proteinas) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		this.proteinas = proteinas;
	}

	private static final long serialVersionUID = 1L;

	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getProteinas() {
		return proteinas;
	}

	public void setProteinas(Integer proteinas) {
		this.proteinas = proteinas;
	}

	
	
	@Override
	public String toString() {
		return "Alimento [codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", proteinas=" + proteinas
				+ "]";
	}

	@Override
	public int compareTo(Alimento a2) {
		int codigo1 = Integer.parseInt(this.codigo.substring(2));
		int codigo2 = Integer.parseInt(a2.getCodigo().substring(2));
		return Integer.compare(codigo1, codigo2);
	}
	
}
