package br.com.compracerta.sys.produto;

public class ProdutoInternacional extends Produto {
	private double taxaImportacao;
	
	public ProdutoInternacional(int id, String descricao, double preco, int quantidade, double taxaImportacao) {
		super(id, descricao, preco, quantidade);
		this.taxaImportacao = taxaImportacao; 
	}

	public double getTaxaImportacao() {
		return taxaImportacao;
	}

	public void setTaxaImportacao(double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}
	
	@Override
	public double calcularPrecoFinal() {
		return getPreco() * (1 + taxaImportacao / 100);
	}

	@Override
	public String toString() {
	    return super.toString() + "\nTaxa de Importação: " + taxaImportacao + "%";
	}

	
	
}
