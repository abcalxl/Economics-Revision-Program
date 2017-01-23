package questions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class QuestionLoader {
	public ArrayList<Question> questions = new ArrayList<Question>();
	public QuestionLoader() {
		File testfile = new File("src/resources/Questions_Database.txt");
		try {
			BufferedReader in = new BufferedReader(new FileReader(testfile.getPath()));
			String nextLine;
			while ((nextLine = in.readLine()) != null) {
				//lines.add(nextLine);
				Question q = new Question();
				String [] line = nextLine.split("\\|");
				q.setQuestion(line[0]);
				q.setQuestionTopic(line[6]);
				HashMap<Integer, String> choices = new HashMap<>();
				choices.put(0, line[1]);
				choices.put(1, line[2]);
				choices.put(2, line[3]);
				choices.put(3, line[4]);
				q.setOptions(choices);
				questions.add(q);
			}
			in.close();
		}
		catch (Exception e) {
			System.out.println("Error Encountered During Reading Questions");
		}
	}
	
}
