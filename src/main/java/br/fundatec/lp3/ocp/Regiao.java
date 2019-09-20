package br.fundatec.lp3.ocp;

import br.fundatec.lp3.ocp.tabeladefrete.TabelaDeFrete;
import br.fundatec.lp3.ocp.tabeladefrete.TabelaDeFreteCorreios;
import br.fundatec.lp3.ocp.tabeladefrete.TabelaDeFreteTransportadora;

public enum Regiao {

	SUL(new TabelaDeFreteCorreios()),
	SUDESTE(new TabelaDeFreteTransportadora()),
	NORTE(new TabelaDeFreteCorreios()),
	NORDESTE(new TabelaDeFreteTransportadora());

	private Regiao(TabelaDeFrete tabelaDeFrete) {
		this.tabelaDeFrete = tabelaDeFrete;
	}

	private TabelaDeFrete tabelaDeFrete;

	public TabelaDeFrete getTabelaDeFrete() {
		return tabelaDeFrete;
	}


}
