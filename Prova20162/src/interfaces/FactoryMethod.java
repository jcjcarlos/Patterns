package interfaces;

import java.util.HashMap;
import java.util.Map;

public class FactoryMethod {

	private Map<String, IMergeable> merges = new HashMap<String, IMergeable>();
	private Map<String, ISerializable> serials = new HashMap<String, ISerializable>();

	public void addPrototype(String type, String name, IPrototype prototype) {
		if (type.equalsIgnoreCase("mergeable"))
			merges.put(name, (IMergeable) prototype);

		if (type.equalsIgnoreCase("serializable"))
			serials.put(name, (ISerializable) prototype);
	}

	public IPrototype createMergeable(String name) {
		return merges.get(name).clone();
	}

	public IPrototype createSerializable(String name) {
		return serials.get(name).clone();
	}
}
