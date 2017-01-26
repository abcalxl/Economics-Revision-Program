package program;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class EndQuiz extends JPanel {

	/**
	 * Create the panel.
	 */
	public EndQuiz(Main_ mainframe, int score) {
		setLayout(null);
		
		JLabel lblQuizFinished = new JLabel("Quiz Finished");
		lblQuizFinished.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblQuizFinished.setBounds(373, 48, 227, 42);
		add(lblQuizFinished);

		JButton btnBackToMain = new JButton("Back to Main Screen");
		btnBackToMain.setBounds(747, 671, 181, 27);
		btnBackToMain.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				mainframe.switchPanels("main", 0, 0);
			}
		});
		add(btnBackToMain);
		
		JLabel lblYourScoreWas = new JLabel("Your score was:");
		lblYourScoreWas.setBounds(149, 199, 181, 27);
		add(lblYourScoreWas);
		
		JLabel lblScore = new JLabel("");
		lblScore.setBounds(370, 199, 134, 27);
		add(lblScore);
		lblScore.setText(Integer.toString(score));
		
	}
}
