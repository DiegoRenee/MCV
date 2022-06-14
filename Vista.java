package org.diegorene.vista;
import org.diegorene.modelo.Contacto;
import org.diegorene.controlador.ControladorDeContacto;
import java.util.Scanner;
public class Vista{
	public ControladorDeContacto controlador = ControladorDeContacto.getInstancia();
	private Scanner entrada = new Scanner(System.in);

	public Vista(){}
	public void nuevoContacto(){
		Contacto contacto = new Contacto();
		System.out.println("Ingrese el nombre del contacto: ");
		contacto.setNombre(entrada.nextLine());
		System.out.println("Ingrese el telefono del contacto: ");
		contacto.setTelefono(entrada.nextLine());
		contacto.setId(controlador.CantidadDeElementos()+1);
		controlador.CrearContacto(contacto);
	}
	public void mostrarContactos(){
		for(Contacto contacto:controlador.getListaDeContactos()){
			System.out.println("id: " + contacto.getId());
			System.out.println("Nombre: " + contacto.getNombre());
			System.out.println("Telefono: " + contacto.getTelefono());
		}
	}
	public void mostrarContactoForId(){
		Contacto contacto = new Contacto();
		System.out.println("Ingrese el id del contacto a mostrar: ");
		contacto = controlador.BuscarContacto(entrada.nextInt());
		System.out.println("Id: " + contacto.getId());
		System.out.println("Nombre: " + contacto.getNombre());
		System.out.println("Telefono: " + contacto.getTelefono());
	}
	public void borrarContacto(){
		System.out.println("Ingrese el id para eleminar al contacto: ");
		controlador.EliminarContacto(entrada.nextInt());
	}
}