package org.sontoro.fb2_Parser.entity.description;

public class Description {
    private TitleInfo titleInfo; // Одно и только одно вхождение
    private TitleInfo srcTitleInfo; // От нуля до одного вхождения
    private DocumentInfo documentInfo; // Одно и только одно вхождение
    private PublishInfo publishInfo; // От нуля до одного вхождения
    private String customInfo; // Любое число вхождений

    public Description(TitleInfo titleInfo, TitleInfo srcTitleInfo, DocumentInfo documentInfo, PublishInfo publishInfo, String customInfo) {
        this.titleInfo = titleInfo;
        this.srcTitleInfo = srcTitleInfo;
        this.documentInfo = documentInfo;
        this.publishInfo = publishInfo;
        this.customInfo = customInfo;
    }

    public Description() {
    }

    public TitleInfo getTitleInfo() {
        return titleInfo;
    }

    public void setTitleInfo(TitleInfo titleInfo) {
        this.titleInfo = titleInfo;
    }

    public TitleInfo getSrcTitleInfo() {
        return srcTitleInfo;
    }

    public void setSrcTitleInfo(TitleInfo srcTitleInfo) {
        this.srcTitleInfo = srcTitleInfo;
    }

    public DocumentInfo getDocumentInfo() {
        return documentInfo;
    }

    public void setDocumentInfo(DocumentInfo documentInfo) {
        this.documentInfo = documentInfo;
    }

    public PublishInfo getPublishInfo() {
        return publishInfo;
    }

    public void setPublishInfo(PublishInfo publishInfo) {
        this.publishInfo = publishInfo;
    }

    public String getCustomInfo() {
        return customInfo;
    }

    public void setCustomInfo(String customInfo) {
        this.customInfo = customInfo;
    }
}
