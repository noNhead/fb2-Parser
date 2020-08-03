package org.sontoro.fb2_Parser.entity;

import org.sontoro.fb2_Parser.entity.body.Body;
import org.sontoro.fb2_Parser.entity.description.DocumentInfo;
import org.sontoro.fb2_Parser.entity.description.TitleInfo;

import java.util.List;

public class Fb2Tags {
    private String description; //One and only one occurrence

    //Description field
    private TitleInfo titleInfo; //One and only one occurrence
    private TitleInfo srcTitleInfo; //From zero to one occurrence

    private DocumentInfo documentInfo; //One and only one occurrence
    private String publishInfo; //From zero to one occurrence
    private String customInfo; //Any number of occurrences


    private Body body; //One and only one occurrence
    private String binary; //Any number of occurrences
}
