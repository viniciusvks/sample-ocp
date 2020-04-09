package br.fundatec.lp3.ocp;

import br.fundatec.lp3.ocp.tabeladefrete.TabelaDeFreteCorreios;

public class CalculadoraDePreco {

	public double calcula(Compra compra) {

		double valor = compra.getValor();
		Pagamento pagamento = compra.getPagamento();

		if (pagamento.equals(Pagamento.BOLETO)) {
			valor *= 0.90;
		}

		TabelaDeFreteCorreios tabelaFrete = new TabelaDeFreteCorreios();

		double precoFrete = tabelaFrete.para(compra.getRegiao());
		double valorFinal = valor + precoFrete;

		return valorFinal;

	}

}
