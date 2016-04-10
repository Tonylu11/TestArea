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
public abstract class FiguraCerrada {
	/**
	 * Base de la figura.
	 */
	private double dimension1;
	/**
	 * Altura de la figura.
	 */
	private double dimension2;

	public FiguraCerrada(double dimension1, double dimension2) {
		setDimension1(dimension1);
		setDimension2(dimension2);
	}

	protected double getDimension1() {
		return dimension1;
	}

	private void setDimension1(double dimension1) {
		this.dimension1 = dimension1;
	}

	protected double getDimension2() {
		return dimension2;
	}

	private void setDimension2(double dimension2) {
		this.dimension2 = dimension2;
	}

	abstract double calcularArea();

	@Override
	public String toString() {
		return "Figura Cerrada: \n\tBase:" + dimension1 + " \n\tAltura:" + dimension2 + " \n\tArea: " + calcularArea();
	}

}
