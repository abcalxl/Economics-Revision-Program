package program;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class RunQuiz extends JPanel {
	private JTextField txtquestionHere;
	private int counter = 0;
	public int score = 0;

	/**
	 * Create the panel.
	 */
	public RunQuiz(Main_ mainframe, int selectedTopic, int questionQuantity) {
		setLayout(null);
		Test t = new Test(questionQuantity);
		
//		txtquestionHere = new JTextField();
//		txtquestionHere.setText(t.questionsSelect.get(0).getQuestion());
//		txtquestionHere.setBounds(121, 121, 782, 48);
//		add(txtquestionHere);
//		txtquestionHere.setColumns(10);
//		
//		JButton btnSubmitAnswer = new JButton("Submit Answer");
//		btnSubmitAnswer.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		btnSubmitAnswer.setBounds(763, 627, 140, 39);
//		add(btnSubmitAnswer);
//		
//		JRadioButton rdbtnOption = new JRadioButton("Option 1");
//		rdbtnOption.setBounds(137, 265, 350, 50);
//		add(rdbtnOption);
//		
//		JRadioButton rdbtnOption_1 = new JRadioButton("Option 2");
//		rdbtnOption_1.setBounds(529, 265, 350, 50);
//		add(rdbtnOption_1);
//		
//		JRadioButton rdbtnOption_2 = new JRadioButton("Option 3");
//		rdbtnOption_2.setBounds(137, 401, 350, 50);
//		add(rdbtnOption_2);
//		
//		JRadioButton rdbtnOption_3 = new JRadioButton("Option 4");
//		rdbtnOption_3.setBounds(529, 401, 350, 50);
//		add(rdbtnOption_3);
//		
//		ButtonGroup bG = new ButtonGroup();
//		bG.add(rdbtnOption);
//		bG.add(rdbtnOption_1);
//		bG.add(rdbtnOption_2);
//		bG.add(rdbtnOption_3);
		
  		//for (int questionsDone = 0; questionsDone < questionQuantity; questionsDone ++){
  			quizmain(t.questionsSelect.getFirst().getQuestion(), t.questionsSelect.getFirst().getOptions(0), t.questionsSelect.getFirst().getOptions(1), t.questionsSelect.getFirst().getOptions(2), t.questionsSelect.getFirst().getOptions(3),questionQuantity, t);
  			//pressedButton = 
  			//t.questionsSelect.removeFirst();
  		//}
		
	}
	
	private void quizmain(String question, String option1, String option2, String option3, String option4, int numQuestions, Test t) {
		counter++;
		txtquestionHere = new JTextField();
		txtquestionHere.setText(question);
		txtquestionHere.setBounds(121, 121, 782, 48);
		add(txtquestionHere);
		txtquestionHere.setColumns(10);
		
		JButton btnSubmitAnswer = new JButton("Submit Answer");
		btnSubmitAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (counter<numQuestions) {
					quizmain(t.questionsSelect.get(counter).getQuestion(), t.questionsSelect.get(counter).getOptions(0), t.questionsSelect.get(counter).getOptions(1), t.questionsSelect.get(counter).getOptions(2), t.questionsSelect.get(counter).getOptions(3), numQuestions, t);
					boolean trueFalse = t.questionsSelect.get(counter).checkAnswer();
					if (trueFalse == true) {
						score++;
					}
				}
				else {
					// load endScreen
				}
			}
		});
		btnSubmitAnswer.setBounds(763, 627, 140, 40);
		
		add(btnSubmitAnswer);
		
		JRadioButton rdbtnOption = new JRadioButton(option1);
		rdbtnOption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.questionsSelect.get(counter).setSelectedOption(1);
			}
		});
		rdbtnOption.setBounds(140, 265, 350, 50);
		add(rdbtnOption);
		
		JRadioButton rdbtnOption_1 = new JRadioButton(option2);
		rdbtnOption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.questionsSelect.get(counter).setSelectedOption(2);
			}
		});
		rdbtnOption_1.setBounds(530, 265, 350, 50);
		add(rdbtnOption_1);
		
		JRadioButton rdbtnOption_2 = new JRadioButton(option3);
		rdbtnOption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.questionsSelect.get(counter).setSelectedOption(3);
			}
		});
		rdbtnOption_2.setBounds(140, 400, 350, 50);
		add(rdbtnOption_2);
		
		JRadioButton rdbtnOption_3 = new JRadioButton(option4);
		rdbtnOption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.questionsSelect.get(counter).setSelectedOption(4);
			}
		});
		rdbtnOption_3.setBounds(530, 400, 350, 50);
		add(rdbtnOption_3);
		
		ButtonGroup bG = new ButtonGroup();
		bG.add(rdbtnOption);
		bG.add(rdbtnOption_1);
		bG.add(rdbtnOption_2);
		bG.add(rdbtnOption_3);
	}
}
