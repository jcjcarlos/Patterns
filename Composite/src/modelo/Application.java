package modelo;

import interfaces.IComponent;

public class Application {
	public static void main(String[] args) {
		IComponent arroz = new Product("Arroz",5.0);
		IComponent feijao = new Product("Feijao",5.0);
		IComponent camisa = new Product("Camisa",10.0);
		IComponent alimentos = new Composite("Alimentos");
		IComponent vestiario = new Composite("Vestiario");
		IComponent supermercado = new Composite("SuperMercado");
		
		alimentos.add(arroz);
		alimentos.add(feijao);
		vestiario.add(camisa);
		supermercado.add(alimentos);
		supermercado.add(vestiario);
		
		System.out.println(supermercado.toString());
		
		supermercado.incrementarPreco(0.2);
		
		System.out.println(supermercado.toString());
		
		
	}
}
