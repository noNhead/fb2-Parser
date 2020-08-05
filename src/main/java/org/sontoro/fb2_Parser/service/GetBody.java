package org.sontoro.fb2_Parser.service;

import org.dom4j.Document;
import org.dom4j.Node;
import org.sontoro.fb2_Parser.dto.Validate;

import java.util.List;


public class GetBody {
    public String getImageFromBody(Document document) {
        return null;
    }

    public String getTitleFromBody(Document document) {
        return Validate.getSingleNodeValidateText(document.selectSingleNode("//FictionBook/body/title"));
    }

    public List<Node> getEpigraphFromBody (Document document) {
        return document.selectNodes("//FictionBook/body/epigraph");
    }

    public List<Node> getSectionFromBody (Node node) {
        return node.selectNodes("//section");
    }
}
