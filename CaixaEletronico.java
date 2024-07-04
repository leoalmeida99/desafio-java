import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CaixaEletronico ce = new CaixaEletronico();

		ContaBancaria contaLeonardo = ce.new ContaBancaria("Leonardo", 1001, 1000);
		ContaBancaria contaCleyton = ce.new ContaBancaria("Cleyton", 1002, 2000);

		int opcao = 10;

		while (opcao != 0) {
			imprimirMenu(contaLeonardo.getNomeTitular());

			opcao = retornaInteiroEntradaUsuario(sc);

			switch (opcao) {
			case 1: {
				contaLeonardo.consultarSaldo();
				break;
			}
			case 2: {
				System.out.println("Digite o valor que deseja depositar: ");
				double valorParaDepositar = retornaDoubleDigitadoUsuario(sc);
				contaLeonardo.depositar(valorParaDepositar);
				break;
			}
			case 3: {
				System.out.println("Digite o valor que deseja sacar: ");
				double valorParaSacar = retornaDoubleDigitadoUsuario(sc);
				contaLeonardo.sacar(valorParaSacar, false);
				break;
			}
			case 4: {
				System.out.println("Digite o valor que deseja transferir: ");
				double valorParaTransferir = retornaDoubleDigitadoUsuario(sc);
				contaLeonardo.transferir(valorParaTransferir, contaCleyton);
				break;
			}
			case 5: {
				contaLeonardo.imprimirTransacoes();
				break;
			}
			default:
				System.out.println("Até mais " + contaLeonardo.getNomeTitular());
				break;
			}
			
			if (opcao != 0) {
				System.out.println("Para continuar digite 6: ");
				int confirmarParaContinuar = retornaInteiroEntradaUsuario(sc);

				while (confirmarParaContinuar != 6) {
					System.out.println("Para continuar digite 6: ");
					confirmarParaContinuar = retornaInteiroEntradaUsuario(sc);
				}
			} 
		} 
	}

	private static void imprimirMenu(String nomeTitular) {
		System.out.println(String.format("""
				Olá %s!
				O que deseja fazer?
				1 - Consultar saldo
				2 - Depositar dinheiro
				3 - Sacar dinheiro
				4 - Transferir dinheiro para o Cleyton
				5 - Exibir Ùltimas Transações
				0 - Sair

				Digite uma opção:
				""", nomeTitular));
	}

	private static double retornaDoubleDigitadoUsuario(Scanner sc) {
		while (!sc.hasNextDouble()) {
			System.out.println("Entrada inválida! digite um valor: ");
			sc.next();
		}
		return sc.nextDouble();
	}

	private static int retornaInteiroEntradaUsuario(Scanner sc) {
		while (!sc.hasNextInt()) {
			System.out.println("Entrada inválida. Digite um número válido: ");
			sc.next();
		}
		return sc.nextInt();
	}

	public class ContaBancaria {
		private int numero;
		private double saldo;
		private String nomeTitular;
		private ArrayList<Transacao> transacoes;

		public ContaBancaria(String nomeTitular, int numero, double saldo) {
			this.numero = numero;
			this.saldo = saldo;
			this.nomeTitular = nomeTitular;
			transacoes = new ArrayList<Transacao>();
		}

		public void sacar(double valorParaSacar, boolean isTransferencia) {
			if (this.temSaldoSuficiente(this, valorParaSacar)) {
				this.saldo -= valorParaSacar;
				if (isTransferencia) {
					this.transacoes.add(new Transacao("Transferência", valorParaSacar, LocalDateTime.now()));
				} else {
					this.transacoes.add(new Transacao("Saque", valorParaSacar, LocalDateTime.now()));
				}
				return;
			}
			System.out.println("Saldo insuficiente para sacar");
		}

		public void depositar(double valorDeposito) {
			this.saldo += valorDeposito;
			this.transacoes.add(new Transacao("Deposito", valorDeposito, LocalDateTime.now()));
		}

		public void transferir(double valorParaTransferir, ContaBancaria outraConta) {
			if (this.temSaldoSuficiente(this, valorParaTransferir)) {
				this.sacar(valorParaTransferir, true);
				outraConta.depositar(valorParaTransferir);
				return;
			} else {
				System.out.println("Transferência negada, você não possui saldo suficiente.");
			}
		}

		public void imprimirTransacoes() {
			for (Transacao transacao : transacoes) {
				System.out.println("Tipo: " + transacao.getTipo() + ", Valor: " + transacao.getValor() + ", Data: "
						+ transacao.getData() + ", Hora: " + transacao.getHora());
			}
		}

		public void consultarSaldo() {
			System.out.println(String.format("Saldo disponível: %.2f", this.saldo));
		}

		private boolean temSaldoSuficiente(ContaBancaria conta, double valor) {
			if (valor > conta.getSaldo()) return false;
			return true;
		}

		public int getNumero() {
			return numero;
		}

		public double getSaldo() {
			return saldo;
		}

		public String getNomeTitular() {
			return nomeTitular;
		}
	}

	public class Transacao {
		private String tipo;
		private double valor;
		private LocalDateTime dataHora;

		public Transacao(String tipo, double valor, LocalDateTime dataHora) {
			this.tipo = tipo;
			this.valor = valor;
			this.dataHora = dataHora;
		}

		public String getTipo() {
			return tipo;
		}

		public double getValor() {
			return valor;
		}

		public String getData() {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			return this.dataHora.format(formatter);
		}

		public String getHora() {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
			return this.dataHora.format(formatter);
		}
	}
}