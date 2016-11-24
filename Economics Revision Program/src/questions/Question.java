package questions;

import java.util.HashMap;
import java.util.Map;

public class Question {
	public String Question;
	public String questionTopic;
	Map<Integer, String> options = new HashMap<Integer, String>();
	public String correctOption;
	
	public Question(String question, String questiontopic, String correctoption) {
		this.Question = question;
		this.questionTopic = questiontopic;
		this.correctOption = correctoption;
	}
	

}
