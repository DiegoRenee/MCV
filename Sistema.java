package org.diegorene.sistema;
import java.util.Scanner;
import org.diegorene.vista.Vista;
public class Sistema{
	public static void main(String[] args) {
		Vista vista = new Vista();
		Scanner entrada = new Scanner(System.in);
		int opcionMenu = 0;
		String [] listaMenu = {"\nAgenda electronica - elija una opcion: ",
			"1. Crear contacto: ", "2. Leer contactos: ", "3. Buscar contacto", 
			"4. Actualizar contacto",
			"5. Borrar contacto: ", "6. Salir\n"};
		do{
			for(int i=0; i<7; i++)
				System.out.println(listaMenu[i]);
				opcionMenu = entrada.nextInt();
				switch(opcionMenu){
				case 1:
					vista.nuevoContacto();
					break;
				case 2:
					vista.mostrarContactos();
					break;
				case 3:
					vista.mostrarContactoForId();
					break;
				//case 4:
				//	Vista.ActualizarContacto();
				//	break;
				case 5:
					vista.borrarContacto();
					break;
				case 6: 
					System.exit(0);
				}
		}while(opcionMenu != 6);
	}
}