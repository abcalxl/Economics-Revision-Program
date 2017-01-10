package program;

import java.util.LinkedList;
import java.util.Random;

import questions.QuestionHandler;

public class Test {
	public Test(int questionQuantity) {
		LinkedList<String> questionsSelect = new LinkedList<String>();
		LinkedList<String> questionsAll = new LinkedList<String>();
		Random rand = new Random();
		
		QuestionHandler q = new QuestionHandler();
		
		for (String question : q.lines) {
			questionsAll.add(question);
		}
		
		for (int i = 0; i < questionQuantity; i++) {
			int r = rand.nextInt(questionsAll.size() - 1);
			questionsSelect.add( questionsAll.get(r));
			questionsAll.remove(r);
		}
	}
}
