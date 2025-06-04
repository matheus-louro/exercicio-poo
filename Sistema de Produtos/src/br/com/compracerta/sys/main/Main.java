package br.com.compracerta.sys.main;

import br.com.compracerta.sys.produto.Produto;
import br.com.compracerta.sys.produto.ProdutoInternacional;
import br.com.compracerta.sys.produto.ProdutoNacional;
import br.com.compracerta.sys.util.Teclado;

public class Main {
	public static void main(String[] args) {
		Produto[] produtos = new Produto[10];
		int opcao = 0;
		
		while (opcao != 5) {
			System.out.println("\n----- SISTEMA DE PRODUTOS -----");
		    	System.out.println("1 - Cadastrar");
		    	System.out.println("2 - Excluir");
		    	System.out.println("3 - Alterar");
		    	System.out.println("4 - Consultar");
		    	System.out.println("5 - Encerrar");
            
           		opcao = Teclado.lerInteiro("Escolha uma opção: ");
            
            		switch (opcao) {
				case 1: {
					//Criar um produto generico
					Produto novoProduto;
					
					int tipoProduto = Teclado.lerInteiro("(1) para Produto Nacional || (2) para Produto Internacional: ");
					
					int id = Teclado.lerInteiro("Digite o id: ");
					String descricao = Teclado.lerString("Digite a descrição do produto: ");
			        double preco = Teclado.lerDouble("Digite o preço: ");
			        int quantidade = Teclado.lerInteiro("Digite a quantidade em estoque: ");
			        
			        if (tipoProduto == 1) {
			        	double impostoNacional = Teclado.lerDouble("Informe o imposto do produto: ");
			        	novoProduto = new ProdutoNacional(id, descricao, preco, quantidade, impostoNacional);
			        }
			        else {
			        	double taxaImportacao = Teclado.lerDouble("Informe a taxa de importação: ");
			        	novoProduto = new ProdutoInternacional(id, descricao, preco, quantidade, taxaImportacao);
			        }
			        
			        for (int i = 0; i < produtos.length; i++) {
			        	if (produtos[i] == null) {
			        		produtos[i] = novoProduto;
			                System.out.println("Produto cadastrado com sucesso!");
			                break;
			        	}
			        }
			        
			        break;
				}
				
				case 2: {
					int id = Teclado.lerInteiro("Digite o id do produto que deseja excluir: ");
					for (int i = 0; i < produtos.length; i++) {
			            if (produtos[i] != null && produtos[i].getId() == id) {
			                produtos[i] = null;
			                System.out.println("Produto excluido com sucesso!");
			                break;
			            }
			        }
			        
			        break;
				}
				
				case 3: {
					int id = Teclado.lerInteiro("Digite o id do produto que deseja alterar: ");
			        for (int i = 0; i < produtos.length; i++) {
			            if (produtos[i] != null && produtos[i].getId() == id) {
			                produtos[i].setDescricao(Teclado.lerString("Digite a nova descrição: "));
			                produtos[i].setPreco(Teclado.lerDouble("Digite o novo preço: "));
			                produtos[i].setQuantidade(Teclado.lerInteiro("Digite a nova quantidade no estoque: "));
			                System.out.println("Produto alterado com sucesso!");
			                break;
			            }
			        }
			        
			        break;
				}
				
				case 4: {
					System.out.println("\n--- Produtos Cadastrados ---");
					for (int i = 0; i < produtos.length; i++) {
						if (produtos[i] != null) {						
							System.out.println(produtos[i]);
						}
					}
					
					System.out.println("\n Valor total do estoque: R$ " + Produto.calcularEstoque(produtos));
					
					break;
				}
				
				case 5: {
					System.out.println("Encerrando...");
					System.exit(0);
					break;
				}
					
				default:
					System.out.println("Opção invalida");
				}
		}
	}
}
