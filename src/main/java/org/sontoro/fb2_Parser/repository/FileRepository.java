package org.sontoro.fb2_Parser.repository;

import org.apache.commons.io.FileUtils;

import javax.annotation.Nullable;
import java.io.File;
import java.io.IOException;

public class FileRepository {
    @Nullable
    public String fileReaderToString(String path) throws IOException {
        File file = pathReader(path);
        if (file != null) {
            return FileUtils.readFileToString(file, "utf-8");
        }
        return null;
    }

    @Nullable
    private File pathReader(String path){
        File file = new File(path);
        if (file.exists()) {
            if (file.isFile()) {
                return new File(path);
            }
        }
        return null;
    }

    public boolean fileRecording(String fileString, String path) throws IOException {
        File file = new File(path);
        if (true){
            FileUtils.write(file, fileString, "utf-8");
            return true;
        }
        return false;
    }
}
