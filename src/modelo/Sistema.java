package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
private List<Tarjeta> tarjetas;
private List<Usuario> usuarios;
public Sistema() {
	super();
	tarjetas=new ArrayList<Tarjeta>();
	usuarios = new ArrayList <Usuario>();
}
public List<Tarjeta> getTarjetas() {
	return tarjetas;
}
public void setTarjetas(List<Tarjeta> tarjetas) {
	this.tarjetas = tarjetas;
}
public List<Usuario> getUsuarios() {
	return usuarios;
}
public void setUsuarios(List<Usuario> usuarios) {
	this.usuarios = usuarios;
}
public Usuario traerUsuario(long dni) {
	int i=0;
	Usuario user=null;
	while(i<usuarios.size()&& user==null) {
	if(usuarios.get(i).getDni()==dni) {
		user=usuarios.get(i);
		
	}
	i++;
	}
	
	return user;
	}
	
public boolean agregarUsuario(long dni,String apellido,String nombre)throws Exception {
	boolean aux=false;
	Usuario user=null;
	int id=1;
	user=traerUsuario(dni);
	if(user!=null) {
		throw new Exception("ya existe el usuario con el mismo dni");
	}
	else {
		id=1;
		if(usuarios.size()>0) {
			id=usuarios.get(usuarios.size()-1).getId()+1;
		}
		aux=usuarios.add(new Usuario(id,dni, apellido, nombre));
		
	}
	return aux;
}
public Tarjeta traerTarjeta(String codigo) {
    Tarjeta aux=null;
	int i=0; 
	while(i<tarjetas.size()&& aux==null) {
		if(tarjetas.get(i).getCodigo().equals(codigo)) {
		aux=tarjetas.get(i);
	}
		i++;
	}
	return aux;
}
public boolean agregarTarjeta(String codigo,Usuario user) throws Exception{
	boolean aux=false ;
	Tarjeta tarjeta=null;
	tarjeta=traerTarjeta(codigo);
	if(tarjeta!=null) {
		if(tarjeta.getCodigo().length()<6) {
			throw new Exception("tiene menos de 6 digitos");
		}
		
	}else {
		aux=tarjetas.add(new Tarjeta(codigo, user, 0));
		aux=true;
	}
	return aux;
}


}