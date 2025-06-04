package br.com.compracerta.sys.produto;


public class Produto {
	private int id;
	private String descricao;
	private double preco;
	private int quantidade;
	
	
	public Produto(int id, String descricao, double preco, int quantidade) {
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double calcularPrecoFinal() {
		return this.preco;
	}
	
	@Override
	public String toString() {
	    return "ID: " + id +
	           "\nDescrição: " + descricao +
	           "\nPreço: " + preco +
	           "\nQuantidade: " + quantidade +
	           "\nPreço Final: " + calcularPrecoFinal();
	}

	
	public static double calcularEstoque(Produto[] produtos) {
		double total = 0.0;
        for (Produto p : produtos) {
            if (p != null) {
                total += p.calcularPrecoFinal() * p.getQuantidade();
            }
        }
        return total;
	}
	
	
}
