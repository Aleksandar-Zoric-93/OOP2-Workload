//Aleksandar Zoric
/* This program is the driver program for Member class.  Here the members will be stored in
 * an 'ArrayList' and saved to a .dat file which can be retrieved at a 
 * later stage.
*/

import java.util.List;
import java.util.ArrayList;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class MemberDriver{
	public static void main(String args[]) throws Exception
	{//Start of main
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
			
			String phone;
			phone = JOptionPane.showInputDialog("Please enter your phone number: ");
			
			String email;
			email = JOptionPane.showInputDialog("Please enter your email: ");
			
			eachMember = new Member(name,address,dob,phone,email);
			
			//Display details entered
			JOptionPane.showMessageDialog(null,"This is the details you entered: \n\n" + 
												eachMember.toString());
			
		
			//Change details
			option = JOptionPane.showConfirmDialog(null,"Do you wish to change your details? (Yes/No) ");
					
				
					if(option == JOptionPane.CANCEL_OPTION)
					{
						System.exit(0);
					}
				
				
			
					currentMembers.add(eachMember);
		
			
				//Saving Data
				File file = new File("savedMembers.dat");
				
				FileOutputStream fos = new FileOutputStream(file);
		
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(currentMembers);
				oos.close();//End of saving data
				
				
				
			}//end adding members
			
		
	}//End of main
}//End of class