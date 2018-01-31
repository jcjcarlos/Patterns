package modelo;

import interfaces.IComponent;

public class Product extends IComponent {
	private double preco;
	private String descricao;

	public Product(String descricao, double preco) {
		this.descricao = descricao;
		this.preco = preco;
	}	
	
	@Override
	public IComponent getComposite(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void incrementarPreco(double percentagem) {
		this.preco+=this.preco*percentagem;
	}

	@Override
	public String toString() {
		return this.descricao+"-"+this.preco;
	}

}
