package test;

import strategy.ICCC;
import strategy.Imposto;
import strategy.Orcamento;

public class TesteStrategy {

	public static void main(String[] args) {
		
		/*Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(500);
		
		CalculadorDeImposto calculo = new CalculadorDeImposto();
		
		calculo.realizaCalculo(orcamento, icms);
		calculo.realizaCalculo(orcamento, iss);*/
		
		Imposto novoImposto = new ICCC();
		
		Orcamento orcamentoICCC = new Orcamento(500);
		
		System.out.println(novoImposto.calcula(orcamentoICCC));
		
	}

}
