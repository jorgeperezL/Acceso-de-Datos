package ejercicioAgenda;

import java.util.ArrayList;
import java.util.Scanner;

public class EntradaSalida {
	static Scanner sc = new Scanner(System.in);

	public static int mostrarMenu() {
		System.out.println("1-Insertar contacto");
		System.out.println("2-Listar contactos");
		System.out.println("3-Salir");
		int opcion = sc.nextInt();
		sc.nextLine();
		return opcion;
	}

	public static Contacto pedirContacto() {
		System.out.println("Introduce el nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduce el telefono");
		String telefono = sc.nextLine();
		Contacto c = new Contacto(nombre, telefono);
		return c;
	}

	static void mostrarContactos(ArrayList<Contacto> lista_contactos) {
		for (int i = 0; i < lista_contactos.size(); i++) {
			Contacto c = lista_contactos.get(i);
			System.out.println("CONTACTO: " + c.getNombre() + " " + c.getTelefono());
		}
	}
}
