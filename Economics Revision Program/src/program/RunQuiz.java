package program;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class RunQuiz extends JPanel {
	private JTextField txtquestionHere;
	private int counter = 0;
	public int score = 0;
	private boolean isSelected;
	//radio buttons
	private JRadioButton rdbtnOption;
	private JRadioButton rdbtnOption_1;
	private JRadioButton rdbtnOption_2;
	private JRadioButton rdbtnOption_3;
	private JLabel lblNoAnswerSelected;
	private ButtonGroup bG;
	Main_ mainframe = new Main_();

	/**
	 * Create the panel.
	 */
	public RunQuiz(Main_ mainframe, int selectedTopic, int questionQuantity) { //need to add topic later
		setLayout(null);
		Test t = new Test(questionQuantity);
		
		//quizmain(t.questionsSelect.getFirst().getQuestion(), t.questionsSelect.getFirst().getOptions(0), t.questionsSelect.getFirst().getOptions(1), t.questionsSelect.getFirst().getOptions(2), t.questionsSelect.getFirst().getOptions(3),questionQuantity, t);
  		
		txtquestionHere = new JTextField();
		//txtquestionHere.setText(question);
		txtquestionHere.setBounds(121, 121, 782, 48);
		add(txtquestionHere);
		txtquestionHere.setColumns(10);
		
		JButton btnSubmitAnswer = new JButton("Submit Answer");
		btnSubmitAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter++;
				if (counter<questionQuantity) {
					if (bG.getSelection() != null) {
						isSelected = true;
						System.out.println(bG.getSelection().toString());
					}
					else {
						isSelected = false;
					}
					if (isSelected == true) {
						lblNoAnswerSelected.setVisible(false);
						boolean trueFalse = t.questionsSelect.get(counter-1).checkAnswer();
						if (trueFalse == true) {
							score++;
							System.out.println("current score - " + score);
						}
						bG.clearSelection();
						quizmain(t.questionsSelect.get(counter).getQuestion(), t.questionsSelect.get(counter).getOptions(0), t.questionsSelect.get(counter).getOptions(1), t.questionsSelect.get(counter).getOptions(2), t.questionsSelect.get(counter).getOptions(3), questionQuantity, t);
					}
					else {
						lblNoAnswerSelected.setVisible(true);
						counter--;
					}
				}
				else {
					boolean trueFalse = t.questionsSelect.get(counter-1).checkAnswer();
					if (trueFalse == true) {
						score++;
					}
					System.out.println("fianl score - " + score);
					mainframe.switchPanels("endquiz", score, 0);
				}
				
				System.out.println(counter);
			}
		});
		btnSubmitAnswer.setBounds(763, 627, 140, 40);
		add(btnSubmitAnswer);
		
		rdbtnOption = new JRadioButton("");
		rdbtnOption.setBounds(140, 265, 350, 50);
		add(rdbtnOption);
		
		rdbtnOption_1 = new JRadioButton("");
		rdbtnOption_1.setBounds(530, 265, 350, 50);
		add(rdbtnOption_1);
		
		rdbtnOption_2 = new JRadioButton("");
		rdbtnOption_2.setBounds(140, 400, 350, 50);
		add(rdbtnOption_2);
		
		rdbtnOption_3 = new JRadioButton("");
		rdbtnOption_3.setBounds(530, 400, 350, 50);
		add(rdbtnOption_3);
		
		bG = new ButtonGroup();
		bG.add(rdbtnOption);
		bG.add(rdbtnOption_1);
		bG.add(rdbtnOption_2);
		bG.add(rdbtnOption_3);
		
		lblNoAnswerSelected = new JLabel("No Answer Selected");
		lblNoAnswerSelected.setForeground(Color.RED);
		lblNoAnswerSelected.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNoAnswerSelected.setBounds(748, 576, 175, 40);
		add(lblNoAnswerSelected);
		lblNoAnswerSelected.setVisible(false);
		
		quizmain(t.questionsSelect.get(counter).getQuestion(), t.questionsSelect.get(counter).getOptions(0), t.questionsSelect.get(counter).getOptions(1), t.questionsSelect.get(counter).getOptions(2), t.questionsSelect.get(counter).getOptions(3), questionQuantity, t);
	}
	
	private void quizmain(String question, String option1, String option2, String option3, String option4, int numQuestions, Test t) {
		txtquestionHere.setText(question);
		rdbtnOption.setText(option1);
		rdbtnOption_1.setText(option2);
		rdbtnOption_2.setText(option3);
		rdbtnOption_3.setText(option4);
		
		rdbtnOption_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.questionsSelect.get(counter).setSelectedOption(3);
				System.out.println(t.questionsSelect.get(counter).getSelectedOption()+" selected");
			}
		});
		
		rdbtnOption_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.questionsSelect.get(counter).setSelectedOption(2);
				System.out.println(t.questionsSelect.get(counter).getSelectedOption()+" selected");
			}
		});
		
		rdbtnOption_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.questionsSelect.get(counter).setSelectedOption(1);
				System.out.println(t.questionsSelect.get(counter).getSelectedOption()+" selected");
			}
		});
		
		rdbtnOption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.questionsSelect.get(counter).setSelectedOption(0);
				System.out.println(t.questionsSelect.get(counter).getSelectedOption()+" selected");
			}
		});
	}
}
