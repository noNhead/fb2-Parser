package org.sontoro.fb2_Parser;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.sontoro.fb2_Parser.service.GetBody;
import org.sontoro.fb2_Parser.service.XmlReader;

import java.io.IOException;

class Main {
	public static void main(String[] args) {
		XmlReader xmlReader = new XmlReader();
		GetBody getBody = new GetBody();

		System.out.println("Start application");
		String path = "C:\\Users\\gspot\\IdeaProjects\\fb2-Parser\\src\\main\\resources\\file\\2.fb2";
		System.out.println("Path: " + path);

		Document document = null;
		try {
			document = xmlReader.getXmlDocumentDom4J(path);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		if (document != null) {
			String string = getBody.bodyListSectionReading(document);
		} else {
			System.out.println("[WARN] document: null");
		}
	}
}