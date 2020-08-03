package org.sontoro.fb2_Parser.entity.description;

public class PublishInfo {
    private String bookName;
    private String publisher;
    private String city;
    private String year;

    public PublishInfo(String bookName, String publisher, String city, String year) {
        this.bookName = bookName;
        this.publisher = publisher;
        this.city = city;
        this.year = year;
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
}
