package org.sontoro.fb2_Parser.service;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.sontoro.fb2_Parser.entity.description.Author;
import org.sontoro.fb2_Parser.entity.description.Date;
import org.sontoro.fb2_Parser.entity.description.Description;
import org.sontoro.fb2_Parser.entity.description.TitleInfo;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class XmlReader {
    public Document getXmlDocumentDom4J(String path) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(path);
        document.setXMLEncoding("UTF-8");
        return document;
    }

    public void setDescriptionByDocumentByDom4J(Document document) {
        Description description = new Description();
        description.setTitleInfo(getTitleInfoByDocumentByDom4J(document));
    }

    public TitleInfo getTitleInfoByDocumentByDom4J(Document document) {
        TitleInfo titleInfo = new TitleInfo();
        titleInfo.setGenre(getGenreByDocumentByDom4J(document));
        titleInfo.setAuthor(getAuthorByDocumentByDom4J(document, "author"));
        titleInfo.setBookTitle(getBookTitleByDocumentByDom4J(document));
        titleInfo.setAnnotation(getAnnotationByDocumentByDom4J(document));
        titleInfo.setKeywords(getKeywordsByDocumentByDom4J(document));
        titleInfo.setDate(getDateByDocumentByDom4J(document));
        titleInfo.setCoverPage(getCoverPageByDocumentByDom4J(document));
        titleInfo.setLang(getLangByDocumentByDom4J(document));
        titleInfo.setSrcLang(getSrcLangByDocumentByDom4J(document));
        titleInfo.setTranslator(getAuthorByDocumentByDom4J(document, "translator"));
        titleInfo.setSequence(getSequenceByDocumentByDom4J(document));
        return titleInfo;
    }

    public List<String> getGenreByDocumentByDom4J(Document document) {
        return getListValidInformation(document.selectNodes("//FictionBook/description/title-info/genre"));
    }

    public List<Author> getAuthorByDocumentByDom4J(Document document, String type) {
        List<Node> nodeAuthors = document.selectNodes("//FictionBook/description/title-info/" + type);
        List<Author> authors = new ArrayList<>();
        for (Node node: nodeAuthors) {
            Author author = new Author();
            author.setFirstName(getSingleValidInformation(node.selectSingleNode("//FictionBook/description/title-info/" + type + "/first-name")));
            author.setLastName(getSingleValidInformation(node.selectSingleNode("//FictionBook/description/title-info/" + type + "/last-name")));
            author.setNickname(getSingleValidInformation(node.selectSingleNode("//FictionBook/description/title-info/" + type + "/nickname")));
            author.setMiddleName(getSingleValidInformation(node.selectSingleNode("//FictionBook/description/title-info/" + type + "/middle-name")));
            author.setHomepage(getListValidInformation(node.selectNodes("//FictionBook/description/title-info/" + type + "/home-page")));
            author.setEmail(getListValidInformation(node.selectNodes("//FictionBook/description/title-info/" + type + "/email")));
            author.setId(getSingleValidInformation(node.selectSingleNode("//FictionBook/description/title-info/" + type + "/id")));
            authors.add(author);
        }

        return authors;
    }

    public String getBookTitleByDocumentByDom4J(Document document) {
        return getSingleValidInformation(document.selectSingleNode("//FictionBook/description/title-info/book-title"));
    }

    public String getAnnotationByDocumentByDom4J(Document document) {
        return getSingleValidInformation(document.selectSingleNode("//FictionBook/description/title-info/annotation"));
    }

    public String getKeywordsByDocumentByDom4J(Document document) {
        return getSingleValidInformation(document.selectSingleNode("//FictionBook/description/title-info/keywords"));
    }

    public Date getDateByDocumentByDom4J(Document document) {
        Date date = new Date();
        date.setDate(getSingleValidInformation(document.selectSingleNode("//FictionBook/description/title-info/date")));
        LocalDateTime localDateTime = LocalDateTime.now();
        date.setDateTimestamp(Timestamp.valueOf(localDateTime));
        return date;
    }

    public String getCoverPageByDocumentByDom4J(Document document) {
        return getSingleValidInformation(document.selectSingleNode("//FictionBook/description/title-info/coverpage"));
    }

    public String getLangByDocumentByDom4J(Document document) {
        return getSingleValidInformation(document.selectSingleNode("//FictionBook/description/title-info/lang"));
    }

    public String getSrcLangByDocumentByDom4J(Document document) {
        return getSingleValidInformation(document.selectSingleNode("//FictionBook/description/title-info/src-lang"));
    }

    public List<String> getSequenceByDocumentByDom4J(Document document) {
        List<Node> nodes = document.selectNodes("//FictionBook/description/title-info/sequence");
        List<String> list = new ArrayList<>();
        for (Node it: nodes) {
            list.add(it.valueOf("@name"));
        }
        return list;
    }

    private String getSingleValidInformation(Node node){
        if (node != null) {
            return node.getText();
        }
        return "";
    }

    private List<String> getListValidInformation(List<Node> list){
        List<String> reList = new ArrayList<>();
        for (Node node: list) {
            reList.add(getSingleValidInformation(node));
        }
        return reList;
    }
}
