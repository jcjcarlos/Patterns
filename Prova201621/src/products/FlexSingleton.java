package products;

public class FlexSingleton {
	private static int instances;
	private int num;
	
	public FlexSingleton() {
		num =  instances;
		instances++;
	}
	
	public String toString() {
		return ""+num;
	}
}
