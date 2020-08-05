package org.sontoro.fb2_Parser.entity.description;

import java.util.List;

public class Description {
    private TitleInfo titleInfo;       //1
    private TitleInfo srcTitleInfo;    //0-1
    private DocumentInfo documentInfo; //1
    private PublishInfo publishInfo;   //0-1
    private List<String> customInfo;         //0-n

    public Description(TitleInfo titleInfo, TitleInfo srcTitleInfo, DocumentInfo documentInfo, PublishInfo publishInfo, List<String> customInfo) {
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

    public List<String> getCustomInfo() {
        return customInfo;
    }

    public void setCustomInfo(List<String> customInfo) {
        this.customInfo = customInfo;
    }
}
