package org.sontoro.fb2_Parser.entity.formatText.table;

import java.util.List;

public class Table {
    private List<Tr> tr;

    //Атрибуты
    private String id;
    private String style;

    public Table(List<Tr> tr, String id, String style) {
        this.tr = tr;
        this.id = id;
        this.style = style;
    }

    public List<Tr> getTr() {
        return tr;
    }

    public void setTr(List<Tr> tr) {
        this.tr = tr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
