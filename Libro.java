package org.diegorene.libro;
import java.util.Arraylist;
import org.diegorene.modelo.Libro;
public class ControladorDeLibro{
	private Arraylist<Libro>listaDeLibros;
	private static ControladorDeLibro instancia;

	public ControladorDeLibro(){
		listaDeLibros = new ArrayList<Libro>();
	}
	public int CantidadDeElementos(){
		return listaDeLibros.size();
	}
	public static ControladorDeLibro getInstancia(){
		if(instancia == null){
			instancia = new ControladorDeLibro();
		}return instancia;
	}
	public void CrearLibro(Libro libro){
		listaDeLibros.add(libros);
	}
	public ArrayList<Libro> getListaDeLibros(){
		return listaDeLibros;
	}
	public void EliminarLibro(Libro libro){
		listaDeLibros.remove(libros);
	}
	public void EliminarContacto(int posicion){
		listaDeContactos.remove(posicion);
	}
	public Contacto BuscarContacto(int idContacto){
		Contacto contacto = null;
		for(Contacto elemento:listaDeContactos){
			if(elemento.getId() == idContacto){
				contacto = elemento;
			break;
			}
		}
		return contacto;
	}
}