package org.sontoro.fb2_Parser.entity.formatText.table;

public class TableCell {
    private boolean cellType; //if 0 th if 1 td

    private String text;

    //Атрибуты
    private String id;
    private String style;
    private String colspan;
    private String rowspan;
    private String align;
    private String vAlign;
    private String xmlLang;

    public TableCell(boolean cellType, String text, String id, String style, String colspan, String rowspan, String align, String vAlign, String xmlLang) {
        this.cellType = cellType;
        this.text = text;
        this.id = id;
        this.style = style;
        this.colspan = colspan;
        this.rowspan = rowspan;
        this.align = align;
        this.vAlign = vAlign;
        this.xmlLang = xmlLang;
    }

    public boolean isCellType() {
        return cellType;
    }

    public void setCellType(boolean cellType) {
        this.cellType = cellType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public String getColspan() {
        return colspan;
    }

    public void setColspan(String colspan) {
        this.colspan = colspan;
    }

    public String getRowspan() {
        return rowspan;
    }

    public void setRowspan(String rowspan) {
        this.rowspan = rowspan;
    }

    public String getAlign() {
        return align;
    }

    public void setAlign(String align) {
        this.align = align;
    }

    public String getvAlign() {
        return vAlign;
    }

    public void setvAlign(String vAlign) {
        this.vAlign = vAlign;
    }

    public String getXmlLang() {
        return xmlLang;
    }

    public void setXmlLang(String xmlLang) {
        this.xmlLang = xmlLang;
    }
}
