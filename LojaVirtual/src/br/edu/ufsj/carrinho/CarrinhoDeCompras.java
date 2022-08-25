package br.edu.ufsj.carrinho;

import java.util.ArrayList;

public class CarrinhoDeCompras {
	private ArrayList<Produto> produtos;
	
	public CarrinhoDeCompras() {
		this.produtos = new ArrayList<Produto>();
	}
	
	public void adiciona(Produto p) {
		this.produtos.add(p);
	}
	
	public ArrayList<Produto> getProdutos() {
		return this.produtos;
	}
}
