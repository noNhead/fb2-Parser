package org.sontoro.fb2_Parser.entity.body;

import java.util.List;

public class Section {
    private String title;
    private List<String> epigraph;
    private String image;
    private String annotation;
    private String section;

    public Section(String title, List<String> epigraph, String image, String annotation, String section) {
        this.title = title;
        this.epigraph = epigraph;
        this.image = image;
        this.annotation = annotation;
        this.section = section;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getEpigraph() {
        return epigraph;
    }

    public void setEpigraph(List<String> epigraph) {
        this.epigraph = epigraph;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
