//Aleksandar Zoric

/* This is where the UI will be designed and displayed appropriately. Few things that may be included
 * here from the JFrame are as follow - JButton, JLabel, Jmenu etc. */

//Import statements 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.io.*;


public class GUIProject extends JFrame{

	//Created menuBar
	JMenuBar menuBar = new JMenuBar();
	
	//Created J'Components
	//JLabel with embedded HTML to format the text
	JLabel jLabel = new JLabel("<html><br><br><br><br><br><br><br><br><br>" +
							   "If you are experiencing any issues with the system,<br> please type the word 'issue' in the field given. " +
								"<br>Once this message is recieved, we will have one of our members contact you. </html>");
	
	JButton checkBal = new JButton("Check Balance");
	JLabel jLabel1 = new JLabel("<html><br><br></html>");
	JButton submit = new JButton("Submit");
	JTextField textField = new JTextField(15);
	Member member = new Member();
	
	
	
		//Customizing the GUI Window/ContentPane itself
		public GUIProject(){
		setTitle("ClickPay");
		setSize(500,300);
		setLocation(800,100);
		getContentPane().setBackground(Color.DARK_GRAY); 
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
	
	
	//------------------------------------------------------------------------------
	
	
	//GUI menu Customization
	public void menuUI()
	{
		JMenu file = new JMenu("File");
		menuBar.add(file);
		JMenu memb = new JMenu("Members");
		menuBar.add(memb);
		JMenu card = new JMenu("Credit Card");
		menuBar.add(card);
		
		//Created handler's (used later)
		MemberHandler handler = new MemberHandler();
		CardHandler handler1 = new CardHandler();
		InfoHandler handler2 = new InfoHandler();
		
		
		//Adding JMenuItems and associate a handler with each 'item'
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
		
		JMenuItem addCash = new JMenuItem("Transfer Money");
		addCash.addActionListener(handler1);
		card.add(addCash);
		
		//Created a layout and setting the layout (FlowLayout in this case)
		FlowLayout flowLayout = new FlowLayout();
 		setLayout(flowLayout);
 		
 		//Adding each J'Component to my window frame
 		add(checkBal);
 		checkBal.addActionListener(handler1);
 		
 		add(textField);
 		textField.addActionListener(handler2);
 		
 		add(submit);
 		submit.addActionListener(handler2);
 		
 		
 		add(jLabel);
 		jLabel.setForeground(Color.GRAY);
 		
 		
 	
 		
	}
	//End of GUI Customization
	
	
	
	
	//--------------------------------------------------------------------------
	
	

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
				
/*****************************************************
*    Title:  readFriends.java, lines 157 - 166
*    Author: John Walsh
*    Site owner/sponsor:  ITT
*    Date: 01/12/2014 16:23:11
*    Code version:  edited Dec 03'14 at 17:12
*    Availability:  John W/Class Work/Week10Persistance/readFriends.java (Accessed 01 December 2014)
*    Modified:  Code refactored (Identifiers renamed)
*	 Comment: This code has been used throughout other classes, code refactored
*****************************************************/
				
			
			
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
					JOptionPane.showMessageDialog(null,"Please wait. Lodging your balance back into your back account...");
					JOptionPane.showMessageDialog(null,"Successful. Thank you for using our system!");
					System.exit(0);
				}
				//End of Exit System
				
				
				
				
			}
			catch(Exception c){
			}
		}//End of ActionPerformed
	}//End of Member Handler
	
	
	
	//-----------------------------------------------------




	//Start of CardHandler
	public class CardHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			try{//Start of Try
			
			CreditDriver c2 = new CreditDriver();
			
				//Add a Credit Card
				if(e.getActionCommand().equals("Add Card"))
				{
					c2.addCardDriver();
				}
		
				
				
					//Add money to account 
				else if(e.getActionCommand().equals("Transfer Money"))
				{
					c2.transfer();
					JOptionPane.showMessageDialog(null,"Your new balance is € " + c2.getCurrentBalance());
					
				}
				
				
				
				
				//Check Balance
				else if(e.getActionCommand().equals("Check Balance"))
				{
	
					
/*****************************************************
*    Title:  StreamToRead.java, lines 236 - 247
*    Author: Unknown
*    Site owner/sponsor:  javacoffeebreak.com
*    Date: 03/12/2014 23:27:56
*    Code version:  edited Dec 04'14 at 01:20
*    Availability:  http://www.javacoffeebreak.com/faq/faq0004.html (Accessed 03 December 2014)
*    Modified:  Code refactored (Identifiers renamed)
*****************************************************/

						
					//Read savedBalance.dat (Referenced at end of Class)
						
					// Stream to read file
					FileInputStream fin;		

					try
					{
		  				  // Open an input stream
		   					 fin = new FileInputStream ("savedBalance.dat");

		   				 // Read a line of text
		   					 System.out.println( new DataInputStream(fin));

		   				 // Close our input stream
		   					 fin.close();		
					}
						// Catches any error conditions
						catch (IOException l){
						}
						
							JOptionPane.showMessageDialog(null,"Your current Balance is € " + c2.getCurrentBalance());	
				}
				//End of checking balance
			
		
			}catch(Exception d){
			}//End of Try
			//End of Add Card
			
				
		}//End of actionPerformed
		
	}//End of CardHandler
	
	
	
	
	
	
			//-----------------------------------------------------
	
	
	//Start of Info Handler
		public class InfoHandler implements ActionListener{
				public void actionPerformed(ActionEvent e) 
				{
					//User types 'issue' if they experience any trouble and a message is recieved
					if(textField.getText().equalsIgnoreCase("Issue"))
					{
						JOptionPane.showMessageDialog(null,"One of our team members will contact you shortly to resolve your issue" + 
														   "\nWe apologise for any inconvience this issue may have caused.");
					}
					
					//Otherwise, as some kind of feedback, they can type 'none', and a corresponding message is recieved
					else if(textField.getText().equalsIgnoreCase("None"))
					{
						JOptionPane.showMessageDialog(null,"That is good. If any issues occur in the future, you can always have one of our team members contact you by " +
															"\n typing 'issue' in the field above. Thank you.");	
					}
					
					//Else error message
					else
					{
						JOptionPane.showMessageDialog(null,"You must enter either 'issue' or 'none' to continue","Error",
														JOptionPane.WARNING_MESSAGE);	
						
					}
		
		
				}//End of actionPerformed
		}//End of Info Handler
	
	
}//End of Class GUIProject

