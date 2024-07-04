import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
	static final int MAXIMO = 100;
	static final int TENTATIVAS = 5;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int numeroAleatorio = random.nextInt(MAXIMO) + 1;
		int contTentativas = 1;
		int palpite;
		boolean vencedor = false;

		for (contTentativas = 1; contTentativas <= TENTATIVAS; contTentativas++) {
			palpite = retornaPalpiteDoUsuario(sc);
			if (palpite == numeroAleatorio) {
				vencedor = true;
				break;
			} else {
				if (contTentativas == TENTATIVAS) break;
				if (palpite > numeroAleatorio) {
					System.out.println("O número secreto é menor");
				} else {
					System.out.println("O número secreto é maior");
				}
			}
		}

		if (vencedor) {
			System.out.println(
					String.format("Parabéns! você acertou o número secreto com %d tentativas", contTentativas));
		} else {
			System.out.println(
					String.format("Você perdeu! não conseguiu acertar o número secreto com %d tentativas, o número secreto é: %d", TENTATIVAS, numeroAleatorio));
		}
	}

	private static int retornaPalpiteDoUsuario(Scanner sc) {
		System.out.println(String.format("Digite um número inteiro entre 1 e %d", MAXIMO));
		int numero;
		while (true) {
			if (sc.hasNextInt()) {
				numero = sc.nextInt();
				if (numero >= 1 && numero <= MAXIMO) {
					return numero;
				} else {
					System.out.println("Número fora do intervalo entre 1 e 100, digite novamente: ");
				}
			} else {
				System.out.println(String.format("Entrada inválida, digite um número inteiro entre 1 e %d", MAXIMO));
				sc.next();
			}
		}
	}
}