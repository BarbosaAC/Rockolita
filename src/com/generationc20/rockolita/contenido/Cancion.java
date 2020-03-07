package com.generationc20.rockolita.contenido;
import java.io.Serializable;

public class Cancion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String titulo;
	private String genero;
	private int duracion;
	private String nombreArtista;
	
	public Cancion() {}
	
	public Cancion( int id, String titulo, String nombreArtista) {
		this.id=id;
		this.titulo=titulo;
		this.nombreArtista=nombreArtista;
	}
	public Cancion(String titulo, String nombreArtista) {
		this.titulo=titulo;
		this.nombreArtista=nombreArtista;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return titulo;
	}
	public void setNombre(String nombre) {
		this.titulo = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getNombreArtista() {
		return nombreArtista;
	}
	public void setNombreArtista(String nombreArtista) {
		this.nombreArtista = nombreArtista;
	}
	
	@Override
	public String toString() {
		return"Titulo= "+titulo+"\n"
				+"Nombre de artista= "+nombreArtista+"\n";
	}
}
