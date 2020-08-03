package org.sontoro.fb2_Parser;

import org.sontoro.fb2_Parser.repository.FileRepository;
import org.sontoro.fb2_Parser.service.Parser;

import java.io.IOException;

class Main {
	public static void main(String[] args) {
		Parser parser = new Parser();
		FileRepository fileRepository = new FileRepository();

		System.out.println("Start application");
		String path = "C:\\Users\\gspot\\IdeaProjects\\fb2-Parser\\src\\main\\resources\\file\\1.fb2";
		System.out.println("Path: " + path);
		String string = parser.parsIgnoringTags(path);
		path = "C:\\Users\\gspot\\IdeaProjects\\fb2-Parser\\src\\main\\resources\\file\\1.txt";
		try {
			fileRepository.fileRecording(string, path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}