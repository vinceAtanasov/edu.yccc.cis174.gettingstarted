package edu.yccc.cis174.vinceAtanasov.slack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Slack {

	private JFrame frmSlackMessenger;
	private SlackService slackS = new SlackService();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Slack window = new Slack();
					window.frmSlackMessenger.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Slack() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSlackMessenger = new JFrame();
		frmSlackMessenger.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\velik\\Desktop\\Slack_Icon.png"));
		frmSlackMessenger.setTitle("Slack Messenger");
		frmSlackMessenger.setBounds(100, 100, 800, 326);
		frmSlackMessenger.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSlackMessenger.getContentPane().setLayout(null);
		
		JRadioButton rdbtnMessageMike = new JRadioButton("Message Mike");
		rdbtnMessageMike.setBounds(33, 42, 175, 35);
		frmSlackMessenger.getContentPane().add(rdbtnMessageMike);
		
		JRadioButton rdbtnMessageGeneral = new JRadioButton("Message #general");
		rdbtnMessageGeneral.setBounds(236, 42, 234, 35);
		frmSlackMessenger.getContentPane().add(rdbtnMessageGeneral);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(21, 180, 422, 54);
		frmSlackMessenger.getContentPane().add(textArea);
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				slackS.submitTextToSlack(textArea.getText());
				textArea.setText(null);
			}
		});
		btnSend.setBounds(493, 180, 168, 54);
		frmSlackMessenger.getContentPane().add(btnSend);
	}
}
