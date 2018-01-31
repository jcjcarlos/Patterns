package modelo;

import java.util.ArrayList;

import interfaces.IComponent;

public class Composite  extends IComponent {
	private String descricao;
	private ArrayList<IComponent> components = new ArrayList<IComponent>();
	
	public Composite (String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public boolean add(IComponent component) {
		components.add(component);
		return true;
	}

	@Override
	public boolean remove(IComponent component) {
		components.remove(component);
		return true;
	}

	@Override
	public IComponent getComposite(int i) {
		// TODO Auto-generated method stub
		return components.get(i);
	}

	@Override
	public void incrementarPreco(double percentagem) {
		for(IComponent component:components)
				component.incrementarPreco(percentagem);
	}

	@Override
	public String toString() {
		String string = "";
		for(IComponent component: components)
			string +=" ["+component.toString()+"] ";
		return string;
	}
}
