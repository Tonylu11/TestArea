package testArea;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Implementa la siguiente jerarqu�a de clases: Clase abstracta FiguraCerrada:
 * Campo dimension1 (decimal) Campo dimension2 (decimal) Constructor con ambos
 * campos como par�metros M�todo abstracto calcularArea(); Clase Rectangulo que
 * hereda de FiguraCerrada Clase Triangulo que hereda de FiguraCerrada Clase
 * TestArea M�todo main que: Cree una lista de figuras Se le a�adir�n 5
 * tri�ngulos y 5 rect�ngulos. Las dimensiones ser�n aleatorias. Muestre
 * aquellas figuras con �rea mayor de 20 Contesta a las siguientes preguntas:
 * �Por qu� has tenido que crear una clase abstracta? �Se puede crear una
 * instancia de FiguraCerrada?�Por qu�? �Puede invocarse en una clase abstracta
 * al m�todo abstracto? Para comprobarlo, sobreescribe el m�todo toString() e
 * invoca al m�todo calcularArea() para que te muestre el �rea de la figura
 * adem�s de las dimensiones
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class TestArea {
	public static void main(String[] args) {
		ArrayList<FiguraCerrada> listaFiguras = new ArrayList<FiguraCerrada>();
		listaFiguras.add(new Triangulo(Math.random() * 10, Math.random() * 10));
		listaFiguras.add(new Triangulo(Math.random() * 10, Math.random() * 10));
		listaFiguras.add(new Triangulo(Math.random() * 10, Math.random() * 10));
		listaFiguras.add(new Triangulo(Math.random() * 10, Math.random() * 10));
		listaFiguras.add(new Triangulo(Math.random() * 10, Math.random() * 10));
		listaFiguras.add(new Rectangulo(Math.random() * 10, Math.random() * 10));
		listaFiguras.add(new Rectangulo(Math.random() * 10, Math.random() * 10));
		listaFiguras.add(new Rectangulo(Math.random() * 10, Math.random() * 10));
		listaFiguras.add(new Rectangulo(Math.random() * 10, Math.random() * 10));
		listaFiguras.add(new Rectangulo(Math.random() * 10, Math.random() * 10));
		Iterator<FiguraCerrada> it = listaFiguras.iterator();
		while (it.hasNext()) {
			FiguraCerrada figuraCerrada = it.next();
			double area = figuraCerrada.calcularArea();
			if (area > 20)
				System.out.println(figuraCerrada);
		}
	}
}
