package test;

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
	}

}
