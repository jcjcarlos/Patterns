package application.factories;

import application.interfaces.ICreator;
import application.interfaces.IDocument;
import application.products.DocumentText;

public class TextCreator extends ICreator{

	@Override
	public IDocument createDocuments() {
		return new DocumentText();
	}

}
