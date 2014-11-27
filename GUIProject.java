//Aleksandar Zoric

/* This is where the UI will be designed and displayed appropriately. Few things that may be included
 * here from the JFrame are as follow - JButton, JLabel, Jmenu etc. */
 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GUIProject extends JFrame{

	//Created menuBar
	JMenuBar menuBar = new JMenuBar();
	
	
	Member member = new Member();
	CreditCard creditCard = new CreditCard();
	
		
		//From Member.java
		String name = member.getName();
		String address = member.getAddress();
		String dob = member.getDOB();
		String phone = member.getPhone();
		String email = member.getEmail();
		
		//From CreditCard.java
		String forename = creditCard.getForename();
		String surname = creditCard.getSurname();
		long cardNumber = creditCard.getCardNumber();
		String expiryDate = creditCard.getExpiryDate();
		int cvv = creditCard.getCVV();
		int balance = creditCard.getBalance();
		
		
		public GUIProject(){
		setTitle("ClickPay");
		setSize(500,300);
		setLocation(800,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setJMenuBar(menuBar);
		menuUI();
}

	public static void main(String args[])
	{
		GUIProject menu = new GUIProject();
		menu.setVisible(true);
	}
	
	public void menuUI()
	{
		JMenu file = new JMenu("File");
		menuBar.add(file);
		JMenu memb = new JMenu("Members");
		menuBar.add(memb);
		MyHandler handler = new MyHandler();
		
		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(handler);
		file.add(exit);
		
		JMenuItem addMember = new JMenuItem("Add Member");
		addMember.addActionListener(handler);
		memb.add(addMember);
	}
	
	
	
	public class MyHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) 
		{
			try{
			//Add a Member
				if(e.getActionCommand().equals("Add Member"))
				{
					MemberDriver addMember = new MemberDriver();
					addMember.addMem();
				}
			}
			catch(Exception c){
			}
		}
	}
	
	
}
