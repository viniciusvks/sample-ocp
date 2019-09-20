package br.fundatec.lp3.ocp;

import br.fundatec.lp3.ocp.tabeladefrete.TabelaDeFreteCorreios;
import br.fundatec.lp3.ocp.tabeladepreco.TabelaDePrecoPadrao;

public class CalculadoraDePreco {

	public double calcula(Compra compra) {

		TabelaDePrecoPadrao tabelaPreco = new TabelaDePrecoPadrao();
		TabelaDeFreteCorreios tabelaFrete = new TabelaDeFreteCorreios();

		double desconto = tabelaPreco.descontoPara(compra.getValor());
		double precoFrete = tabelaFrete.para(compra.getRegiao());

		return compra.getValor() * (1-desconto) + precoFrete;

	}

}
