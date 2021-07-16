/* Projeto Java - Grupo 06 
 * Autores: Anny Sena, Fernanda Correia, Gabriel Almeida, Gabriel Reis, João Pedro. 
 * Data última atualização: 13/07/21
 */

package br.com.generation.projeto;

public class AparelhosDomesticos {
	
	private String nomeAparelho;
	private double horario;
	private double minuto;
	private int quantidade;
	private double energiaWh;

	public AparelhosDomesticos(String nomeAparelho) {
		super();
		this.nomeAparelho = nomeAparelho;
	}
	
	public double getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	public double getMinuto() {
		return minuto / 60; // Transformação do minuto em horas para facilitar o cálculo do Wh
	}

	public void setMinuto(double minuto) {
		this.minuto = minuto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getEnergiaWh() {
		return energiaWh;
	}

	public void setEnergiaWh(double energiaWh) {
		this.energiaWh = energiaWh;
	}
	
	public String toString() {
		return this.nomeAparelho;
	}
}