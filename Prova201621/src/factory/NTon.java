package factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import products.FlexSingleton;

public class NTon {
	private static Map<Integer, FlexSingleton> singletons = new HashMap<Integer, FlexSingleton>();
	private static int minNTon;
	private static int maxNTon;
	private static int numInstances;

	private NTon() {
	}

	public static void initialize(int minNTon, int maxNTon) {
		singletons.clear();
		NTon.minNTon = minNTon - 1;
		NTon.maxNTon = maxNTon - 1;
		NTon.numInstances = 0;
		System.out.println(minNTon + "," + maxNTon + "," + numInstances);

		for (int i = 0; i <= NTon.minNTon; i++) {
			singletons.put(i, new FlexSingleton());
		}
	}

	public static FlexSingleton getInstance() {
		FlexSingleton temp = null;
		if (numInstances % maxNTon <= minNTon) {
			temp = singletons.get(numInstances % maxNTon);
			System.out.println("Fixo "+numInstances % maxNTon+" Num: "+numInstances);
		}
		else if (singletons.containsKey(numInstances % maxNTon)) {
			System.out.println("Dinamico existente "+numInstances % maxNTon+" Num: "+numInstances);
			temp = singletons.get(numInstances % maxNTon);
		}
		else {
			System.out.println("Novo dinamico "+numInstances % maxNTon+" Num: "+numInstances);
			temp = new FlexSingleton();
			singletons.put(numInstances, temp);
		}
		numInstances++;
		return temp;
	}
}
