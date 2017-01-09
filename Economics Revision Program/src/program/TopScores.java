package program;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TopScores extends JPanel {
	private JTextField txtFirst;
	private JTextField txtSecond;
	private JTextField txtThird;

	/**
	 * Create the panel.
	 */
	public TopScores(Main_ mainframe) {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Top Scores!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(410, 26, 176, 43);
		add(lblNewLabel);
		
		JButton btnBackToMain = new JButton("Back to Main Screen");
		btnBackToMain.setBounds(747, 671, 181, 27);
		btnBackToMain.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				mainframe.switchPanels("main", 0, 0);
			}
		});
		add(btnBackToMain);
		
		TopScoresHandler t = new TopScoresHandler();
		
		txtFirst = new JTextField();
		txtFirst.setText( Integer.toString(t.integerScores[ t.integerScores.length-1 ]));
		txtFirst.setBounds(444, 94, 116, 24);
		add(txtFirst);
		txtFirst.setColumns(10);
		
		txtSecond = new JTextField();
		txtSecond.setText(Integer.toString(t.integerScores[ t.integerScores.length-2 ]));
		txtSecond.setBounds(444, 146, 116, 24);
		add(txtSecond);
		txtSecond.setColumns(10);
		
		txtThird = new JTextField();
		txtThird.setText(Integer.toString(t.integerScores[ t.integerScores.length-3 ]));
		txtThird.setBounds(444, 209, 116, 24);
		add(txtThird);
		txtThird.setColumns(10);

	}
}
