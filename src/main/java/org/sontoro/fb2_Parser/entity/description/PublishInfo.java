package org.sontoro.fb2_Parser.entity.description;

import java.util.List;

public class PublishInfo {
    private String bookName;
    private String publisher;
    private String city;
    private String year;
    private String isbn;
    private List<String> sequence;

    public PublishInfo() {
    }

    public PublishInfo(String bookName, String publisher, String city, String year, String isbn, List<String> sequence) {
        this.bookName = bookName;
        this.publisher = publisher;
        this.city = city;
        this.year = year;
        this.isbn = isbn;
        this.sequence = sequence;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<String> getSequence() {
        return sequence;
    }

    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
