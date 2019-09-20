package br.fundatec.lp3.ocp.tabeladepreco;

public class TabelaDePrecoCartaoDeCredito implements TabelaDePreco {

	@Override
	public double descontoPara(double valor) {
		return 0.20;
	}

}
