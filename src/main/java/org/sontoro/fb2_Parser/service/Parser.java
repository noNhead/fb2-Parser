package org.sontoro.fb2_Parser.service;

import org.sontoro.fb2_Parser.repository.FileRepository;

import java.io.IOException;

public class Parser {
    FileRepository fileRepository = new FileRepository();

    public String parsIgnoringTags(String path) {
        System.out.println("Start class parsIgnoringTags");
        if (path == null) {
            return null;
        }
        String fileString = null;
        try {
            fileString = fileRepository.fileReaderToString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder newString = new StringBuilder();
        if (tagCheck(String.valueOf(newString))) {
            if (fileString != null){
                for (int i = 0; i < fileString.length(); i++) {
                    newString.append(fileString.charAt(i));
                    System.out.print(fileString.charAt(i));
                }
            }
            return String.valueOf(newString);
        }
        return null;
    }

    private boolean tagCheck(String string){
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (counter < 0) {
                System.out.println("tagCheck: false");
                return false;
            }
            if (string.charAt(i) == '<') {
                counter++;
            } else if (string.charAt(i) == '>') {
                counter--;
            }
        }
        if (counter == 0) {
            System.out.println("tagCheck: true");
            return true;
        }
        System.out.println("tagCheck: false");
        return false;
    }
}
