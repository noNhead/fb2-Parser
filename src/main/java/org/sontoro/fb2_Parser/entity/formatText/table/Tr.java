package org.sontoro.fb2_Parser.entity.formatText.table;

import java.util.List;

public class Tr {
    private List<TableCell> text;

    //Атрибуты
    private String align;

    public Tr(List<TableCell> text, String align) {
        this.text = text;
        this.align = align;
    }

    public List<TableCell> getText() {
        return text;
    }

    public void setText(List<TableCell> text) {
        this.text = text;
    }

    public String getAlign() {
        return align;
    }

    public void setAlign(String align) {
        this.align = align;
    }
}
