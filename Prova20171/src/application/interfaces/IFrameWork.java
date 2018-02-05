package application.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class IFrameWork {
	private static Map<String,IDocument> documents = new HashMap<String,IDocument>();

	public abstract IDocument createDocument(String name);

	public void saveDocument(String nome,IDocument document) {
		documents.put(nome,document);
	}
	
	public IDocument openDocument(String name) {
		return documents.get(name);
	}
	
	public void deleteDocument(String name) {
		documents.remove(name);
	}
}
