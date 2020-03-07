package com.generationc20.rockolita;
import com.generationc20.rockolita.contenido.Cancion;
import com.generationc20.rockolita.contenido.Playlist;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class PruebaRockolita {

	public static final String RUTA_ARCHIVO_PLAYLIST="/home/alejandro/Documentos/eclipse-workspace/Rocolita/src/com/generationc20/rockolita/%s.txt";
	public static void main (String[] args) {
		
		Cancion amateur=new Cancion(1,"Amateur","Molotov");
		Cancion laChona=new Cancion(2,"La chona","Los Tigres del Norte");
		Cancion somos=new Cancion(3,"Somos","Los Autenticos Decadentes");
		Cancion espejeando=new Cancion(4,"Espejeando","Los Tucanes de Tijuana");
		Cancion yLaBandaSigue=new Cancion(5,"Y la banda sigue","Los Autenticos Decadentes");
		
		
		
		Playlist paraManejar=new Playlist(1,"Para manejar");
		paraManejar.agregarCancion(amateur);
		paraManejar.agregarCancion(laChona);
		paraManejar.agregarCancion(somos);
		paraManejar.agregarCancion(espejeando);
		paraManejar.agregarCancion(yLaBandaSigue);
		
		int tamanio=paraManejar.getCanciones().size();
		for(int i=0;i<tamanio;i++) {
			Cancion cancion=paraManejar.getCanciones().get(i);
			System.out.println("Nombre: "+cancion.getNombre());
			
		}
		guardarPlaylist(paraManejar);
		//System.out.println(paraManejar);
		
	}
	
public static void guardarPlaylist(Playlist playlist) {
		
		String nombreArchivo=playlist.getNombre().replace(" ", "_");
		String nombreArchivoExtension=String.format(RUTA_ARCHIVO_PLAYLIST,nombreArchivo);
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



