package org.sontoro.fb2_Parser.service;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.sontoro.fb2_Parser.entity.description.Author;
import org.sontoro.fb2_Parser.entity.description.Description;
import org.sontoro.fb2_Parser.entity.description.TitleInfo;

import java.io.File;
import java.net.MalformedURLException;
import java.util.List;

public class XmlReader {
    public Document getXmlDocumentDom4J() throws DocumentException, MalformedURLException {
        SAXReader reader = new SAXReader();
        File file = new File("");
        return reader.read(file);
    }

    public void setDescriptionByDocumentByDom4J(Document document) {
        Description description = new Description();
        description.setTitleInfo(getTitleInfoByDocumentByDom4J(document));
    }

    public TitleInfo getTitleInfoByDocumentByDom4J(Document document) {
        Author author = new Author();
        TitleInfo titleInfo = new TitleInfo();
        List<Node> nodeGenre = document.selectNodes("//FictionBook/description/title-info/genre");
        if (nodeGenre != null) {
            List<String> genre = null;
            for (Node node: nodeGenre) {
                genre.add(node.getText());
            }
        } else {
            System.out.println("Документ неверно построен, должен быть хотя бы один элемент <genre>");
            return null;
        }
        return null;
    }
}
