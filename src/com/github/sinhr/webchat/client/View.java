package com.github.sinhr.webchat.client;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;


public class View {

	private JFrame frame;
	private JScrollPane scrollPane;
	private JTextField typeField;
	private JButton btnSend, btnStartChat;
	private JTextArea textArea;
	private JTextField nameField;
	private JLabel lblUserName;
	
	


	/**
	 * Launch the application.
	 /
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * @return the scrollPane
	 */
	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	/**
	 * @return the typeField
	 */
	public JTextField getTypeField() {
		return typeField;
	}

	/**
	 * @return the btnSend
	 */
	public JButton getBtnSend() {
		return btnSend;
	}

	/**
	 * @return the btnStartChat
	 */
	public JButton getBtnStartChat() {
		return btnStartChat;
	}
	
	/**
	 * @return the textArea
	 */
	public JTextArea getTextArea() {
		return textArea;
	}

	/**
	 * @return the nameField
	 */
	public JTextField getNameField() {
		return nameField;
	}

	/**
	 * @return the lblYourName
	 */
	public JLabel getLblYourName() {
		return lblUserName;
	}

	/**
	 * @param frame the frame to set
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * @param scrollPane the scrollPane to set
	 */
	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	/**
	 * @param typeField the typeField to set
	 */
	public void setTypeField(JTextField typeField) {
		this.typeField = typeField;
	}

	/**
	 * @param btnSend the btnSend to set
	 */
	public void setBtnSend(JButton btnSend) {
		this.btnSend = btnSend;
	}

	/**
	 * @param btnStartChat the btnStartChat to set
	 */
	public void setBtnStartChat(JButton btnStartChat) {
		this.btnStartChat = btnStartChat;
	}
	
	/**
	 * @param textArea the textArea to set
	 */
	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	/**
	 * @param nameField the nameField to set
	 */
	public void setNameField(JTextField nameField) {
		this.nameField = nameField;
	}

	/**
	 * @param lblUserName the lblUserName to set
	 */
	public void setLblUserName(JLabel lblUserName) {
		this.lblUserName = lblUserName;
	}

	/**
	 * Create the application.
	 */
	public View(ClientModel m) {
		initialize(m);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ClientModel m) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[grow][grow]", "[][grow][]"));
		
//		btnStartChat = new JButton("Start Chat");
//		btnStartChat.setActionCommand("start chat");
//		btnStartChat.addActionListener(new ChatController(this, m));
//		frame.getContentPane().add(btnStartChat, "cell 0 0");
		
		lblUserName = DefaultComponentFactory.getInstance().createLabel("Your Name:");
		frame.getContentPane().add(lblUserName, "cell 0 0,alignx trailing");
		
		nameField = new JTextField();
		nameField.setText("Anonymous");
		frame.getContentPane().add(nameField, "cell 1 0,growx");
		nameField.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		frame.getContentPane().add(scrollPane, "cell 0 1 2 1,grow");
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		typeField = new JTextField();
		frame.getContentPane().add(typeField, "cell 0 2,growx");
		typeField.setColumns(10);
		
		btnSend = new JButton("Send");
		btnSend.setActionCommand("send");
		btnSend.addActionListener(new ChatController(this, m));
		frame.getContentPane().add(btnSend, "cell 1 2");
	}

}
