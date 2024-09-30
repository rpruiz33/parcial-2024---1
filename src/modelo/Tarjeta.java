package modelo;
import java.util.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tarjeta {
private String Codigo;
private Usuario usuario;
private List<Viaje>viajes ;
private List<Carga>cargas ;
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
	return cargas;
}
public void setCargas(List<Carga> cargas) {
	cargas = cargas;
}
public double getSaldoActual() {
	return SaldoActual;
}
public double setSaldoActual(double saldoActual) {
	return SaldoActual = saldoActual;
}
public Tarjeta(String codigo, Usuario usuario, double saldoActual) {
	super();
	Codigo = codigo;
	this.usuario = usuario;
	viajes=new ArrayList<Viaje>();
	cargas = new ArrayList <Carga>();
	SaldoActual = saldoActual;
}

@Override
public String toString() {
	return "Tarjeta [Codigo=" + Codigo + ", usuario=" + usuario + ", viajes=" + viajes + ", Cargas=" + cargas
			+ ", SaldoActual=" + SaldoActual + "]";
}
public boolean equals(Tarjeta tarjeta) {
	return tarjeta.getCodigo().equals(Codigo)&&tarjeta.getUsuario().equals(usuario)&& tarjeta.SaldoActual==SaldoActual;
}
public boolean agregarCarga(LocalDate fecha,double valor) {
	
	boolean aux=cargas.add(new Carga (fecha,setSaldoActual(valor+getSaldoActual())));
	return aux;
}

public List<Viaje> traerViaje(LocalDate fecha){
	List <Viaje> viajesAux=new ArrayList<Viaje>();
	for(int i=0;i<viajes.size();i++) {
		if(viajes.get(i).getFecha().equals(fecha)) {
			viajesAux.add(viajes.get(i));
		}
		
	}
	
	return viajesAux;
	
}
public boolean agregarViaje(String medioYlinea, double precio, double descuento, LocalDate fecha) {
	List <Viaje> viajesAux=new ArrayList<Viaje>();
	viajesAux=traerViaje(fecha);
	boolean aux=false;

	if( viajesAux.size()==2 &&aux==false&&descuento==50 && viajesAux!=null)
	{
	
		SaldoActual=getSaldoActual()-(precio/(2));
		aux=true;
	}
	else {
	
	SaldoActual=getSaldoActual()-(precio);
		viajes.add(new Viaje(medioYlinea, precio,  descuento, fecha));
	aux=true;
	}
	
	
return aux;
	
	
}

}