package br.fundatec.lp3.ocp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.fundatec.lp3.ocp.tabeladefrete.TabelaDeFreteCorreios;
import br.fundatec.lp3.ocp.tabeladefrete.TabelaDeFreteTransportadora;
import br.fundatec.lp3.ocp.tabeladepreco.TabelaDePrecoBoleto;
import br.fundatec.lp3.ocp.tabeladepreco.TabelaDePrecoCartaoDeCredito;
import br.fundatec.lp3.ocp.tabeladepreco.TabelaDePrecoPadrao;

public class CalculadoraDePrecoTest {

	@Test
	public void testValorParaSulComPagamentoPadrao() {

        Compra compra = new Compra(1000.0, Regiao.SUL, Pagamento.PADRAO);
        CalculadoraDePreco calculadoraDePreco = new CalculadoraDePreco();

        double valorCalculado = calculadoraDePreco.calcula(compra);
        double valorFinalEsperado = calculaPrecoEsperado(compra);

        assertEquals(valorFinalEsperado, valorCalculado, 0);

	}

	@Test
	public void testValorParaSudesteComPagamentoPadrao() {

        Compra compra = new Compra(1000.0, Regiao.SUDESTE, Pagamento.PADRAO);
        CalculadoraDePreco calculadoraDePreco = new CalculadoraDePreco();

        double valorCalculado = calculadoraDePreco.calcula(compra);
        double valorFinalEsperado = calculaPrecoEsperado(compra);

        assertEquals(valorFinalEsperado, valorCalculado, 0);

	}

	@Test
	public void testValorParaNorteComPagamentoPadrao() {

        Compra compra = new Compra(1000.0, Regiao.NORTE, Pagamento.PADRAO);
        CalculadoraDePreco calculadoraDePreco = new CalculadoraDePreco();

        double valorCalculado = calculadoraDePreco.calcula(compra);
        double valorFinalEsperado = calculaPrecoEsperado(compra); //1025.0;

        assertEquals(valorFinalEsperado, valorCalculado, 0);

	}

	@Test
	public void testValorParaNordesteComPagamentoPadrao() {

        Compra compra = new Compra(1000.0, Regiao.NORDESTE, Pagamento.PADRAO);
        CalculadoraDePreco calculadoraDePreco = new CalculadoraDePreco();

        double valorCalculado = calculadoraDePreco.calcula(compra);
        double valorFinalEsperado = calculaPrecoEsperado(compra); //1020.0

        assertEquals(valorFinalEsperado, valorCalculado, 0);

	}

	@Test
	public void testValorParaSulComPagamentoCartao() {

        Compra compra = new Compra(1000.0, Regiao.SUL, Pagamento.CARTAO);
        CalculadoraDePreco calculadoraDePreco = new CalculadoraDePreco();

        double valorCalculado = calculadoraDePreco.calcula(compra);
        double valorFinalEsperado = calculaPrecoEsperado(compra); //812.0

        assertEquals(valorFinalEsperado, valorCalculado, 0);

	}

	@Test
	public void testValorParaSudesteComPagamentoCartao() {

        Compra compra = new Compra(1000.0, Regiao.SUDESTE, Pagamento.CARTAO);
        CalculadoraDePreco calculadoraDePreco = new CalculadoraDePreco();

        double valorCalculado = calculadoraDePreco.calcula(compra);
        double valorFinalEsperado = calculaPrecoEsperado(compra); //810.0

        assertEquals(valorFinalEsperado, valorCalculado, 0);

	}

	@Test
	public void testValorParaNorteComPagamentoCartao() {

        Compra compra = new Compra(1000.0, Regiao.NORTE, Pagamento.CARTAO);
        CalculadoraDePreco calculadoraDePreco = new CalculadoraDePreco();

        double valorCalculado = calculadoraDePreco.calcula(compra);
        double valorFinalEsperado = calculaPrecoEsperado(compra); //825.0;

        assertEquals(valorFinalEsperado, valorCalculado, 0);

	}

	@Test
	public void testValorParaNordesteComPagamentoCartao() {

        Compra compra = new Compra(1000.0, Regiao.NORDESTE, Pagamento.CARTAO);
        CalculadoraDePreco calculadoraDePreco = new CalculadoraDePreco();

        double valorCalculado = calculadoraDePreco.calcula(compra);
        double valorFinalEsperado = calculaPrecoEsperado(compra); //1020.0

        assertEquals(valorFinalEsperado, valorCalculado, 0);

	}

	@Test
	public void testValorParaSulComPagamentoBoleto() {

        Compra compra = new Compra(1000.0, Regiao.SUL, Pagamento.BOLETO);
        CalculadoraDePreco calculadoraDePreco = new CalculadoraDePreco();

        double valorCalculado = calculadoraDePreco.calcula(compra);
        double valorFinalEsperado = calculaPrecoEsperado(compra); //912.0

        assertEquals(valorFinalEsperado, valorCalculado, 0);

	}

	@Test
	public void testValorParaSudesteComPagamentoBoleto() {

        Compra compra = new Compra(1000.0, Regiao.SUDESTE, Pagamento.BOLETO);
        CalculadoraDePreco calculadoraDePreco = new CalculadoraDePreco();

        double valorCalculado = calculadoraDePreco.calcula(compra);
        double valorFinalEsperado = calculaPrecoEsperado(compra); //910.0

        assertEquals(valorFinalEsperado, valorCalculado, 0);

	}

	@Test
	public void testValorParaNorteComPagamentoBoleto() {

        Compra compra = new Compra(1000.0, Regiao.NORTE, Pagamento.BOLETO);
        CalculadoraDePreco calculadoraDePreco = new CalculadoraDePreco();

        double valorCalculado = calculadoraDePreco.calcula(compra);
        double valorFinalEsperado = calculaPrecoEsperado(compra); //925.0;

        assertEquals(valorFinalEsperado, valorCalculado, 0);

	}

	@Test
	public void testValorParaNordesteComPagamentoBoleto() {

        Compra compra = new Compra(1000.0, Regiao.NORDESTE, Pagamento.BOLETO);
        CalculadoraDePreco calculadoraDePreco = new CalculadoraDePreco();

        double valorCalculado = calculadoraDePreco.calcula(compra);
        double valorFinalEsperado = calculaPrecoEsperado(compra); //920.0

        assertEquals(valorFinalEsperado, valorCalculado, 0);

	}

	private double calculaPrecoEsperado(Compra compra) {

		double freteEsperado = freteEsperadoPara(compra.getRegiao());
		double descontoEsperado = descontoEsperadoPara(compra.getValor(), compra.getPagamento());

		return compra.getValor() * (1-descontoEsperado) + freteEsperado;

	}

	private double freteEsperadoPara(Regiao regiao) {

		switch(regiao) {
			case SUL:
				return new TabelaDeFreteCorreios().para(regiao);
			case SUDESTE:
				return new TabelaDeFreteTransportadora().para(regiao);
			case NORTE:
				return new TabelaDeFreteCorreios().para(regiao);
			case NORDESTE:
				return new TabelaDeFreteTransportadora().para(regiao);
			default:
				return 0;
		}

	}

	private double descontoEsperadoPara(double valor, Pagamento pagamento) {

		switch(pagamento) {
			case BOLETO:
				return new TabelaDePrecoBoleto().descontoPara(valor);
			case CARTAO:
				return new TabelaDePrecoCartaoDeCredito().descontoPara(valor);
			case PADRAO:
				return new TabelaDePrecoPadrao().descontoPara(valor);
			default:
				return 0;
		}
	}

}
