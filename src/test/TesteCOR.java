package test;

import chain.of.responsibility.Desconto;
import chain.of.responsibility.DescontoParaMaisDeCindoItens;
import chain.of.responsibility.DescontoPorMaisDeQuientosReais;
import chain.of.responsibility.DescontoPorVendaCasada;
import chain.of.responsibility.Item;
import chain.of.responsibility.Orcamento;
import chain.of.responsibility.SemDesconto;

public class TesteCOR {
	
	public static void main(String[] args) {
		Desconto d1 = new DescontoParaMaisDeCindoItens();
		Desconto d2 = new DescontoPorMaisDeQuientosReais();
		Desconto d3= new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);
		
		Item lapis = new Item("Lapis", 15.00);
        Item caneta = new Item("Caneta", 15.00);
        Item borracha = new Item("borracha", 15.00);
		
        Orcamento orcamento = new Orcamento(500.0);
        orcamento.adicionaItem(caneta);
        orcamento.adicionaItem(borracha);
        orcamento.adicionaItem(lapis); 
		
		double desconto = d1.desconta(orcamento);
		System.out.println(desconto);
	}
	
	
	
}
