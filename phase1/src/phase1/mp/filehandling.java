package phase1.mp;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandling {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\data.txt");
		if(file.createNewFile()) {
			System.out.println(file.exists());
		}
		
		FileWriter fw = new FileWriter(file);
		fw.write("Hi Everyone \nHow are you");
		fw.flush();
		System.out.println("Reading the file");
		Scanner reader = new Scanner(file);
		while (reader.hasNext()) {
			String content = reader.nextLine();
			System.out.println(content);
		}
		System.out.println("File is  readed");
		reader.close();
		System.out.println("\n\nAppending...");
		FileWriter f1 = new FileWriter(file, true);
		f1.write("\nWelcome to java");
		f1.flush();
		System.out.println("new text is appended into the file");

	}
}