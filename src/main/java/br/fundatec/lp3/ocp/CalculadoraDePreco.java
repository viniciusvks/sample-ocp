package br.fundatec.lp3.ocp;

import br.fundatec.lp3.ocp.tabeladefrete.TabelaDeFrete;
import br.fundatec.lp3.ocp.tabeladepreco.TabelaDePreco;

public class CalculadoraDePreco {

	public double calcula(Compra compra) {

		TabelaDePreco tabelaPreco = compra.getPagamento().getTabelaDePreco();
		TabelaDeFrete tabelaFrete = compra.getRegiao().getTabelaDeFrete();

		double desconto = tabelaPreco.descontoPara(compra.getValor());
		double precoFrete = tabelaFrete.para(compra.getRegiao());

		return compra.getValor() * (1-desconto) + precoFrete;

	}

}
