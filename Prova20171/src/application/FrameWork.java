package application;

import application.factories.ImageCreator;
import application.factories.TextCreator;
import application.interfaces.ICreator;
import application.interfaces.IDocument;
import application.interfaces.IFrameWork;
import application.products.DocumentImage;
import application.products.DocumentText;

public class FrameWork extends IFrameWork {
	
	@Override
	public void fileOpen() {
		System.out.println("Creator salvando IDocuments");
		if(super.creator instanceof TextCreator)
			super.creator.saveDocuments("Texto1");
		
		if(super.creator instanceof ImageCreator)
			super.creator.saveDocuments("Image1");
	}

	@Override
	public void setCreator(ICreator creator) {
		super.creator = creator;
	}

}
