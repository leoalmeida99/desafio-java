import java.util.Scanner;

public class CalculadoraBasica {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double numero1 = entrada(sc);
		double numero2 = entrada(sc);

		while (numero2 == 0) { // para não dar problema de divisão por zero.
			System.out.println("O segundo número não pode ser zero!");
			numero2 = entrada(sc);
		}
		
		double soma = numero1 + numero2;
		double subtracao = numero1 - numero2;
		double multiplicacao = numero1 * numero2;
		double divisao = numero1 / numero2;
		System.out.println(String.format("%.2f + %.2f = %.2f", numero1, numero2, soma));
		System.out.println(String.format("%.2f - %.2f = %.2f", numero1, numero2, subtracao));
		System.out.println(String.format("%.2f x %.2f = %.2f", numero1, numero2, multiplicacao));
		System.out.println(String.format("%.2f / %.2f = %.2f", numero1, numero2, divisao));
	}

	private static double entrada(Scanner sc) {
		System.out.println("Digite um número: ");

		while (!sc.hasNextDouble()) {
			System.out.println("Entrada inválida. Digite um número válido: ");
			sc.next();
		}
		return sc.nextDouble();
	}
}