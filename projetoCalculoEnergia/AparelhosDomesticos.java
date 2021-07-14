package projetoCalculoEnergia;

public class AparelhosDomesticos  {

	private double horario;
	private double minuto;
	private int quantidade;
	private double energiaWh;

	private double totalEnergiaAparelho;
	private double totalEnergia = 0;

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

	public void setEnergiaWh(double energiakWh) {
		this.energiaWh = energiakWh;
	}

	double totalGastoAparelho() {
		return this.totalEnergiaAparelho = getHorario() * getQuantidade() * getEnergiaWh();
	}

	double totalGasto() {
		return this.totalEnergia += totalEnergiaAparelho;
	}
}