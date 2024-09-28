package modelo;

import java.time.LocalDate;

public class Viaje {
private String medioYlinea;
private double precio;
private double descuento;
private LocalDate fecha;
public String getMedioYlinea() {
	return medioYlinea;
}
public void setMedioYlinea(String medioYlinea) {
	this.medioYlinea = medioYlinea;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public double getDescuento() {
	return descuento;
}
public void setDescuento(double descuento) {
	this.descuento = descuento;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
public Viaje(String medioYlinea, double precio, double descuento, LocalDate fecha) {
	super();
	this.medioYlinea = medioYlinea;
	this.precio = precio;
	this.descuento = descuento;
	this.fecha = fecha;
}

}
