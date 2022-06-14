package org.diegorene.controlador;
import java.util.ArrayList;
import org.diegorene.modelo.Contacto;
public class ControladorDeContacto{
	private ArrayList<Contacto> listaDeContactos;
	private static ControladorDeContacto instancia;
	
	public ControladorDeContacto(){
		listaDeContactos = new ArrayList<Contacto>();
	}
	public int CantidadDeElementos(){
		return listaDeContactos.size();
	}
	public static ControladorDeContacto getInstancia(){
		if(instancia == null){
			instancia = new ControladorDeContacto();
		}return instancia;
	}
	public void CrearContacto(Contacto contacto){
		listaDeContactos.add(contacto);
	}
	public ArrayList<Contacto> getListaDeContactos(){
		return listaDeContactos;
	}
	public void EliminarContacto(Contacto contacto){
		listaDeContactos.remove(contacto);
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