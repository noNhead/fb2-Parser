package org.sontoro.fb2_Parser.entity.description;

import java.util.List;

public class DocumentInfo {
    private List<Author> author; //1-n
    private String programUsed; //0-1
    private Date date; // 1
    private String srcUrl; //0-n
    private String srcOcr; //0-1
    private String id; //1
    private double version; //1
    private String history; //0-1
    private String publisher; //0-n

    public DocumentInfo() {

    }

    public DocumentInfo(List<Author> author, String programUsed, Date date, String srcUrl, String srcOcr, String id, double version, String history, String publisher) {
        this.author = author;
        this.programUsed = programUsed;
        this.date = date;
        this.srcUrl = srcUrl;
        this.srcOcr = srcOcr;
        this.id = id;
        this.version = version;
        this.history = history;
        this.publisher = publisher;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public String getProgramUsed() {
        return programUsed;
    }

    public void setProgramUsed(String programUsed) {
        this.programUsed = programUsed;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSrcUrl() {
        return srcUrl;
    }

    public void setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
    }

    public String getSrcOcr() {
        return srcOcr;
    }

    public void setSrcOcr(String srcOcr) {
        this.srcOcr = srcOcr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
