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
		
		txtquestionHere = new JTextField();
		txtquestionHere.setText("[Question Here]");
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
}
