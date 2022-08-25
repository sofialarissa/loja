package br.edu.ufsj.teste;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.edu.ufsj.carrinho.CarrinhoDeCompras;
import br.edu.ufsj.carrinho.MaiorMenor;
import br.edu.ufsj.carrinho.Produto;

class TesteMaiorMenor {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void ordemDecrescente() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Geladeira", 890.0));
		carrinho.adiciona(new Produto("Liquidificador", 200.0));
		carrinho.adiciona(new Produto("Jogo de pratos", 80.0));
		
		MaiorMenor algoritmo = new MaiorMenor();
		algoritmo.encontra(carrinho);
		
		Assertions.assertEquals("Jogo de pratos", algoritmo.getMenor().getNome());
		Assertions.assertEquals("Geladeira", algoritmo.getMaior().getNome());

	}

}
