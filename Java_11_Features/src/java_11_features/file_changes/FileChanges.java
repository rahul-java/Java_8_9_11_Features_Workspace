package java_11_features.file_changes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileChanges {

	public static void main(String[] args) throws IOException {
		
		Path p = Path.of("C:\\Users\\hp\\Desktop\\lines.txt");
		//Path p1 = Path.of("C:\\Users\\hp\\Desktop\\java.docx");
		//Path p1 = Path.of("C:\\Users\\hp\\Desktop\\java1.pdf");
		String data = Files.readString(p);
		System.out.println(data);
		
		//Files.writeString(p1, "Testing the write operation of files using java 11", StandardOpenOption.APPEND);
		//Files.writeString(p1, "Testing the write operation of files using java 11", StandardOpenOption.TRUNCATE_EXISTING);
		
		System.out.println("=================================================");
		//System.out.println(Files.readString(p1));
	}
}
