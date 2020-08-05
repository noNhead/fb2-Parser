package org.sontoro.fb2_Parser.service;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.sontoro.fb2_Parser.entity.description.*;

import javax.print.Doc;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
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
        description.setSrcTitleInfo(getTitleInfoByDocumentByDom4J(document));
        description.setDocumentInfo(getDocumentInfoByDocumentByDom4J(document));
        description.setPublishInfo(getPublishInfoByDocumentByDom4J(document));
        description.setCustomInfo(getCustomInfoByDocumentByDom4J(document));
    }
//===============================================================================================================================
    public TitleInfo getTitleInfoByDocumentByDom4J(Document document) {
        TitleInfo titleInfo = new TitleInfo();
        titleInfo.setGenre(getGenreByDocumentByDom4J(document));
        titleInfo.setAuthor(getAuthorByDocumentByDom4J(document, "title-info", "author"));
        titleInfo.setBookTitle(getBookTitleByDocumentByDom4J(document));
        titleInfo.setAnnotation(getAnnotationByDocumentByDom4J(document));
        titleInfo.setKeywords(getKeywordsByDocumentByDom4J(document));
        titleInfo.setDate(getDateByDocumentByDom4J(document));
        titleInfo.setCoverPage(getCoverPageByDocumentByDom4J(document));
        titleInfo.setLang(getLangByDocumentByDom4J(document));
        titleInfo.setSrcLang(getSrcLangByDocumentByDom4J(document));
        titleInfo.setTranslator(getAuthorByDocumentByDom4J(document,"title-info" ,"translator"));
        titleInfo.setSequence(getSequenceByDocumentByDom4J(document, "title-info"));
        return titleInfo;
    }

    public List<String> getGenreByDocumentByDom4J(Document document) {
        return getListValidInformation(document.selectNodes("//FictionBook/description/title-info/genre"));
    }

    public List<Author> getAuthorByDocumentByDom4J(Document document,String domain, String subDomain) {
        List<Node> nodeAuthors = document.selectNodes("//FictionBook/description/" + domain + "/" + subDomain);
        List<Author> authors = new ArrayList<>();
        for (Node node: nodeAuthors) {
            Author author = new Author();
            author.setFirstName(getSingleValidInformation(node.selectSingleNode("//FictionBook/description/" + domain + "/" + subDomain + "/first-name")));
            author.setLastName(getSingleValidInformation(node.selectSingleNode("//FictionBook/description/" + domain + "/" + subDomain + "/last-name")));
            author.setNickname(getSingleValidInformation(node.selectSingleNode("//FictionBook/description/" + domain + "/" + subDomain + "/nickname")));
            author.setMiddleName(getSingleValidInformation(node.selectSingleNode("//FictionBook/description/" + domain + "/" + subDomain + "/middle-name")));
            author.setHomepage(getListValidInformation(node.selectNodes("//FictionBook/description/" + domain + "/" + subDomain + "/home-page")));
            author.setEmail(getListValidInformation(node.selectNodes("//FictionBook/description/" + domain + "/" + subDomain + "/email")));
            author.setId(getSingleValidInformation(node.selectSingleNode("//FictionBook/description/" + domain + "/" + subDomain + "/id")));
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

    public List<String> getSequenceByDocumentByDom4J(Document document, String domain) {
        List<Node> nodes = document.selectNodes("//FictionBook/description/"+ domain +"/sequence");
        List<String> list = new ArrayList<>();
        for (Node it: nodes) {
            list.add(it.valueOf("@name"));
        }
        return list;
    }
    //===========================================================================================================================
    public DocumentInfo getDocumentInfoByDocumentByDom4J(Document document) {
        DocumentInfo documentInfo = new DocumentInfo();
        documentInfo.setAuthor(getAuthorByDocumentByDom4J(document, "document-info", "author"));
        documentInfo.setProgramUsed(getProgramUsedByDocumentByDom4J(document));
        documentInfo.setDate(getDateByDocumentByDom4J(document));
        documentInfo.setSrcUrl(getSrcUrlByDocumentByDom4J(document));
        documentInfo.setSrcOcr(getSrcOcrByDocumentByDom4J(document));
        documentInfo.setId(getIdByDocumentByDom4J(document));
        documentInfo.setVersion(getVersionByDocumentByDom4J(document));
        documentInfo.setHistory(getHistoryByDocumentByDom4J(document));
        documentInfo.setPublisher(getPublisherByDocumentByDom4J(document, "document-info"));
        return documentInfo;
    }

    public String getProgramUsedByDocumentByDom4J(Document document) {
        return getSingleValidInformation(document.selectSingleNode("//FictionBook/description/document-info/program-used"));
    }

    public String getSrcUrlByDocumentByDom4J(Document document) {
        return getSingleValidInformation(document.selectSingleNode("//FictionBook/description/document-info/src-url"));
    }

    public String getSrcOcrByDocumentByDom4J(Document document) {
        return getSingleValidInformation(document.selectSingleNode("//FictionBook/description/document-info/src-url"));
    }

    public String getIdByDocumentByDom4J(Document document) {
        return getSingleValidInformation(document.selectSingleNode("//FictionBook/description/document-info/id"));
    }

    public Double getVersionByDocumentByDom4J(Document document) {
        return Double.valueOf(getSingleValidInformation(document.selectSingleNode("//FictionBook/description/document-info/version")));
    }

    public String getHistoryByDocumentByDom4J(Document document) {
        return getSingleValidInformation(document.selectSingleNode("//FictionBook/description/document-info/history"));
    }

    public String getPublisherByDocumentByDom4J(Document document, String domain) {
        return getSingleValidInformation(document.selectSingleNode("//FictionBook/description/document-info/publisher"));
    }
    //===========================================================================================================================

    public PublishInfo getPublishInfoByDocumentByDom4J(Document document) {
        PublishInfo publishInfo = new PublishInfo();
        publishInfo.setBookName(getBookNameByDocumentByDom4J(document));
        publishInfo.setPublisher(getPublisherByDocumentByDom4J(document, "publish-info"));
        publishInfo.setCity(getCityByDocumentByDom4J(document));
        publishInfo.setYear(getYearByDocumentByDom4J(document));
        publishInfo.setIsbn(getIsbnByDocumentByDom4J(document));
        publishInfo.setSequence(getSequenceByDocumentByDom4J(document, "publish-info"));
        return publishInfo;
    }

    public String getBookNameByDocumentByDom4J(Document document) {
        return getSingleValidInformation(document.selectSingleNode("//FictionBook/description/publish-info/book-name"));
    }

    public String getCityByDocumentByDom4J(Document document) {
        return getSingleValidInformation(document.selectSingleNode("//FictionBook/description/publish-info/city"));
    }

    public String getYearByDocumentByDom4J(Document document) {
        return getSingleValidInformation(document.selectSingleNode("//FictionBook/description/publish-info/year"));
    }

    public String getIsbnByDocumentByDom4J(Document document) {
        return getSingleValidInformation(document.selectSingleNode("//FictionBook/description/publish-info/isbn"));
    }

    //===========================================================================================================================

    public List<String> getCustomInfoByDocumentByDom4J(Document document) {
        return getListValidInformation(document.selectNodes("//FictionBook/description/custom-info"));
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
