package br.edu.ufsj.teste;

import br.edu.ufsj.carrinho.CarrinhoDeCompras;
import br.edu.ufsj.carrinho.MaiorMenor;
import br.edu.ufsj.carrinho.Produto;

public class TestaMaiorMenor {

	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Liquidificador", 200.0));
		carrinho.adiciona(new Produto("Geladeira", 890.0));
		carrinho.adiciona(new Produto("Jogo de pratos", 80.0));
		
		MaiorMenor algoritmo = new MaiorMenor();
		algoritmo.encontra(carrinho);
		
		System.out.println("O menor produto: " + algoritmo.getMenor().getNome());
		System.out.println("O maior produto: " + algoritmo.getMaior().getNome());
		}
}
