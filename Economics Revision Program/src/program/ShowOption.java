package program;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import questions.QuestionHandler;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ShowOption extends JPanel {

	/**
	 * Create the panel.
	 */
	public ShowOption(Main_ mainframe, int selectedTopic, int questionquantity) {
		setLayout(null);
		
		JLabel lblYouHaveChosen = new JLabel("You have chosen:");
		lblYouHaveChosen.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblYouHaveChosen.setBounds(110, 80, 295, 52);
		add(lblYouHaveChosen);
		
		JButton btnBackToMain = new JButton("Back to Main Screen");
		btnBackToMain.setBounds(747, 671, 181, 27);
		btnBackToMain.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				mainframe.switchPanels("main", 0, 0);
			}
		});
		add(btnBackToMain);
		
		JTextArea txtrChosenquantity = new JTextArea();
		txtrChosenquantity.setBackground(null);
		txtrChosenquantity.setText(Integer.toString(questionquantity));
		txtrChosenquantity.setBounds(320, 160, 67, 25);
		add(txtrChosenquantity);
		
		JTextArea txtrChosentopic = new JTextArea();
		txtrChosentopic.setBackground(null);
		txtrChosentopic.setText(Integer.toString(selectedTopic));
		txtrChosentopic.setBounds(320, 190, 67, 25);
		add(txtrChosentopic);
		
		JLabel lblTopic = new JLabel("Topic:");
		lblTopic.setBounds(150, 190, 156, 23);
		add(lblTopic);
		
		JLabel lblNumberOfQuestions = new JLabel("Number of questions:");
		lblNumberOfQuestions.setBounds(150, 160, 156, 22);
		add(lblNumberOfQuestions);
		
		JButton btnConfirm = new JButton("CONFIRM");
		btnConfirm.setBounds(693, 9, 321, 93);
		add(btnConfirm);
		
		JLabel lblHi = new JLabel("hi:");
		lblHi.setBounds(150, 224, 156, 23);
		add(lblHi);
		
		
		QuestionHandler q = new QuestionHandler();
		
		JTextArea textArea = new JTextArea();
		textArea.setText(q.lines.get(0));
		textArea.setBackground((Color) null);
		textArea.setBounds(320, 226, 409, 52);
		add(textArea);
		

	}
}
