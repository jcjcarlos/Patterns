

import java.util.HashMap;
import java.util.Map;

import factory.NTon;
import products.FlexSingleton;

public class App {

	private static Map<Integer, FlexSingleton> nTons = new HashMap<Integer, FlexSingleton>();

	public static void main(String[] args) {
		int min = 3, max = 7;
		NTon.initialize(min, max);
		for (int i = 0; i < 25; i++) {
			nTons.put(i, NTon.getInstance());
			//System.out.println(nTons.get(i));
		}
		System.out.println(nTons.get(0) == nTons.get(24));
	}
}
