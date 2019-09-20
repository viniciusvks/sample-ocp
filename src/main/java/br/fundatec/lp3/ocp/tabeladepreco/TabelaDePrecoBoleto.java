package br.fundatec.lp3.ocp.tabeladepreco;

public class TabelaDePrecoBoleto implements TabelaDePreco {

	@Override
	public double descontoPara(double valor) {
		return 0.10;
	}

}
