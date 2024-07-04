import java.util.Scanner;

public class ConversorDeMedidas {

	private static final int CELSIUS_PARA_FAHRENHEIT = 1;
	private static final int FAHRENHEIT_PARA_CELSIUS = 2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int escolha;
		do {
			imprimeMenu();
			escolha = retornaInteiroDigitadoPeloUsuario(sc);
		} while (escolha < CELSIUS_PARA_FAHRENHEIT || escolha > FAHRENHEIT_PARA_CELSIUS);


		if (escolha == CELSIUS_PARA_FAHRENHEIT) celsiusParaFahrenheit(sc);
		if (escolha == FAHRENHEIT_PARA_CELSIUS) fahrenheitParaCelsius(sc);
	}

	private static void celsiusParaFahrenheit(Scanner sc) {
		System.out.println("Digite a temperatura em Celsius: ");
		double temperaturaEmCelsius = retornaDoubleDigitadoPeloUsuario(sc);
		double temperaturaEmFahrenheit = retornaConversaoCelsiusParaFahrenheit(temperaturaEmCelsius);
		System.out.println(String.format("%.2f convertido para Fahrenheit é: %.2f", temperaturaEmCelsius, temperaturaEmFahrenheit));
	}

	private static void fahrenheitParaCelsius(Scanner sc) {
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double temperaturaEmFahrenheit = retornaDoubleDigitadoPeloUsuario(sc);
		double temperaturaEmCelsius = retornaConversaoFahrenheitParaCelsius(temperaturaEmFahrenheit);
		System.out.println(String.format("%.2f convertido para Celsius é: %.2f", temperaturaEmFahrenheit, temperaturaEmCelsius));
	}

	private static double retornaConversaoCelsiusParaFahrenheit(double temperaturaEmCelsius) {
		return (temperaturaEmCelsius * 9.0 / 5.0) + 32;
	}

	private static double retornaConversaoFahrenheitParaCelsius(double temperaturaEmFahrenheit) {
		return (5.0 / 9.0) * (temperaturaEmFahrenheit - 32);
	}

	private static int retornaInteiroDigitadoPeloUsuario(Scanner sc) {
		System.out.println("Digite um número inteiro: ");

		while (!sc.hasNextInt()) {
            imprimeMenu();
			System.out.println("Entrada inválida! digite um número inteiro: ");
			sc.next();
		}
		return sc.nextInt();
	}

	private static double retornaDoubleDigitadoPeloUsuario(Scanner sc) {
		while (!sc.hasNextDouble()) {
			System.out.println("Entrada inválida! digite uma temperatura: ");
			sc.next();
		}
		return sc.nextDouble();
	}

	private static void imprimeMenu() {
		System.out.println("""
				Escolha uma opção:
				1 - Celsius para Fahrenheit
				2 - Fahrenheit para Celsius
				""");
	}
}