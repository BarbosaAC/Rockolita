package com.generationc20.rockolita.contenido;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class LeerPlaylist {

	public static final String RUTA_ARCHIVO_PLAYLIST="/home/alejandro/Documentos/eclipse-workspace/Rocolita2/src/com/generationc20/rockolita/%s.txt";
	public static void leerPlaylist(String nombre) {

		String nombreArchivo=nombre.replace(" ", "_");
		String nombreArchivoExtension=String.format(RUTA_ARCHIVO_PLAYLIST,nombreArchivo);
		File archivoPlaylist= new File(nombreArchivoExtension);
		FileInputStream entradaDestino= null;
		ObjectInputStream procesadorObjeto=null;
		try {
			entradaDestino=new FileInputStream(archivoPlaylist);
			procesadorObjeto=new ObjectInputStream(entradaDestino);
			Playlist paraManejar=new Playlist();
			paraManejar =  (Playlist) procesadorObjeto.readObject();
			System.out.println(paraManejar);
		}catch(IOException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				procesadorObjeto.close();
				entradaDestino.close();
			}catch (IOException e) {
				System.out.println("No pudo cerrar el flujo");
				e.printStackTrace();
			}
			
		}
			
	}
}
