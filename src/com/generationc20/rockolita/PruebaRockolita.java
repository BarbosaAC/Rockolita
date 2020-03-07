package com.generationc20.rockolita;
import com.generationc20.rockolita.contenido.GuardarCancion;
import com.generationc20.rockolita.contenido.LeerPlaylist;
import com.generationc20.rockolita.contenido.Cancion;
import com.generationc20.rockolita.contenido.Playlist;

import java.util.Scanner;

public class PruebaRockolita {

	public static final String RUTA_ARCHIVO_PLAYLIST="/home/alejandro/Documentos/eclipse-workspace/Rocolita/src/com/generationc20/rockolita/%s.txt";
	public static void main (String[] args) {
		Scanner lector = new Scanner(System.in);

		int elegirOpcion=1;
		Playlist paraManejar=new Playlist(1,"Para manejar");
		while(elegirOpcion==1) {
		System.out.println("Bienvenido de nuevo :)");
		System.out.println("Elige el numero de la opcion deseada");
		System.out.println("1.Agregar caciones a playlist");
		System.out.println("2.Mostrar canciones de playlist");
		int opcion = lector.nextInt();
		lector.nextLine();
		
			switch(opcion) {
			case 1:
				String nombreCancion;
				String artistaCancion;
				System.out.println("Ingresa su nombre");
				nombreCancion=lector.nextLine();
				System.out.println("Ingresa el artista");
				artistaCancion=lector.nextLine();
				Cancion cancionIntroducida=new Cancion(nombreCancion, artistaCancion);
				
				paraManejar=LeerPlaylist.leerPlaylist("Para manejar");
				paraManejar.agregarCancion(cancionIntroducida);
				GuardarCancion.guardarPlaylist(paraManejar);
				System.out.println("Guardado con exico!!");
				System.out.println("Deseas agregar otra canción o ver tu playlist?");
				System.out.println("1.Claro!!");
				System.out.println("2.No");	
				elegirOpcion = lector.nextInt();
				lector.nextLine();
				break;
			case 2:
				paraManejar=LeerPlaylist.leerPlaylist("Para manejar");
				System.out.println(paraManejar);
				break;
			default:
				System.out.println("Elige una opcion valida");
		    }
		}
		
		
		lector.close();

		
/*		int tamanio=paraManejar.getCanciones().size();
		for(int i=0;i<tamanio;i++) {
			Cancion cancion=paraManejar.getCanciones().get(i);
			System.out.println("Nombre: "+cancion.getNombre());
			
		}*/
	}
}



