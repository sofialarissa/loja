package br.edu.ufsj.carrinho;

public class MaiorMenor{
	private Produto menor;
	private Produto maior;
	
	public void encontra(CarrinhoDeCompras carrinho) {
		for(Produto produto : carrinho.getProdutos()) {
			if(menor == null || produto.getValor() < menor.getValor()) {
				menor = produto;
			} else if(maior == null || produto.getValor() > maior.getValor()){
				maior = produto;
			}
		}
	}

	public Produto getMenor(){ 
		return menor; 
	}

	public Produto getMaior(){ 
		return maior; 
	}
}