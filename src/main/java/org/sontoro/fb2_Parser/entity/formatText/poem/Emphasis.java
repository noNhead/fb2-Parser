package org.sontoro.fb2_Parser.entity.formatText.poem;

public class Emphasis {
    private String text;

    public Emphasis(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
