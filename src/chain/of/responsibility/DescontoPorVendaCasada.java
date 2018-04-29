package chain.of.responsibility;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		if(aconteceuVendaCasada(orcamento)) {
			return orcamento.getValor() - (orcamento.getValor() * 0.05);
		}else {
			return proximo.desconta(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		
	}
	
	private boolean existe(String nomeDoItem, Orcamento orcamento) {
		for(Item item : orcamento.getItens()) {
			if(item.getNome().equals(nomeDoItem))
				return true;
		}
		
		return false;
	}
	
	private boolean aconteceuVendaCasada(Orcamento orcamento) {
		return existe("Caneta", orcamento) && existe("Lapis", orcamento);
	}

}
