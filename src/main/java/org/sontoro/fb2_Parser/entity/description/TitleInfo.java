package org.sontoro.fb2_Parser.entity.description;

import java.util.List;

public class TitleInfo {
    private List<String> genre; //1..n
    private List<Author> author; //1..n
    private String bookTitle; //1
    private String annotation; //0..1
    private String keywords; //0..1
    private Date date; //0..1
    private String coverPage; //0..1 contains a tag <image>
    private String lang; // 1
    private String srcLang; // 0..1
    private List<Author> translator; // 0..n
    private List<String> sequence; // 0..n name= number=

    public TitleInfo(List<String> genre, List<Author> author, String bookTitle, String annotation, String keywords, Date date, String coverPage, String lang, String srcLang, List<Author> translator, List<String> sequence) {
        this.genre = genre;
        this.author = author;
        this.bookTitle = bookTitle;
        this.annotation = annotation;
        this.keywords = keywords;
        this.date = date;
        this.coverPage = coverPage;
        this.lang = lang;
        this.srcLang = srcLang;
        this.translator = translator;
        this.sequence = sequence;
    }

    public TitleInfo() {

    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCoverPage() {
        return coverPage;
    }

    public void setCoverPage(String coverPage) {
        this.coverPage = coverPage;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getSrcLang() {
        return srcLang;
    }

    public void setSrcLang(String srcLang) {
        this.srcLang = srcLang;
    }

    public List<Author> getTranslator() {
        return translator;
    }

    public void setTranslator(List<Author> translator) {
        this.translator = translator;
    }

    public List<String> getSequence() {
        return sequence;
    }

    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return "TitleInfo{" +
                "genre=" + genre +
                ", author=" + author +
                ", bookTitle='" + bookTitle + '\'' +
                ", annotation='" + annotation + '\'' +
                ", keywords='" + keywords + '\'' +
                ", date=" + date +
                ", coverPage='" + coverPage + '\'' +
                ", lang='" + lang + '\'' +
                ", srcLang='" + srcLang + '\'' +
                ", translator=" + translator +
                ", sequence=" + sequence +
                '}';
    }
}
