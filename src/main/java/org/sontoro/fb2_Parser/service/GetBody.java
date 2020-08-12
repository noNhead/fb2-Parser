package org.sontoro.fb2_Parser.service;

import org.dom4j.Document;
import org.dom4j.Node;
import org.sontoro.fb2_Parser.dto.Validate;

import javax.xml.namespace.NamespaceContext;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import java.util.Iterator;
import java.util.List;


public class GetBody {
    GetFormattedText getFormattedText = new GetFormattedText();

    public String getImageFromBody(Document document) {
        return null;
    }

    public String getTitleFromBody(Document document) {
        return Validate.getSingleNodeValidateText(document.selectSingleNode("//FictionBook/body/title"));
    }

    public List<Node> getEpigraphFromBody (Document document) {
        return document.selectNodes("//FictionBook/body/epigraph");
    }

    public String bodyListSectionReading(Document document){
        //System.out.println(document.getRootElement().getNamespace());
        List<Node> nodes = document.selectNodes("//*[local-name()='FictionBook']/*[local-name()='body']/*[local-name()='section']");
        StringBuilder stringBuilder = new StringBuilder();
        for (Node node: nodes) {
            stringBuilder.append(getFormattedText.textFormatting(node));
        }
        //System.out.println(stringBuilder);
        return String.valueOf(stringBuilder);
    }

    public List<Node> getSectionFromBody (Node node) {
        return node.selectNodes("//section");
    }
}
