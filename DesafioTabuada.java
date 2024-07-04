import java.util.Scanner;

public class DesafioTabuada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = entrada(sc);
		for (int i = 1; i <= 10; i++) {
			System.out.println(String.format("%d X %d = %d ", i, numero, numero * i));
		}
	}
	
	private static int entrada(Scanner sc) {
		System.out.println("Digite um número inteiro: ");

		while (!sc.hasNextInt()) {
			System.out.println("Entrada inválida. Digite um número válido: ");
			sc.next();
		}
		return sc.nextInt();
	}
}