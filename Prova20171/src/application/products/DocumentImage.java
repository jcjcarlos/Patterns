package application.products;

import application.interfaces.IDocument;
import application.interfaces.IFrameWork;

public class DocumentImage extends IDocument {

	public DocumentImage() {
		super("I");
	}

	@Override
	public String toString() {
		return super.tipo;
	}

}
