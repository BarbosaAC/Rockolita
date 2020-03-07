package com.generationc20.rockolita.contenido;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class LeerPlaylist {

	public static final String RUTA_ARCHIVO_PLAYLIST="/home/alejandro/Documentos/eclipse-workspace/Rocolita2/src/com/generationc20/rockolita/playlist.txt";
	public static Playlist leerPlaylist() {

		//String nombreArchivo=nombre.replace(" ", "_");
		String nombreArchivoExtension=String.format(RUTA_ARCHIVO_PLAYLIST);
		File archivoPlaylist= new File(nombreArchivoExtension);
		FileInputStream entradaDestino= null;
		ObjectInputStream procesadorObjeto=null;
		Playlist playlist=new Playlist();
		try {
			entradaDestino=new FileInputStream(archivoPlaylist);
			procesadorObjeto=new ObjectInputStream(entradaDestino);
			
			playlist =  (Playlist) procesadorObjeto.readObject();
			
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

		return playlist;
			
	}
}
