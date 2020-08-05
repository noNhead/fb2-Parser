package org.sontoro.fb2_Parser.service;

import org.dom4j.Document;
import org.sontoro.fb2_Parser.dto.Validate;
import java.util.List;
import java.util.Map;

public class GetDescription {
    public List<String> getGenresFromTitleInfo(Document document, String domain){
        return Validate.getListNodesValidateText(document.selectNodes("//FictionBook/description/" + domain + "/genre"));
    }

    public List<Map<String, String>> getAuthorsFromTitleInfo(Document document, String domain) {
        return Validate.getAuthors(document, domain, "author");
    }

    public String getBookTitleFromTitleInfo(Document document, String domain) {
        return Validate.getSingleNodeValidateText(document.selectSingleNode("//FictionBook/description/" + domain + "/book-title"));
    }

    public String getAnnotationFromTitleInfo(Document document, String domain) {
        return Validate.getSingleNodeValidateText(document.selectSingleNode("//FictionBook/description/" + domain + "/annotation"));
    }

    public String getKeywordsFromTitleInfo(Document document, String domain) {
        return Validate.getSingleNodeValidateText(document.selectSingleNode("//FictionBook/description/" + domain + "/keywords"));
    }

    public String getDateFromTitleInfo(Document document, String domain) {
        return Validate.getSingleNodeValidateText(document.selectSingleNode("//FictionBook/description/" + domain + "/date"));
    }

    public String getCoverPageFromTitleInfo(Document document, String domain) {
    //  return Validate.getSingleNodeValidateText(document.selectSingleNode("//FictionBook/description/" + domain + "/coverpage"));
        return "";
    }

    public String getLangFromTitleInfo(Document document, String domain) {
        return Validate.getSingleNodeValidateText(document.selectSingleNode("//FictionBook/description/" + domain + "/lang"));
    }

    public String getSrcLangFromTitleInfo(Document document, String domain) {
        return Validate.getSingleNodeValidateText(document.selectSingleNode("//FictionBook/description/" + domain + "/src-lang"));
    }

    public List<Map<String, String>> getTranslatorFromTitleInfo(Document document, String domain) {
        return Validate.getAuthors(document, domain, "translator");
    }

    public String getSequenceFromTitleInfo(Document document, String domain) {
        return Validate.getSingleNodeValidateText(document.selectSingleNode("//FictionBook/description/" + domain + "/sequence"));
    }

    public List<Map<String, String>> getAuthorFromDocumentInfo(Document document) {
        return Validate.getAuthors(document, "document-info", "author");
    }

    public String getProgramUsedFromDocumentInfo(Document document) {
        return Validate.getSingleNodeValidateText(document.selectSingleNode("//FictionBook/descriptiom/document-info/program-used"));
    }

    public String getDateFromDocumentInfo(Document document) {
        return Validate.getSingleNodeValidateText(document.selectSingleNode("//FictionBook/descriptiom/document-info/date"));
    }

    public List<String> getSrcUrlFromDocumentInfo(Document document) {
        return Validate.getListNodesValidateText(document.selectNodes("//FictionBook/descriptiom/document-info/src-url"));
    }

    public String getSrcOcrFromDocumentInfo(Document document) {
        return Validate.getSingleNodeValidateText(document.selectSingleNode("//FictionBook/descriptiom/document-info/src-ocr"));
    }

    public String getIdFromDocumentInfo(Document document) {
        return Validate.getSingleNodeValidateText(document.selectSingleNode("//FictionBook/descriptiom/document-info/id"));
    }

    public String getVersionFromDocumentInfo(Document document) {
        return Validate.getSingleNodeValidateText(document.selectSingleNode("//FictionBook/descriptiom/document-info/version"));
    }

    public String getHistoryFromDocumentInfo(Document document) {
        return Validate.getSingleNodeValidateText(document.selectSingleNode("//FictionBook/descriptiom/document-info/history"));
    }

    public List<String> getPublisherFromDocumentInfo(Document document) {
        return Validate.getListNodesValidateText(document.selectNodes("//FictionBook/descriptiom/document-info/publisher"));
    }

    public List<String> getCustomInfoByDescription(Document document) {
        return Validate.getListNodesValidateText(document.selectNodes("//FictionBook/description/custom-info"));
    }
}
