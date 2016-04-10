package testArea;

/**
 * Implementa la siguiente jerarquía de clases: Clase abstracta FiguraCerrada:
 * Campo dimension1 (decimal) Campo dimension2 (decimal) Constructor con ambos
 * campos como parámetros Método abstracto calcularArea(); Clase Rectangulo que
 * hereda de FiguraCerrada Clase Triangulo que hereda de FiguraCerrada Clase
 * TestArea Método main que: Cree una lista de figuras Se le añadirán 5
 * triángulos y 5 rectángulos. Las dimensiones serán aleatorias. Muestre
 * aquellas figuras con área mayor de 20 Contesta a las siguientes preguntas:
 * ¿Por qué has tenido que crear una clase abstracta? ¿Se puede crear una
 * instancia de FiguraCerrada?¿Por qué? ¿Puede invocarse en una clase abstracta
 * al método abstracto? Para comprobarlo, sobreescribe el método toString() e
 * invoca al método calcularArea() para que te muestre el área de la figura
 * además de las dimensiones
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class Rectangulo extends FiguraCerrada {

	public Rectangulo(double dimension1, double dimension2) {
		super(dimension1, dimension2);
	}

	@Override
	double calcularArea() {
		return getDimension1() * getDimension2();
	}

	@Override
	public String toString() {
		return "Rectangulo " + super.toString();
	}

}
