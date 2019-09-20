package br.fundatec.lp3.ocp;

import br.fundatec.lp3.ocp.tabeladepreco.TabelaDePreco;
import br.fundatec.lp3.ocp.tabeladepreco.TabelaDePrecoBoleto;
import br.fundatec.lp3.ocp.tabeladepreco.TabelaDePrecoCartaoDeCredito;
import br.fundatec.lp3.ocp.tabeladepreco.TabelaDePrecoPadrao;

public enum Pagamento {

	BOLETO(new TabelaDePrecoBoleto()),
	CARTAO(new TabelaDePrecoCartaoDeCredito()),
	PADRAO(new TabelaDePrecoPadrao());

	private TabelaDePreco tabelaDePreco;

	Pagamento(TabelaDePreco tabelaDePreco) {
		this.tabelaDePreco = tabelaDePreco;
	}

	public TabelaDePreco getTabelaDePreco() {
		return tabelaDePreco;
	}
}
