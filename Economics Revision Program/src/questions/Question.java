package questions;

import java.util.HashMap;

public class Question {
	public String Question;
	public String questionTopic;
	private HashMap<Integer, String> options = new HashMap<Integer, String>();
	public Integer correctOption;
	
	public Question(String question, String questiontopic, Integer correctoption) {
		this.Question = question;
		this.questionTopic = questiontopic;
		this.correctOption = correctoption;
	}

	/**
	 * @return the options
	 */
	public HashMap<Integer, String> getOptions() {
		return options;
	}

	/**
	 * @param options the options to set
	 */
	public void setOptions(HashMap<Integer, String> options) {
		this.options = options;
	}
	

}
