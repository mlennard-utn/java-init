package ejemplo;

public class CondicionIf {

	public static void main(String[] args) {
		int valor = 5;
		if(valor < 0) {
			System.out.println("es negativo");
		} else if (valor > 0) {
			System.out.println("es positivo");
		} else {
			System.out.println("es un cero");
		}
		System.out.println("El valor es: " + valor + " <- ese fue valor");
	}

}
