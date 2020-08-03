package org.sontoro.fb2_Parser.entity.formatText.poem;

import java.util.List;

public class Stanza {
    private String text;

    private String title;
    private String subtitle;

    private List<String> v;

    public Stanza(String text, String title, String subtitle, List<String> v) {
        this.text = text;
        this.title = title;
        this.subtitle = subtitle;
        this.v = v;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public List<String> getV() {
        return v;
    }

    public void setV(List<String> v) {
        this.v = v;
    }
}
