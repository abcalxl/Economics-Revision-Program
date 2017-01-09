package program;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

public class MainScreen extends JPanel {

	/**
	 * Create the panel.
	 */
	public MainScreen(Main_ mainframe) {
		setLayout(null);
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(799, 677, 123, 23);
		add(btnExit);
		
		JButton btnHelpScreen = new JButton("Help Screen");
		btnHelpScreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainframe.switchPanels("help", 0, 0);
			}
		});
		btnHelpScreen.setBounds(799, 600, 123, 23);
		add(btnHelpScreen);
		
		JButton btnTopScores = new JButton("Top Scores (don't click currently dysfunctional)");
		btnTopScores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainframe.switchPanels("topscores", 0, 0);
			}
		});
		btnTopScores.setBounds(686, 560, 236, 23);
		add(btnTopScores);
		
		JLabel lblEconomicsRevisionProgram = new JLabel("Economics Revision Program");
		lblEconomicsRevisionProgram.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEconomicsRevisionProgram.setBounds(389, 39, 254, 23);
		add(lblEconomicsRevisionProgram);
		
		JButton btnNewQuiz = new JButton("New Quiz");
		btnNewQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainframe.switchPanels("newquiz", 0, 0);
			}
		});
		btnNewQuiz.setBounds(166, 396, 105, 27);
		add(btnNewQuiz);
	}
}