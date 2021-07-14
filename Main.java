/* Projeto Java - Grupo 06 
 * Autores: Anny Sena, Fernanda Correia, Gabriel Almeida, Gabriel Reis, João Pedro. 
 * Data última atualização: 13/07/21
 */

package br.com.generation.projeto;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);	
		ArrayList<AparelhosDomesticos> aparelhos = new ArrayList<>();
		
		AparelhosDomesticos geladeira = new AparelhosDomesticos("(1) Geladeira");
		AparelhosDomesticos microondas = new AparelhosDomesticos("(2) Forno Microondas");
		AparelhosDomesticos fogaoeletrico = new AparelhosDomesticos("(3) Fogão Elétrico");
		AparelhosDomesticos televisao = new AparelhosDomesticos("(4) Televisão");
		AparelhosDomesticos maquinalavar = new AparelhosDomesticos("(5) Máquina Lavar");
		AparelhosDomesticos ventilador = new AparelhosDomesticos("(6) Ventilador");
		AparelhosDomesticos computador = new AparelhosDomesticos("(7) Computador");
		AparelhosDomesticos notebook = new AparelhosDomesticos("(8) Notebook");
		AparelhosDomesticos carregadorcelular = new AparelhosDomesticos("(9) Carregador de celular");
		AparelhosDomesticos chuveiro = new AparelhosDomesticos("(10) Chuveiro");
	
		aparelhos.add(geladeira);
		aparelhos.add(microondas);
		aparelhos.add(fogaoeletrico);
		aparelhos.add(televisao);
		aparelhos.add(maquinalavar);
		aparelhos.add(ventilador);
		aparelhos.add(computador);
		aparelhos.add(notebook);
		aparelhos.add(carregadorcelular);
		aparelhos.add(chuveiro);
		
		double total = 0, total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0, total6 = 0, total7 = 0,
				total8 = 0, total9 = 0, total10 = 0;

		char resposta = 's';
		
		System.out.println("____________________________________(Eco Count)____________________________________");
		System.out.println(" Selecione o(s) item(s) abaixo para o cálculo do gasto energético de sua residência: ");

		do {
			if (resposta == 's' || resposta == 'S' || resposta == 'n' || resposta == 'N') {
				for(int i = 0; i < aparelhos.size(); i++) {
					System.out.println(aparelhos.get(i));
				}
				System.out.println("___________________________________________________________________________________");
				System.out.print("----> Selecione o número correspondente ao eletrodomestico: ");
				int item = ler.nextInt();

				if (item >= 0 && item < 11) {
					switch (item) {
					case 1:
						System.out.print("\nQuantas geladeiras você tem na sua casa? ");
						geladeira.setQuantidade(ler.nextInt());
						System.out.print("\nHoras gastas por dias: ");
						geladeira.setHorario(ler.nextInt());
						System.out.print("\nE os minutos gastos? ");
						geladeira.setMinuto(ler.nextDouble());
						geladeira.setEnergiaWh(250);
						total1 = geladeira.getQuantidade() * (geladeira.getHorario() + geladeira.getMinuto()) * geladeira.getEnergiaWh();
						aparelhos.remove(geladeira);
						break;

					case 2:
						System.out.print("\nQuantos microondas você tem na sua casa? ");
						microondas.setQuantidade(ler.nextInt());
						System.out.print("\nHoras gastas por dias: ");
						microondas.setHorario(ler.nextInt());
						System.out.print("\nE os minutos gastos? ");
						microondas.setMinuto(ler.nextDouble());
						microondas.setEnergiaWh(2000);
						total2 = microondas.getQuantidade() * (microondas.getHorario() + microondas.getMinuto()) * microondas.getEnergiaWh();
						aparelhos.remove(microondas);
						break;

					case 3:
						System.out.print("\nQuantos fogões elétricos você tem na sua casa? ");
						fogaoeletrico.setQuantidade(ler.nextInt());
						System.out.print("\nHoras gastas por dia: ");
						fogaoeletrico.setHorario(ler.nextInt());
						System.out.print("\nE os minutos gastos? ");
						fogaoeletrico.setMinuto(ler.nextDouble());
						fogaoeletrico.setEnergiaWh(6000);
						total3 = fogaoeletrico.getQuantidade() * (fogaoeletrico.getHorario() + fogaoeletrico.getMinuto())* fogaoeletrico.getEnergiaWh();
						aparelhos.remove(fogaoeletrico);
						break;

					case 4:
						System.out.print("\nQuantas televisões você tem na sua casa? ");
						televisao.setQuantidade(ler.nextInt());
						System.out.print("\nHoras gastas por dia: ");
						televisao.setHorario(ler.nextInt());
						System.out.print("\nE os minutos gastos? ");
						televisao.setMinuto(ler.nextDouble());
						televisao.setEnergiaWh(150);
						total4 = televisao.getQuantidade() * (televisao.getHorario() + televisao.getMinuto()) * televisao.getEnergiaWh();
						aparelhos.remove(televisao);
						break;

					case 5:
						System.out.print("\nQuantas maquina lavar você tem na sua casa? ");
						maquinalavar.setQuantidade(ler.nextInt());
						System.out.print("\nHoras gastas por dia: ");
						maquinalavar.setHorario(ler.nextInt());
						System.out.print("\nE os minutos gastos? ");
						maquinalavar.setMinuto(ler.nextDouble());
						maquinalavar.setEnergiaWh(1000);
						total5 = maquinalavar.getQuantidade() * (maquinalavar.getHorario() + maquinalavar.getMinuto()) * maquinalavar.getEnergiaWh();
						aparelhos.remove(maquinalavar);
						break;

					case 6:
						System.out.print("\nQuantos ventiladores você tem na sua casa? ");
						ventilador.setQuantidade(ler.nextInt());
						System.out.print("\nHoras gastas por dia: ");
						ventilador.setHorario(ler.nextInt());
						System.out.print("\nE os minutos gastos? ");
						ventilador.setMinuto(ler.nextDouble());
						ventilador.setEnergiaWh(70);
						total6 = ventilador.getQuantidade() * (ventilador.getHorario() + ventilador.getMinuto()) * ventilador.getEnergiaWh();
						aparelhos.remove(ventilador);
						break;

					case 7:
						System.out.print("\nQuantos computadores você tem na sua casa? ");
						computador.setQuantidade(ler.nextInt());
						System.out.print("\nHoras gastas por dia: ");
						computador.setHorario(ler.nextInt());
						System.out.print("\nE os minutos gastos? ");
						computador.setMinuto(ler.nextDouble());
						computador.setEnergiaWh(170);
						total7 = computador.getQuantidade() * (computador.getHorario() + computador.getMinuto()) * computador.getEnergiaWh();
						aparelhos.remove(computador);
						break;

					case 8:
						System.out.print("\nQuantos notebooks você tem na sua casa? ");
						notebook.setQuantidade(ler.nextInt());
						System.out.print("\nHoras gastas por dia: ");
						notebook.setHorario(ler.nextInt());
						System.out.print("\nE os minutos gastos? ");
						notebook.setMinuto(ler.nextDouble());
						notebook.setEnergiaWh(40);
						total8 = notebook.getQuantidade() * (notebook.getHorario() + notebook.getMinuto()) * notebook.getEnergiaWh();
						aparelhos.remove(notebook);
						break;

					case 9:
						System.out.print("\nQuantos carregadores de celular você tem na sua casa? ");
						carregadorcelular.setQuantidade(ler.nextInt());
						System.out.print("\nHoras gastas por dia carregando: ");
						carregadorcelular.setHorario(ler.nextInt());
						System.out.print("\nE os minutos gastos? ");
						carregadorcelular.setMinuto(ler.nextDouble());				
						carregadorcelular.setEnergiaWh(4);
						total9 = carregadorcelular.getQuantidade() * (carregadorcelular.getHorario() + carregadorcelular.getMinuto())* carregadorcelular.getEnergiaWh();
						aparelhos.remove(carregadorcelular);
						break;
						
					case 10:
						System.out.print("\nQuantos chuveiros você tem na sua casa? ");
						chuveiro.setQuantidade(ler.nextInt());
						System.out.print("\nHoras gastas por dia no chuveiro: ");
						chuveiro.setHorario(ler.nextInt());
						System.out.print("\nE os minutos gastos? ");
						chuveiro.setMinuto(ler.nextDouble());				
						chuveiro.setEnergiaWh(5250);
						total10 = chuveiro.getQuantidade() * (chuveiro.getHorario() + chuveiro.getMinuto())* chuveiro.getEnergiaWh();
						aparelhos.remove(chuveiro);
						break;			
					}
				}
				else {
					System.out.println("Item inserido inválido, por favor, insira novamente!");
				}
				System.out.println("Deseja adicionar mais itens? (S/N) ");
				resposta = ler.next().charAt(0);
				System.out.println("___________________________________________________________________________________\n");
			}
			else {
				System.out.println("Caractere inválido, programa encerrado.");
				break;
			}
		} while (resposta != 'n' && resposta != 'N');

		total = (total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9 + total10)/1000;
		
		System.out.println("A média do total de energia gasta diária é de: " + total + " kWh");
		System.out.printf("O custo desse gasto de energia é de: R$ %.2f", (total * 0.534));
		ler.close();
	}
}