package com.generationc20.rockolita.contenido;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;


public class Playlist implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	private String descripcion;
	private int duracion;
	//No funciona con valores de tipo primitivos
	private List<Cancion> canciones = new ArrayList<Cancion>();
	
	public Playlist() {}
	
	public Playlist(int id, String nombre) {
		this.id=id;
		this.nombre=nombre;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public List<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(List<Cancion> canciones) {
		this.canciones = canciones;
	}
	
	public void agregarCancion(Cancion cancion) {
		canciones.add(cancion);
	}
	

	
	
	@Override
	public String toString() {
		return canciones+"\n";
	}
}
