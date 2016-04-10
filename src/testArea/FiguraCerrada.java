package testArea;

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
