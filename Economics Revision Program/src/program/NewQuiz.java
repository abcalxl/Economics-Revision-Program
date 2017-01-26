package program;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NewQuiz extends JPanel {
	private JTextField txtNumberOfQuestions;
	private JComboBox comboBox;
	private Main_ mainframe_;
	/**
	 * Create the panel.
	 */
	public NewQuiz(Main_ mainframe) {
		setLayout(null);
		mainframe_ = mainframe;
		String[] topicArray = {"Select the unit", "Unit 1", "Unit 2", "Unit 3", "Unit 4"};
		
		JLabel lblNewQuiz = new JLabel("New Quiz");
		lblNewQuiz.setBounds(449, 62, 181, 37);
		add(lblNewQuiz);
		
		JButton btnBackToMain = new JButton("Back to Main Screen");
		btnBackToMain.setBounds(747, 671, 181, 27);
		btnBackToMain.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				mainframe.switchPanels("main", 0, 0);
			}
		});
		add(btnBackToMain);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(747, 600, 181, 27);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				submit();
			}
		});
		add(btnSubmit);
		
		comboBox = new JComboBox(topicArray);
		comboBox.setBounds(299, 197, 181, 27);
		add(comboBox);
		
		
		txtNumberOfQuestions = new JTextField();
		txtNumberOfQuestions.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtNumberOfQuestions.setText("");
				repaint();
			}
		});
		txtNumberOfQuestions.setText("Number of Questions");
		txtNumberOfQuestions.setBounds(299, 248, 181, 27);
		add(txtNumberOfQuestions);
		txtNumberOfQuestions.setColumns(10);
		
		JLabel lblChooseUnit = new JLabel("Choose Unit:");
		lblChooseUnit.setBounds(126, 200, 102, 21);
		add(lblChooseUnit);
		
		JLabel lblChooseNumber = new JLabel("Choose number:");
		lblChooseNumber.setBounds(126, 251, 103, 21);
		add(lblChooseNumber);

	}
	
	private void submit() {
		int selectedTopic = comboBox.getSelectedIndex();
		int selectedNumber = Integer.parseInt(txtNumberOfQuestions.getText());
		mainframe_.switchPanels("showoption", selectedTopic, selectedNumber);
	}
}
