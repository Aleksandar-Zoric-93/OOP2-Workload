//Aleksandar Zoric
/* This program is the driver program for the Credit Card class.  Here the members will be stored in
 * an 'ArrayList' and saved to a .dat file which can be retrieved at a 
 * later stage.
*/

import java.util.List;
import java.util.ArrayList;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class CreditDriver{
	public static void main(String args[]) throws Exception
	{//Start of main
		List<CreditCard> regCards = new ArrayList<CreditCard>();
		CreditCard eachCard;
		
		int option = JOptionPane.YES_NO_OPTION;
		int balance = 0;
		
		//Start of adding cards
		while (option == JOptionPane.YES_OPTION)
		{
			String forename;
			forename = JOptionPane.showInputDialog("Please enter your forename: ");
			
			String surname;
			surname = JOptionPane.showInputDialog("Please enter your surname: ");
			
			long cardNumber;
			cardNumber = Long.parseLong(JOptionPane.showInputDialog("Please enter your credit card Number: "));
			
			String expiryDate;
			expiryDate = JOptionPane.showInputDialog("Please enter the expiry date (month/year): ");
			
			int cvv;
			cvv = Integer.parseInt(JOptionPane.showInputDialog("Please enter the cvv number: (Back of Card)"));
			
			eachCard = new CreditCard(forename,surname,cardNumber,expiryDate,cvv,balance);
			
			//Display details entered
			JOptionPane.showMessageDialog(null,"This is the details you entered: \n\n" + 
												eachCard.toString());
					
			
			//Change details	
			option = JOptionPane.showConfirmDialog(null,"Do you wish to change your card details? (Yes/No) ");
				
				
				
				
				 if(option == JOptionPane.CANCEL_OPTION)
				{
					System.exit(0);
				}
				
					
					
				
					regCards.add(eachCard);
					
					//Saving Data
					
					JOptionPane.showMessageDialog(null,"Your details have been saved");
					
					File file1 = new File("savedCards.dat");
				
					FileOutputStream fos1 = new FileOutputStream(file1);
		
					ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
					oos1.writeObject(regCards);
					oos1.close();//End of saving data		
				
				
		
	}//End of adding cards
}//End of main
}//End of class