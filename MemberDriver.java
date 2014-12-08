//Aleksandar Zoric
/*This program is the driver program for Member class.  Here the members will be stored in
 * an 'ArrayList' and saved to a .dat file which can be retrieved at a 
 * later stage.
*/

import java.util.List;
import java.util.ArrayList;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class MemberDriver{
	public static int idNum;
	
	public static void main(String args[])
	{
	//Start of main
	
	GUIProject gui = new GUIProject();
	gui.setVisible(true);
		
	}//End of main
	
	
	//----------------------------------------------------------------------


	//Start of a method
	public static void addMem()  throws IOException
	{
		List<Member> currentMembers = new ArrayList<Member>();
		Member eachMember;
		int option = JOptionPane.YES_NO_OPTION;
		

		//Start of adding members
		while (option == JOptionPane.YES_OPTION)
		{
		
			String name;
			name = JOptionPane.showInputDialog("Please enter your name: ");
			
			String address;
			address = JOptionPane.showInputDialog("Please enter your address: ");
			
			String dob;
			dob = JOptionPane.showInputDialog("Please enter your Date of Birth(day/month/year): ");
			
			
			String email;
			email = JOptionPane.showInputDialog("Please enter your email: ");
			
			
			idNum = Integer.parseInt(JOptionPane.showInputDialog("Please enter an ID number you will remember for future references: "));
			
			eachMember = new Member(name,address,dob,email,idNum);
			
			//Display details entered
			JOptionPane.showMessageDialog(null,"This is the details you entered: \n\n" + 
												eachMember.toString());
			
													
			
			
			
		
			//Change details
			option = JOptionPane.showConfirmDialog(null,"Do you wish to add more members?\n(Other members will have permission to use all cards this prfile) (Yes/No) ");
					
				
				//Exit of canceled
					if(option == JOptionPane.CANCEL_OPTION)
					{
						System.exit(0);
					}
				
				
				//Add each member to arraylist
					currentMembers.add(eachMember);
		
/*****************************************************
*    Title:  saveFriends.java, lines 94 - 102
*    Author: John Walsh
*    Site owner/sponsor:  ITT
*    Date: 05/12/2014 05:16:43
*    Code version:  edited Dec 05'14 at 15:33
*    Availability: John W/Class Work/Week10Persistance/saveFriends.java (Accessed 05 December 2014)
*    Modified:  Code refactored (Identifiers renamed)
*	 Comment: This code has been used throughout the project, code refactored in other classes
*****************************************************/

				//Saving Data
				
				JOptionPane.showMessageDialog(null,"Your details have been saved");
				
				File file = new File("savedMembers.dat");
				
				FileOutputStream fos = new FileOutputStream(file);
		
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(currentMembers);
				oos.close();//End of saving data
				
				
				
				
			}//end adding members
	}//End of a method
	
		public int getMemID()
			{
				return idNum;
			}
	
	
}//End of class