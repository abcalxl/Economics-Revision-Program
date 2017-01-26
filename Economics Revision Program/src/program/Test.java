package program;

import java.util.LinkedList;
import java.util.Random;

import questions.Question;
import questions.QuestionLoader;

public class Test {
	public LinkedList<Question> questionsSelect = new LinkedList<Question>();
	public LinkedList<Question> questionsAll = new LinkedList<Question>();
	public Test(int questionQuantity) {
		Random rand = new Random();
		
		QuestionLoader q = new QuestionLoader();
		
		for (Question question : q.questions) {
			questionsAll.add(question);
		}
		
		for (int i = 0; i < questionQuantity; i++) {
			int r = rand.nextInt(questionsAll.size());
			questionsSelect.add( questionsAll.get(r));
			questionsAll.remove(r);
		}
		
		
		
		
	}

}
