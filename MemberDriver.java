//Aleksandar Zoric
/* This program is the driver program for Member.  Here the members will be stored in
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
	{
		List<Member> currentMembers = new ArrayList<Member>();
		Member eachMember;
		int option = JOptionPane.YES_NO_OPTION;
		int answer;
		
		//Start of adding members
		while (option == JOptionPane.YES_OPTION)
		{
		
		
			String name;
			name = JOptionPane.showInputDialog("Please enter your name: ");
			
			String address;
			address = JOptionPane.showInputDialog("Please enter your address: ");
			
			String dob;
			dob = JOptionPane.showInputDialog("Please enter your Date of Birth(day/month/year): ");
			
			double phone;
			phone = Double.parseDouble(JOptionPane.showInputDialog("Please enter your phone number: "));
			
			String email;
			email = JOptionPane.showInputDialog("Please enter your email: ");
			
			eachMember = new Member(name,address,dob,phone,email);
			
			answer = JOptionPane.showConfirmDialog(null,eachMember.toString() + "Is this correct? If so, click 'yes' to proceed.(Yes/No) ");
			
				if(answer == JOptionPane.YES_OPTION)
				{
					currentMembers.add(eachMember);	
					option = JOptionPane.showConfirmDialog(null,"Do you wish to add another member? (Yes/No) ");
				}
				
				else if(answer == JOptionPane.CANCEL_OPTION)
				{
					System.exit(0);
				}
				
			}//end adding members
			
		
	}
}