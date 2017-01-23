package program;

import java.util.LinkedList;
import java.util.Random;

import questions.QuestionLoader;

public class Test {
	public LinkedList<String> questionsSelect = new LinkedList<String>();
	public LinkedList<String> questionsAll = new LinkedList<String>();
	public Test(int questionQuantity) {
		Random rand = new Random();
		
		QuestionLoader q = new QuestionLoader();
		
		for (String question : q.lines) {
			questionsAll.add(question);
		}
		
		for (int i = 0; i < questionQuantity; i++) {
			int r = rand.nextInt(questionsAll.size());
			questionsSelect.add( questionsAll.get(r));
			questionsAll.remove(r);
		}
		
		
		
		
	}

}
