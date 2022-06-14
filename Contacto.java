package org.diegorene.modelo;
public class Contacto{
	private int idContacto;
	private String nombreDeContacto;
	private String telefonoDeContacto;

	public Contacto(){}//constructor vacio
	public Contacto(int id, String nombre, String telefono){
		this.idContacto = id;
		this.nombreDeContacto = nombre;
		this.telefonoDeContacto = telefono;
	}
	public void setId(int id){
		this.idContacto = id;
	}
	public int getId(){
		return this.idContacto;
	}
	public void setNombre(String nombre){
		this.nombreDeContacto = nombre;

	}
	public String getNombre(){
		return this.nombreDeContacto;
	}
	public void setTelefono(String telefono){
		this.telefonoDeContacto = telefono;
	}
	public String getTelefono(){
		return this.telefonoDeContacto;
	}
}