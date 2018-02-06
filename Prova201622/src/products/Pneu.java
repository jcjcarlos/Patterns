package products;

import interfaces.IMergeable;
import interfaces.IPrototype;

public class Pneu extends IMergeable{
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public IPrototype clone() {
		return new Pneu();
	}
}
