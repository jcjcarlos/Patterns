package application.products;

import application.interfaces.IDocument;
import application.interfaces.IFrameWork;

public class DocumentText extends IDocument{

	public DocumentText() {
		super("T");
	}

	@Override
	public String toString() {
		return super.tipo;
	}

}
