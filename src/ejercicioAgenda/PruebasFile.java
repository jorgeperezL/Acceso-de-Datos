/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioAgenda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luis
 */
public class PruebasFile {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int opcion = EntradaSalida.mostrarMenu();
		while (opcion != 3) {
			switch (opcion) {
			case 1:// Insertar contacto
				Contacto c = EntradaSalida.pedirContacto();
				AccesoFichero.grabarContacto(c);
				break;
			case 2:
				ArrayList<Contacto> lista_contactos = AccesoFichero.obtenerContactos();// Los lee de fichero
				EntradaSalida.mostrarContactos(lista_contactos);
				break;
			}
			opcion = EntradaSalida.mostrarMenu();
		}
	}
}
