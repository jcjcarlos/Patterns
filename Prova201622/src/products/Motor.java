package products;

import interfaces.IMergeable;
import interfaces.IPrototype;

public class Motor extends IMergeable{
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public IPrototype clone() {
		return new Motor();
	}
}
