package program;

import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JRadioButton;

public class RunQuiz extends JPanel {
	private JTextField txtquestionHere;

	/**
	 * Create the panel.
	 */
	public RunQuiz(Main_ mainframe, int selectedTopic, int questionQuantity) {
		setLayout(null);
		Test t = new Test(questionQuantity);
		int questionsDone = 0;
		
		txtquestionHere = new JTextField();
		txtquestionHere.setText(t.questionsSelect.get(1));
		txtquestionHere.setBounds(127, 130, 782, 48);
		add(txtquestionHere);
		txtquestionHere.setColumns(10);
		
		JButton btnSubmitAnswer = new JButton("Submit Answer");
		btnSubmitAnswer.setBounds(708, 569, 140, 39);
		add(btnSubmitAnswer);
		
		JRadioButton rdbtnOption = new JRadioButton("Option1");
		rdbtnOption.setBounds(137, 265, 109, 23);
		add(rdbtnOption);
		
		JRadioButton rdbtnOption_1 = new JRadioButton("Option2");
		rdbtnOption_1.setBounds(529, 265, 109, 23);
		add(rdbtnOption_1);
		
		JRadioButton rdbtnOption_2 = new JRadioButton("Option3");
		rdbtnOption_2.setBounds(137, 355, 109, 23);
		add(rdbtnOption_2);
		
		JRadioButton rdbtnOption_3 = new JRadioButton("Option4");
		rdbtnOption_3.setBounds(529, 355, 109, 23);
		add(rdbtnOption_3);
		
		
		
	}
	
	private void quizmain(String question, String option1, String option2, String option3, String option4) {
		txtquestionHere = new JTextField();
		txtquestionHere.setText(question);
		txtquestionHere.setBounds(127, 130, 782, 48);
		add(txtquestionHere);
		txtquestionHere.setColumns(10);
		
		JButton btnSubmitAnswer = new JButton("Submit Answer");
		btnSubmitAnswer.setBounds(708, 569, 140, 39);
		add(btnSubmitAnswer);
		
		JRadioButton rdbtnOption = new JRadioButton(option1);
		rdbtnOption.setBounds(137, 265, 109, 23);
		add(rdbtnOption);
		
		JRadioButton rdbtnOption_1 = new JRadioButton(option2);
		rdbtnOption_1.setBounds(529, 265, 109, 23);
		add(rdbtnOption_1);
		
		JRadioButton rdbtnOption_2 = new JRadioButton(option3);
		rdbtnOption_2.setBounds(137, 355, 109, 23);
		add(rdbtnOption_2);
		
		JRadioButton rdbtnOption_3 = new JRadioButton(option4);
		rdbtnOption_3.setBounds(529, 355, 109, 23);
		add(rdbtnOption_3);
	}
}
