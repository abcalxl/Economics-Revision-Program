package program;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main_ extends JFrame {

	private JPanel contentPane;
	private Main_ mainframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_ frame = new Main_();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main_() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 786);
		mainframe = this;
		MainScreen mainscreen = new MainScreen(mainframe);
		mainscreen.setBounds(0, 0, 1024, 768);
		mainscreen.setVisible(true);
		setContentPane(mainscreen);
	}
	
	public void switchPanels(String pName, int topic, int questionquantity) {
		if (pName.equals("main")) {
			MainScreen mainscreen = new MainScreen(mainframe);
			mainscreen.setBounds(0, 0, 1024, 768);
			mainscreen.setVisible(true);
			setContentPane(mainscreen);
		}
		else if (pName.equals("help")) {
			HelpScreen helpscreen = new HelpScreen(mainframe);
			helpscreen.setBounds(0, 0, 1024, 768);
			helpscreen.setVisible(true);
			setContentPane(helpscreen);
		}
		else if (pName.equals("topscores")) {
			TopScores topscores = new TopScores(mainframe);
			topscores.setBounds(0, 0, 1024, 768);
			topscores.setVisible(true);
			setContentPane(topscores);
		}
		else if (pName.equals("newquiz")) {
			NewQuiz newquiz = new NewQuiz(mainframe);
			newquiz.setBounds(0, 0, 1024, 768);
			newquiz.setVisible(true);
			setContentPane(newquiz);
		}
		else if (pName.equals("showoption")) {
			ShowOption showoption = new ShowOption(mainframe, topic, questionquantity);
			showoption.setBounds(0, 0, 1024, 768);
			showoption.setVisible(true);
			setContentPane(showoption);
		}
		else {
			MainScreen mainscreen = new MainScreen(mainframe);
			mainscreen.setBounds(0, 0, 1024, 768);
			mainscreen.setVisible(true);
			setContentPane(mainscreen);
		}
	}
}
