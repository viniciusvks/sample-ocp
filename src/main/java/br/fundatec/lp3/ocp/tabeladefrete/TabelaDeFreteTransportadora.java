package br.fundatec.lp3.ocp.tabeladefrete;

import br.fundatec.lp3.ocp.Regiao;

public class TabelaDeFreteTransportadora implements TabelaDeFrete {

	@Override
	public double para(Regiao regiao) {

		switch(regiao) {

			case SUDESTE:
				return 10;
			case SUL:
				return 15;
			case NORDESTE:
				return 20;
			case NORTE:
				return 30;
			default:
				break;
		}

		return 20;
	}

}
