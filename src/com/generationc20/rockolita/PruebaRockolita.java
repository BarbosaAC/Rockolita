package com.generationc20.rockolita;
import com.generationc20.rockolita.contenido.GuardarCancion;
import com.generationc20.rockolita.contenido.LeerPlaylist;
import com.generationc20.rockolita.contenido.Cancion;
import com.generationc20.rockolita.contenido.Playlist;

import java.util.List;
import java.util.ArrayList;

public class PruebaRockolita {

	public static final String RUTA_ARCHIVO_PLAYLIST="/home/alejandro/Documentos/eclipse-workspace/Rocolita/src/com/generationc20/rockolita/%s.txt";
	public static void main (String[] args) {
		
		Playlist paraManejar=new Playlist(1,"Para manejar");
		
		
		GuardarCancion.guardarPlaylist(paraManejar);
		//System.out.println(paraManejar);
		LeerPlaylist.leerPlaylist("Para manejar");
	
		
/*		int tamanio=paraManejar.getCanciones().size();
		for(int i=0;i<tamanio;i++) {
			Cancion cancion=paraManejar.getCanciones().get(i);
			System.out.println("Nombre: "+cancion.getNombre());
			
		}*/
	}
}



