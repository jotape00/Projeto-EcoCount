/* Projeto Java - Grupo 6 
 * Autores: Anny Sena, Fernanda Correia, Gabriel Almeida, Gabriel Reis, Jo�o Pedro. 
 * Data ultima atualiza��o: 12/07/21
 */


package projetoCalculoEnergia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		AparelhosDomesticos geladeira = new AparelhosDomesticos();
		AparelhosDomesticos microondas = new AparelhosDomesticos();
		AparelhosDomesticos fogaoeletrico = new AparelhosDomesticos();
		AparelhosDomesticos televisao = new AparelhosDomesticos();
		AparelhosDomesticos maquinalavar = new AparelhosDomesticos();
		AparelhosDomesticos ventilador = new AparelhosDomesticos();
		AparelhosDomesticos computador = new AparelhosDomesticos();
		AparelhosDomesticos notebook = new AparelhosDomesticos();
		AparelhosDomesticos carregadorcelular = new AparelhosDomesticos();

		double total = 0, total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0, total6 = 0, total7 = 0,
				total8 = 0, total9 = 0;

		int i = 0;
		char resposta = 's';
		System.out.println("___________________________________(ECO COUNT)______________________________________");
		System.out.println(" Selecione o(s) item(s) abaixo para o c�lculo do gasto energ�tico de sua resid�ncia: ");

		do {
			if (resposta == 's' || resposta == 'S' || resposta == 'n' || resposta == 'N') {
				System.out.println("\n1- Geladeira" + "\n2- Micro-ondas" + "\n3- Forno El�trico" + "\n4- Televis�o"
						+ "\n5- M�quina de lavar" + "\n6- Ventilador" + "\n7- Desktop (Computador)" + "\n8- Notebook"
						+ "\n9- Carregador de celular");
				System.out
						.println("___________________________________________________________________________________");
				System.out.print("----> Selecione o eletrodomestico: ");
				i = ler.nextInt();

				if (i >= 0 && i < 10) {
					switch (i) {
					case 1:
						System.out.print("\nQuantas geladeiras voc� tem na sua casa? ");
						geladeira.setQuantidade(ler.nextInt());
						System.out.print("\nHoras gastas por dia: ");
						geladeira.setHorario(ler.nextInt());
						System.out.print("\nE os minutos gastos? ");
						geladeira.setMinuto(ler.nextDouble());
						geladeira.setEnergiaWh(250);
						total1 = geladeira.getQuantidade() * (geladeira.getHorario() + geladeira.getMinuto())
								* geladeira.getEnergiaWh();
						break;

					case 2:
						System.out.print("\nQuantos micro-ondas voc� tem na sua casa? ");
						microondas.setQuantidade(ler.nextInt());
						System.out.print("\nHoras gastas por dia: ");
						microondas.setHorario(ler.nextInt());
						System.out.print("\nE os minutos gastos? ");
						microondas.setMinuto(ler.nextDouble());
						microondas.setEnergiaWh(2000);
						total2 = microondas.getQuantidade() * (microondas.getHorario() + microondas.getMinuto())
								* microondas.getEnergiaWh();
						// microondas.totalGastoAparelho();
						break;

					case 3:
						System.out.print("\nQuantos fog�es el�tricos voc� tem na sua casa? ");
						fogaoeletrico.setQuantidade(ler.nextInt());
						System.out.print("\nHoras gastas por dia: ");
						fogaoeletrico.setHorario(ler.nextInt());
						System.out.print("\nE os minutos gastos? ");
						fogaoeletrico.setMinuto(ler.nextDouble());
						fogaoeletrico.setEnergiaWh(6000);
						// fogaoeletrico.totalGastoAparelho();
						total3 = fogaoeletrico.getQuantidade()
								* (fogaoeletrico.getHorario() + fogaoeletrico.getMinuto())
								* fogaoeletrico.getEnergiaWh();
						break;

					case 4:
						System.out.print("\nQuantas televis�es voc� tem na sua casa? ");
						televisao.setQuantidade(ler.nextInt());
						System.out.print("\nHoras gastas por dia: ");
						televisao.setHorario(ler.nextInt());
						System.out.print("\nE os minutos gastos? ");
						televisao.setMinuto(ler.nextDouble());
						televisao.setEnergiaWh(150);
						total4 = televisao.getQuantidade() * (televisao.getHorario() + televisao.getMinuto())
								* televisao.getEnergiaWh();
						// televisao.totalGastoAparelho();
						break;

					case 5:
						System.out.print("\nQuantas maquinas de lavar voc� tem na sua casa? ");
						maquinalavar.setQuantidade(ler.nextInt());
						System.out.print("\nHoras gastas por dia: ");
						maquinalavar.setHorario(ler.nextInt());
						System.out.print("\nE os minutos gastos? ");
						maquinalavar.setMinuto(ler.nextDouble());
						maquinalavar.setEnergiaWh(1000);
						total5 = maquinalavar.getQuantidade() * (maquinalavar.getHorario() + maquinalavar.getMinuto())
								* maquinalavar.getEnergiaWh();
						break;

					case 6:
						System.out.print("\nQuantos ventiladores voc� tem na sua casa? ");
						ventilador.setQuantidade(ler.nextInt());
						System.out.print("\nHoras gastas por dia: ");
						ventilador.setHorario(ler.nextInt());
						System.out.print("\nE os minutos gastos? ");
						ventilador.setMinuto(ler.nextDouble());
						ventilador.setEnergiaWh(70);
						total6 = ventilador.getQuantidade() * (ventilador.getHorario() + ventilador.getMinuto())
								* ventilador.getEnergiaWh();
						break;

					case 7:
						System.out.print("\nQuantos computadores voc� tem na sua casa? ");
						computador.setQuantidade(ler.nextInt());
						System.out.print("\nHoras gastas por dia: ");
						computador.setHorario(ler.nextInt());
						System.out.print("\nE os minutos gastos? ");
						computador.setMinuto(ler.nextDouble());
						computador.setEnergiaWh(170);
						total7 = computador.getQuantidade() * (computador.getHorario() + computador.getMinuto())
								* computador.getEnergiaWh();
						break;

					case 8:
						System.out.print("\nQuantos notebooks voc� tem na sua casa? ");
						notebook.setQuantidade(ler.nextInt());
						System.out.print("\nHoras gastas por dia: ");
						notebook.setHorario(ler.nextInt());
						System.out.print("\nE os minutos gastos? ");
						notebook.setMinuto(ler.nextDouble());
						notebook.setEnergiaWh(40);
						total8 = notebook.getQuantidade() * (notebook.getHorario() + notebook.getMinuto())
								* notebook.getEnergiaWh();
						break;

					case 9:
						System.out.print("\nQuantos carregadores de celular voc� tem na sua casa? ");
						carregadorcelular.setQuantidade(ler.nextInt());
						System.out.print("\nHoras gastas por dia: ");
						carregadorcelular.setHorario(ler.nextInt());
						System.out.print("\nE os minutos gastos? ");
						carregadorcelular.setMinuto(ler.nextDouble());
						carregadorcelular.setEnergiaWh(7);
						total9 = carregadorcelular.getQuantidade()
								* (carregadorcelular.getHorario() + carregadorcelular.getMinuto())
								* carregadorcelular.getEnergiaWh();
						break;
					}
				} else {
					System.out.println("Item inserido inv�lido, por favor, insira novamente!");
				}
				System.out.println("Deseja adicionar mais itens? (S/N) ");
				resposta = ler.next().charAt(0);
			} else {
				System.out.println("Caractere inv�lido, programa encerrado.");
				break;
			}
		} while (resposta != 'n' && resposta != 'N');

		total = (total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9) / 1000;
		System.out.println("A m�dia total de energia gasta di�ria � de: " + (total) + " kWh");
		System.out.printf("O valor gasto em m�dia por dia � de: R$ %.2f", (total * 0.534));
		ler.close();
	}
}