import java.util.Scanner;

public class factorial {
	public static double factorial(double numero) {
		if (numero == 0) {
			return 1;
		} else {
			double resultat = numero * factorial(numero - 1);
			return resultat;
		}
	}

	public static void main(String[] args) {
		System.out.println("Introdueix un numero: ");
		Scanner scan = new Scanner(System.in);
		System.out.println(factorial(scan.nextInt()));
	}

}

