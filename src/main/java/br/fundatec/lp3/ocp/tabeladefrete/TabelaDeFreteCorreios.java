package br.fundatec.lp3.ocp.tabeladefrete;

import br.fundatec.lp3.ocp.Regiao;

public class TabelaDeFreteCorreios implements TabelaDeFrete {

	@Override
	public double para(Regiao regiao) {

		switch(regiao) {

			case SUDESTE:
				return 15;
			case SUL:
				return 12;
			case NORDESTE:
				return 30;
			case NORTE:
				return 25;
			default:
				break;
		}

		return 30;
	}

}
