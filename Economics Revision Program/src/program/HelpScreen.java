package program;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelpScreen extends JPanel {

	/**
	 * Create the panel.
	 */
	public HelpScreen(Main_ mainframe) {
		setLayout(null);
		
		JLabel lblHelpScreen = new JLabel("Help Screen");
		lblHelpScreen.setBounds(444, 46, 107, 26);
		add(lblHelpScreen);
		
		JButton btnBackToMain = new JButton("Back to Main Screen");
		btnBackToMain.setBounds(800, 690, 171, 26);
		btnBackToMain.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				mainframe.switchPanels("main", 0, 0);
			}
		});
		add(btnBackToMain);
	}
}