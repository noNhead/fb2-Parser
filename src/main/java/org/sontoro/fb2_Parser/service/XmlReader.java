package org.sontoro.fb2_Parser.service;

import org.dom4j.*;
import org.dom4j.io.SAXReader;


public class XmlReader {
    public Document getXmlDocumentDom4J(String path) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(path);
        document.setXMLEncoding("UTF-8");
        return document;
    }
}
