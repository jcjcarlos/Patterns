package application.factories;

import application.interfaces.ICreator;
import application.interfaces.IDocument;
import application.products.DocumentImage;

public class ImageCreator extends ICreator {

	@Override
	public IDocument createDocuments() {
		return new DocumentImage();
	}

}
