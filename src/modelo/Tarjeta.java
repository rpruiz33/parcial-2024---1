package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tarjeta {
private String Codigo;
private Usuario usuario;
private List<Viaje>viajes ;
private List<Carga>Cargas ;
private double SaldoActual;
public String getCodigo() {
	return Codigo;
}
public void setCodigo(String codigo) {
	Codigo = codigo;
}
public Usuario getUsuario() {
	return usuario;
}
public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}
public List<Viaje> getViajes() {
	return viajes;
}
public void setViajes(List<Viaje> viajes) {
	this.viajes = viajes;
}
public List<Carga> getCargas() {
	return Cargas;
}
public void setCargas(List<Carga> cargas) {
	Cargas = cargas;
}
public double getSaldoActual() {
	return SaldoActual;
}
public void setSaldoActual(double saldoActual) {
	SaldoActual = saldoActual;
}
public Tarjeta(String codigo, Usuario usuario, List<Viaje> viajes, List<Carga> cargas, double saldoActual) {
	super();
	Codigo = codigo;
	this.usuario = usuario;
	viajes=new ArrayList<Viaje>();
	cargas = new ArrayList <Carga>();
	SaldoActual = saldoActual;
}

@Override
public String toString() {
	return "Tarjeta [Codigo=" + Codigo + ", usuario=" + usuario + ", viajes=" + viajes + ", Cargas=" + Cargas
			+ ", SaldoActual=" + SaldoActual + "]";
}
public boolean equals(Tarjeta tarjeta) {
	return tarjeta.getCodigo().equals(Codigo)&&tarjeta.getUsuario().equals(usuario)&& tarjeta.SaldoActual==SaldoActual;
}
public boolean agregarCarga(LocalDate fecha,double valor) {
	
	
	double saldo=cargas.get(0).getSaldoActual()+valor;
	return true;
}
}