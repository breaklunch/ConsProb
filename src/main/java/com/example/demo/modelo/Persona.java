package com.example.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String apellido;
	private int Dni;
	private int Ruc;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Persona(int id, String nombre, String apellido, int dni, int ruc) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		Dni = dni;
		Ruc = ruc;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public int getDni() {
		return Dni;
	}



	public void setDni(int dni) {
		Dni = dni;
	}



	public int getRuc() {
		return Ruc;
	}



	public void setRuc(int ruc) {
		Ruc = ruc;
	}



	



	
}
