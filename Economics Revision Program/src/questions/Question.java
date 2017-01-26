package questions;

import java.util.HashMap;

public class Question {
	private String Question;
	private String questionTopic;
	private HashMap<Integer, String> options = new HashMap<Integer, String>();
	private int correctOption;
	private int selectedOption;
	
	public Question(String question, String questiontopic, Integer correctoption) {
		this.setQuestion(question);
		this.setQuestionTopic(questiontopic);
		this.setCorrectOption(correctoption);
	}
	
	public Question() {
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}
	
	public int getSelectedOption() {
		return selectedOption;
	}

	public void setSelectedOption(int option) {
		selectedOption = option;
	}

	public String getQuestionTopic() {
		return questionTopic;
	}

	public void setQuestionTopic(String questionTopic) {
		this.questionTopic = questionTopic;
	}

	public String getOptions(int x) {
		return options.get(x);
	}

	public void setOptions(HashMap<Integer, String> options) {
		this.options = options;
	}

	public Integer getCorrectOption() {
		return correctOption;
	}

	public void setCorrectOption(Integer correctOption) {
		this.correctOption = correctOption;
	}

	public boolean checkAnswer() {
		if (selectedOption == correctOption) {
			return true;
		}
		else {
			return false;
		}	
	}
	

}
