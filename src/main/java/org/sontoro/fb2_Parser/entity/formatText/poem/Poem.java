package org.sontoro.fb2_Parser.entity.formatText.poem;

import org.sontoro.fb2_Parser.entity.description.Date;

import java.util.List;

public class Poem {
    private String title;
    private List<Epigraph> epigraph;
    private List<String> stanza;
    private List<String> textAuthor;
    private Date date;

    public Poem(String title, List<Epigraph> epigraph, List<String> stanza, List<String> textAuthor, Date date) {
        this.title = title;
        this.epigraph = epigraph;
        this.stanza = stanza;
        this.textAuthor = textAuthor;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Epigraph> getEpigraph() {
        return epigraph;
    }

    public void setEpigraph(List<Epigraph> epigraph) {
        this.epigraph = epigraph;
    }

    public List<String> getStanza() {
        return stanza;
    }

    public void setStanza(List<String> stanza) {
        this.stanza = stanza;
    }

    public List<String> getTextAuthor() {
        return textAuthor;
    }

    public void setTextAuthor(List<String> textAuthor) {
        this.textAuthor = textAuthor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
