import java.util.Scanner;

public class CardapioLanchonete {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("***********Card�pio***************");
		System.out.println("C�digos e pre�os:\n\ncachorro-quente = 100 pre�o = R$1,20\n"
		+ "Bauru simples = 101 pre�o = R$1,30\nBauru com ovo = 102 pre�o = R$1,50 \n"
		+ "Hamb�rguer = 103 pre�o = R$1,20\nMisto Quente = 104 pre�o = R$1,30\n"
		+ "Refrigerante = 105 pre�o = R$1,00");
		
		System.out.println("********************************");

		System.out.print("C�digo do item: ");
		int codigo = entrada.nextInt();

		System.out.print("Quantidade do item: ");
		float quantidade = entrada.nextInt();

		double valorUnidade = 1;

		double valorPago = valorUnidade * quantidade;

		switch (codigo) {
		case 100:
			System.out.println("Cachorro-quente");
			valorPago *= 1.20;
			break;
		case 101:
			System.out.println("Bauru simples");
			valorPago *= 1.30;
			break;
		case 102:
			System.out.println("Bauru com ovo");
			valorPago *= 1.50;
			break;
		case 103:
			System.out.println("Hamburguer");
			valorPago *= 1.20;
			break;
		case 104:
			System.out.println("Misto quente");
			valorPago *= 1.30;
		case 105:
			System.out.println("Refrigerante");
			valorPago *= 1.00;
			break;
		default:
			System.out.println("Op��o inv�lida!");

		}

		System.out.printf("Total a pagar R$%.2f", valorPago);
		
		entrada.close();

	}

}
