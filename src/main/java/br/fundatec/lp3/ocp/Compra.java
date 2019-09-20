package br.fundatec.lp3.ocp;

public class Compra {

	private double valor;
	private Regiao regiao;
	private Pagamento pagamento;

	public Compra(double valor, Regiao regiao, Pagamento pagamento) {
		this.valor = valor;
		this.regiao = regiao;
		this.pagamento = pagamento;
	}

	public double getValor() {
		return valor;
	}

	public Regiao getRegiao() {
		return regiao;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	@Override
	public String toString() {
		return "valor: " + valor + ", regiao: " + regiao.name();
	}

}
