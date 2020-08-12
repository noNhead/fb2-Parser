package org.sontoro.fb2_Parser.service;

import org.dom4j.Document;
import org.dom4j.Node;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Map;

public class GetFormattedText {
    public String textFormatting(Node node){
        StringBuilder string = new StringBuilder();
        List<Node> nodes = node.selectNodes("./*");
        int counter = 0;
        System.out.println(nodes.size());
        for (Node i: nodes) {
            if (i.getName().equals("section")) {
                //textFormatting(i.selectSingleNode("//section"));
            } else if (i.getName().equals("p")){
                counter++;
                string.append(i.getText());
                string.append("\n");
                ImageFormatting(i);
            } else if (i.getName().equals("image")) {
                String href = i.valueOf("@href");
                System.out.println(href);
                string.append(href);
                string.append("\n");
            } else if (i.getName().equals("poem")) {
                string = poemFormatting(i);
            } else if (i.getName().equals("subtitle")) {
                string.append("subtitle:");
                string.append(i.getText());
                string.append("\n");
            } else if (i.getName().equals("cite")) {
                string.append("cite:");
                string.append(i.getText());
                string.append("\n");
            } else if (i.getName().equals("empty-line")) {
                string.append("\n");
            } else if (i.getName().equals("table")) {
                string.append("\n");
            }
        }

        System.out.println("counter =" + counter);
        //System.out.println(string);
        return String.valueOf(string);
    }

    private StringBuilder poemFormatting(Node node) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Node> nodes = node.selectNodes("child::poem");
        for (Node i: nodes) {
            if (i.getName().equals("title")) {
                stringBuilder.append("title:");
                stringBuilder.append(i.getText());
                stringBuilder.append("\n");
            } else if (i.getName().equals("epigraph")) {
                stringBuilder = epigraphFormatting(i);
            } else if (i.getName().equals("stanza")) {
                stringBuilder = stanzaFormatting(i);
            } else if (i.getName().equals("text-author")) {
                stringBuilder.append("textAuthor:");
                stringBuilder.append(i.getText());
                stringBuilder.append("\n");
            } else if (i.getName().equals("date")) {
                stringBuilder.append("date:");
                stringBuilder.append(i.getText());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder;
    }

    private StringBuilder epigraphFormatting(Node node) {
        return null;
    }

    private StringBuilder stanzaFormatting(Node node) {
        return null;
    }

    private Map<Integer, byte[]> ImageFormatting(Node node) {
        List<Node> nodes = node.selectNodes("./*");
        for (Node i: nodes) {
            if (i.getName().equals("image")) {
                System.out.println("image");
                String id = i.selectSingleNode("./@*").getText();
                System.out.println(id);
                id = id.substring(1);
                Document document = node.getDocument();
                Node imageNode = document.selectSingleNode("//*[local-name(FictionBook)]/*[local-name(binary)][@id='"+ id +"']");
                byte[] encodedBytes = Base64.getDecoder().decode(imageNode.getText());
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(encodedBytes);
                BufferedImage image = null;
                try {
                    image = ImageIO.read(byteArrayInputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        return null;
    }
}
