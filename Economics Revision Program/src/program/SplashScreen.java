package program;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class SplashScreen extends JFrame {
	
	final static int closeSplash = 4000;
	static private Timer timer;
	static SplashScreen frame;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new SplashScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		ActionListener launchMain = new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frame.dispose();
				timer.stop();
				Main_ m = new Main_();
				m.setVisible(true);
			}
		};
		
		timer = new Timer(closeSplash, launchMain);
	    timer.start();  
	}

	/**
	 * Create the frame.
	 */
	public SplashScreen() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 339);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SplashScreen.class.getResource("/resources/splash.png")));
		contentPane.add(lblNewLabel);
	}
}
