//Aleksandar Zoric

/* This is where the UI will be designed and displayed appropriately. Few things that may be included
 * here from the JFrame are as follow - JButton, JLabel, Jmenu etc. */
 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

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
		//End
		
		
		//From CreditCard.java
		String forename = creditCard.getForename();
		String surname = creditCard.getSurname();
		long cardNumber = creditCard.getCardNumber();
		String expiryDate = creditCard.getExpiryDate();
		int cvv = creditCard.getCVV();
		int balance = creditCard.getBalance();
		//End
		
		
		
		//Customizing the GUI Window/ContentPane itself
		public GUIProject(){
		setTitle("ClickPay");
		setSize(500,300);
		setLocation(800,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setJMenuBar(menuBar);
		menuUI();
		//End of GUI Window/ContentPane
}

	//Start of main
	public static void main(String args[])
	{
		GUIProject menu = new GUIProject();
		menu.setVisible(true);
	}
	//End of main
	
	//GUI menu Customization
	public void menuUI()
	{
		JMenu file = new JMenu("File");
		menuBar.add(file);
		JMenu memb = new JMenu("Members");
		menuBar.add(memb);
		JMenu card = new JMenu("Credit Card");
		menuBar.add(card);
		MemberHandler handler = new MemberHandler();
		CardHandler handler1 = new CardHandler();
		
		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(handler);
		file.add(exit);
		
		JMenuItem addMember = new JMenuItem("Add Member");
		addMember.addActionListener(handler);
		memb.add(addMember);
		
		JMenuItem displayMember = new JMenuItem("Display Member");
		displayMember.addActionListener(handler);
		memb.add(displayMember);
		
		JMenuItem addCard = new JMenuItem("Add Card");
		addCard.addActionListener(handler1);
		card.add(addCard);
	}
	//End of GUI Customization
	
	
	
	
	//Member Handler
	public class MemberHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) 
		{//Start of ActionPerformed
			
			try{
			//Add a Member
				if(e.getActionCommand().equals("Add Member"))
				{
					MemberDriver addMember = new MemberDriver();
					addMember.addMem();
				}
				
			
			
			//Display Member
		
				else if(e.getActionCommand().equals("Display Member"))
				{
						//Read savedMember.dat (Referenced at end of Class)
						ArrayList<Member> myMembers = new ArrayList<Member>();
						
						File readMem = new File("savedMembers.dat");
	
						FileInputStream fis = new FileInputStream(readMem);
						ObjectInputStream ois = new ObjectInputStream(fis);
						myMembers =(ArrayList<Member>) ois.readObject();
					
							//For loop to display Members
							for(Member m : myMembers)
							{
							JOptionPane.showMessageDialog(null,m.toString());
							}
							//End of For loop
 							   
				}
				
				
				//Exit System
				else if(e.getActionCommand().equals("Exit"))
				{
					JOptionPane.showMessageDialog(null,"Thank you for using our system!");
					System.exit(0);
				}
				//End of Exit System
				
				
				
				
			}
			catch(Exception c){
			}
		}//End of ActionPerformed
	}//End of Member Handler
	
	
	
	
	//Start of CardHandler
	public class CardHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			try{
			
				//Add a Credit Card
				if(e.getActionCommand().equals("Add Card"))
				{
					CreditDriver addCard = new CreditDriver();
					addCard.addCardDriver();
				}
		
			}catch(Exception d){
			}
			
			
		}
		
	}
	
	
}//End of Class GUIProject
