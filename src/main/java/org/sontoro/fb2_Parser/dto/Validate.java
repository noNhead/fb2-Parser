package org.sontoro.fb2_Parser.dto;

import org.dom4j.Document;
import org.dom4j.Node;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Validate {
    @Nonnull
    static public String getSingleNodeValidateText(Node node){
        if (node != null) {
            return node.getText();
        }
        return "";
    }

    @Nonnull
    static public List<String> getListNodesValidateText(List<Node> nodes){
        List<String> stringNodes = new ArrayList<>();
        for (Node node: nodes) {
           stringNodes.add(getSingleNodeValidateText(node));
        }
        return stringNodes;
    }

    @Nonnull
    static public List<Map<String, String>> getAuthors(Document document, String domain, String subDomain) {
        List<Map<String,String>> authors = new ArrayList<>();
        List<Node> nodes =document.selectNodes("//FictionBook/description/"+ domain +"/"+subDomain);
        for (Node node: nodes) {
            Map<String,String> authorElements = new HashMap<>();
            authorElements.put("first-name", getSingleNodeValidateText(node.selectSingleNode("//first-name")));
            authorElements.put("middle-name", getSingleNodeValidateText(node.selectSingleNode("//middle-name")));
            authorElements.put("last-name", getSingleNodeValidateText(node.selectSingleNode("//last-name")));
            authorElements.put("nickname", getSingleNodeValidateText(node.selectSingleNode("//nickname")));
            authorElements.put("home-page", getSingleNodeValidateText(node.selectSingleNode("//home-page")));
            authorElements.put("email", getSingleNodeValidateText(node.selectSingleNode("//email")));
            authorElements.put("id", getSingleNodeValidateText(node.selectSingleNode("//id")));
            authors.add(authorElements);
        }
        return authors;
    }
}
