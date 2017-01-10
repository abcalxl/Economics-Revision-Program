package questions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class QuestionHandler {
	public ArrayList<String> lines = new ArrayList<String>();
	public QuestionHandler() {
		File testfile = new File("src/resources/Questions_Database.txt");
		try {
			BufferedReader in = new BufferedReader(new FileReader(testfile.getPath()));
			String nextLine;
			while ((nextLine = in.readLine()) != null) {
				lines.add(nextLine);
			}
			in.close();
		}
		catch (Exception e) {
			System.out.println("Error Encountered During Reading Questions");
		}
	}
	
}
