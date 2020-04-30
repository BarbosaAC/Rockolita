package com.generationc20.rockolita.contenido;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class GuardarCancion {
	public static final String RUTA_ARCHIVO_PLAYLIST="/home/alejandro/Documentos/eclipse-workspace/Rocolita2/src/com/generationc20/rockolita/playlist.txt";

public static void guardarPlaylist(Playlist playlist) {
		
		//String nombreArchivo=playlist.getNombre().replace(" ", "_");
		String nombreArchivoExtension=String.format(RUTA_ARCHIVO_PLAYLIST);
		File archivoPlaylist= new File(nombreArchivoExtension);
		FileOutputStream salidaDestino= null;
		ObjectOutputStream procesadorObjeto=null;
		//CRear archivo de salida en un destino
		try {
			salidaDestino=new FileOutputStream(archivoPlaylist);
			procesadorObjeto=new ObjectOutputStream(salidaDestino);
			procesadorObjeto.writeObject(playlist);
			System.out.println("Se guardo el archivo");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				procesadorObjeto.close();
				salidaDestino.close();
			}catch (IOException e) {
				System.out.println("No pudo cerrar el flujo");
				e.printStackTrace();
			}
			
		}
		
	}
}
