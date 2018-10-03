package ejemploParseo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.*;
import java.util.*;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Usuario
 */

public class AccesoFichero {
	
	private static String ruta = "C:\\agenda\\xml.xml";

	private static String separador = ";";

	public static void leerFicheroXML() {

		try {
			SAXBuilder saxBuilder = new SAXBuilder();
			Document document = saxBuilder.build(new File(ruta));
			parsearXML(document);
		} catch (JDOMException ex) {
			Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private static void parsearXML(Document document) {
		Element raiz = document.getRootElement();
		List<Element> lista_elementos = raiz.getChildren("alumno");
		for (int i = 0; i < lista_elementos.size(); i++) {
			Element elemento_alumno = lista_elementos.get(i);
			Element elemento_nombre = elemento_alumno.getChild("nombre");
			Element elemento_edad = elemento_alumno.getChild("edad");
			System.out.println("Nombre: " + elemento_nombre.getText() + " Edad: " + elemento_edad.getText());
		}
	}
	public static void main(String[] args) {
		AccesoFichero.leerFicheroXML();
	}
}

