package application.fatory;

import application.interfaces.IDocument;
import application.interfaces.IFrameWork;
import application.products.DocumentImage;
import application.products.DocumentText;

public class FrameWork extends IFrameWork {

	private static IFrameWork frameWork = null;

	private FrameWork() {
	}

	public static IFrameWork getInstance() {
		if (frameWork == null)
			frameWork = new FrameWork();
		return frameWork;
	}

	@Override
	public IDocument createDocument(String name) {
		if (name.equalsIgnoreCase("I")) {
			System.out.println("Documento Imagem criado");
			return new DocumentImage();
		}

		if (name.equalsIgnoreCase("D")) {
			System.out.println("Documento Texto criado");
			return new DocumentText();
		}

		System.out.println("Documento invalido");
		return null;
	}

}
