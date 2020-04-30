package com.generationc20.rockolita;
import com.generationc20.rockolita.contenido.GuardarCancion;
import com.generationc20.rockolita.contenido.LeerPlaylist;
import com.generationc20.rockolita.contenido.Cancion;
import com.generationc20.rockolita.contenido.Playlist;
import java.util.Scanner;

public class PruebaRockolita {

	public static final String RUTA_ARCHIVO_PLAYLIST="/home/alejandro/Documentos/eclipse-workspace/Rocolita/src/com/generationc20/rockolita/playlist.txt";
	public static void main (String[] args) {
		Scanner lector = new Scanner(System.in);

		int elegirOpcion=1;
		Playlist playlist=null;
		String nombreCancion;
		String artistaCancion;
		Cancion cancionIntroducida=null;
		while(elegirOpcion==1) {
		System.out.println("Bienvenido de nuevo :)");
		System.out.println("Elige el numero de la opcion deseada");
		System.out.println("1.Agregar canciones a playlist por primera vez");
		System.out.println("2.Agregar canciones a playlist sin ser primera vez");
		System.out.println("3.Mostrar canciones de playlist");
		int opcion = lector.nextInt();
		lector.nextLine();
		
			switch(opcion) {
			case 1:
				System.out.println("Ingresa un nombre para tu playlist");
				String nombrePlaylist=lector.nextLine();
			playlist=new Playlist(1,nombrePlaylist);
			System.out.println("Ingresa su nombre");
			nombreCancion=lector.nextLine();
			System.out.println("Ingresa el artista");
			artistaCancion=lector.nextLine();
			cancionIntroducida=new Cancion(nombreCancion, artistaCancion);
			playlist.agregarCancion(cancionIntroducida);
			GuardarCancion.guardarPlaylist(playlist);
			System.out.println("Guardado con exico!!");
			System.out.println("Deseas agregar otra canción o ver tu playlist?");
			System.out.println("1.Claro!!");
			System.out.println("2.No");	
			elegirOpcion = lector.nextInt();
			lector.nextLine();
			break;
			case 2:
				System.out.println("Ingresa el nombre de la canción");
				nombreCancion=lector.nextLine();
				System.out.println("Ingresa el artista");
				artistaCancion=lector.nextLine();
				cancionIntroducida=new Cancion(nombreCancion, artistaCancion);	
				playlist=LeerPlaylist.leerPlaylist();
				playlist.agregarCancion(cancionIntroducida);
				GuardarCancion.guardarPlaylist(playlist);
				System.out.println("Guardado con exico!!");
				System.out.println("Deseas agregar otra canción o ver tu playlist?");
				System.out.println("1.Claro!!");
				System.out.println("2.No");	
				elegirOpcion = lector.nextInt();
				lector.nextLine();
				break;
			case 3:
				playlist=LeerPlaylist.leerPlaylist();
				System.out.println(playlist);
				System.out.println("Deseas agregar otra canción o ver tu playlist?");
				System.out.println("1.Claro!!");
				System.out.println("2.No");	
				elegirOpcion = lector.nextInt();
				lector.nextLine();
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



