package modelo;

public class Usuario {
private int id;
private long dni;
private String apellido;
private String Nombre;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getDni() {
	return dni;
}
public void setDni(long dni) {
	this.dni = dni;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public Usuario(int id, long dni, String apellido, String nombre) {
	super();
	this.id = id;
	this.dni = dni;
	this.apellido = apellido;
	Nombre = nombre;
}
@Override
public String toString() {
	return "Usuario [id=" + id + ", dni=" + dni + ", apellido=" + apellido + ", Nombre=" + Nombre + "]";
}




}
