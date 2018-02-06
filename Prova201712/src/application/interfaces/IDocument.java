package application.interfaces;

public abstract class IDocument {

	protected String tipo;

	public IDocument(String tipo) {
		this.tipo = tipo;
	}

	public abstract String toString();

}
