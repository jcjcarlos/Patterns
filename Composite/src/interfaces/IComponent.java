package interfaces;

public abstract class IComponent {
	public boolean add(IComponent component) {
		return false;
	}
	public boolean remove (IComponent component) {
		return false;
	}
	public IComponent getComposite(int i) {
		return null;
	};
	public abstract void incrementarPreco(double percentagem);
	public abstract String toString();
}