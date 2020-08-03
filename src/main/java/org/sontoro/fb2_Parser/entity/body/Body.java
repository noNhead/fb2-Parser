package org.sontoro.fb2_Parser.entity.body;

import org.sontoro.fb2_Parser.entity.formatText.poem.Epigraph;

import java.util.List;


/**
 * <body> - описывает тело документа. Одно или более вхождений.
 * Здесь собственно и находится текст книги.
 *
 * Хотя формально количество и порядок экземпляров <body> не ограничены, но для совместимости с существующим софтом рекомендуется:
 *
 * Помещать весь основной текст документа в первом <body> (сразу после <description>).
 * При наличии в тексте сносок (<a type="note">) сам текст сносок должен размещаться во втором <body> с атрибутом name="notes".
 * При наличии кроме сносок также комментариев и т.п., что в оригинале размещено в конце книги - создается третье <body> с атрибутом name="comments" или без атрибута name.
 * При отсутствии сносок второе и третье <body> должно отсутствовать, а весь текст размещаться в первом.
 */

public class Body {
    private String image;
    private String title;
    private List<Epigraph> epigraph;
    private List<Section> section;

    public Body(String image, String title, List<Epigraph> epigraph, List<Section> section) {
        this.image = image;
        this.title = title;
        this.epigraph = epigraph;
        this.section = section;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public List<Section> getSection() {
        return section;
    }

    public void setSection(List<Section> section) {
        this.section = section;
    }
}
