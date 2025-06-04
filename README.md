# Exercicio - Herança, Polimorfismo e Sobrescrita em Java

Você foi contratado pela empresa Compra Certa (www.compracerta.com.br) para evoluir o sistema de cadastro de
Produtos.
A nova versão do sistema agora diferencia dois tipos de produtos:
- ProdutoNacional: fabricado no Brasil, com cobrança de imposto.
- ProdutoImportado: trazido do exterior, com cobrança de taxa de importação.

O cadastro possui uma inserção, alteração, exclusão e consulta de todos os produtos da empresa.
Todo Produto possui uma id, descricao, preço e quantidade em estoque e uma função que retorna o preço final do produto
após a aplicação do imposto nacional ou taxa de importação.

Seu cadastro deve contemplar até 10 Produtos.
Requisitos:
Monte a estrutura de pacotes adequada;
Crie uma classe Produto com os atributos id, descricao, preco e quantidade, com modificadores de acesso apropriados.
Implemente getters e setters para todos os atributos.
Crie construtor para inicialização dos objetos.
Crie um método estático que calcule o valor total do estoque.
