package application.interfaces;

import java.util.HashMap;
import java.util.Map;

public abstract class ICreator {

	private Map<String, IDocument> documents = new HashMap<String, IDocument>();

	public abstract IDocument createDocuments();

	public void saveDocuments(String name) {
		IDocument temp = createDocuments();
		System.out.println(temp);
		documents.put(name, temp);
		System.out.println("Documento do tipo "+name+" criado");
	}

}
