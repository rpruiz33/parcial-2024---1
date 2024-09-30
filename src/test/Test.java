package test;

import java.time.LocalDate;

import modelo.Sistema;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema sistema= new Sistema();
		try {
			System.out.println( sistema.agregarUsuario(1111111, "1", "1"));
			System.out.println(sistema.agregarUsuario(2222222, "2", "2"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(sistema.agregarTarjeta("111222", sistema.traerUsuario(1111111)));
			System.out.println(sistema.agregarTarjeta("333444", sistema.traerUsuario(2222222)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(sistema.getTarjetas());
		System.out.println(sistema.traerTarjeta("111222").agregarCarga(LocalDate.of(2024, 9, 23), 200));
		System.out.println(sistema.traerTarjeta("111222").agregarCarga(LocalDate.of(2024, 9, 30), 800));
		System.out.println(sistema.traerTarjeta("111222").getCargas());
		System.out.println(sistema.traerTarjeta("111222").getSaldoActual());
		
		System.out.println(sistema.traerTarjeta("111222").agregarViaje("colectivo 1",100, 0, LocalDate.of(2024, 10, 1)));
		System.out.println(sistema.traerTarjeta("111222").agregarViaje("colectivo 2",100, 0, LocalDate.of(2024, 10, 2)));
		System.out.println(sistema.traerTarjeta("111222").agregarViaje("colectivo 3",200, 50, LocalDate.of(2024, 10, 2)));
		System.out.println(sistema.traerTarjeta("111222").agregarViaje("colectivo 2",100, 50, LocalDate.of(2024, 10, 2)));
		System.out.println(sistema.traerTarjeta("111222").agregarViaje("colectivo 4",150, 0, LocalDate.of(2024, 10, 2)));
		System.out.println(sistema.traerTarjeta("111222").agregarViaje("colectivo 2",100, 0, LocalDate.of(2024, 10, 3)));
		System.out.println(sistema.traerTarjeta("111222").agregarViaje("colectivo 1",100, 0, LocalDate.of(2024, 10, 4)));
			System.out.println(sistema.traerTarjeta("111222").getSaldoActual());
		

}
}