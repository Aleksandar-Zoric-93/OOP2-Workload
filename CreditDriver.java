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
	public static int currentBalance;
	
	public static void main(String args[]) throws Exception
	{
	//Start of main
		GUIProject gui = new GUIProject();
		gui.setVisible(true);
	
	}//End of main
	
	
	
	//--------------------------------------------------------------------
	
	
	
	public static void addCardDriver()  throws IOException
	{
	
		List<CreditCard> regCards = new ArrayList<CreditCard>();
		CreditCard eachCard;
		
		int option = JOptionPane.YES_OPTION;
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
			
			
			option = JOptionPane.showConfirmDialog(null,"Do you wish to change your card details? (Yes/No) ");
			
			eachCard = new CreditCard(forename,surname,cardNumber,expiryDate,cvv,balance);
			
			//Display details entered
			JOptionPane.showMessageDialog(null,"This is the details you entered: \n\n" + 
												eachCard.toString());
					
			
			//Change details	
			option = JOptionPane.showConfirmDialog(null,"Do you wish to add more cards?\n (All cards will be available to other members on this profile (Yes/No) ");
				
				
				
			//Exit of canceled
				 if(option == JOptionPane.CANCEL_OPTION)
				{
					System.exit(0);
				}
				
			
						
					
				if(option == JOptionPane.NO_OPTION)
				{
				
				//Add each card to arraylist
					regCards.add(eachCard);
					
					//Saving Data
					
					JOptionPane.showMessageDialog(null,"Your details have been saved");
					
					File file1 = new File("savedCards.dat");
				
					FileOutputStream fos1 = new FileOutputStream(file1);
		
					ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
					oos1.writeObject(regCards);
					oos1.close();//End of saving data	
				}
					
						
	}//End of adding cards
	}//End of method
	
	
	
	//--------------------------------------------------------------------------------------------
	
	
	
	//Transfer money to account method
		public void transfer()
		{
				List<Integer> ids = new ArrayList<Integer>();
				Integer eachID;
				
				//Store idNum from MemberDriver class within a local variable here called idNum
				MemberDriver m2 = new MemberDriver();
			 	int idNum = m2.idNum;
 				
				CreditCard c1 = new CreditCard(this);
			
			
				eachID = new Integer(idNum);
				ids.add(eachID);
				
				ArrayList<Integer> myIDS = new ArrayList<Integer>();
				
					
					
					
					try{
				
						//Read savedMember.dat (Referenced at end of Class)
						
						File readID = new File("savedID.dat");
	
						FileInputStream fis = new FileInputStream(readID);
						ObjectInputStream ois = new ObjectInputStream(fis);
						myIDS =(ArrayList<Integer>) ois.readObject();
					
					}catch(Exception h){
					}
					
				
				
				
			int enterID;
			enterID = Integer.parseInt(JOptionPane.showInputDialog("Please enter the ID given when registered: "));
			
			if(enterID == eachID)
			{
			
			String branchName;
			branchName = JOptionPane.showInputDialog("Please enter your bank branch name: ");
			
			String accountName;
			accountName = JOptionPane.showInputDialog("Please enter the name associated with the bank account: ");
			
			
			//confirm details entered
			JOptionPane.showMessageDialog(null,"Information being confirmed with your bank...");
			
		
		
		
		//Some processing...
			int addBalance;
			addBalance = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount you wish to transfer: "));
			
			currentBalance = c1.getBalance();
			
			currentBalance += addBalance;
			
				JOptionPane.showMessageDialog(null,"Processing...");
			
				JOptionPane.showMessageDialog(null,"You have transfered € " + addBalance);
				
			
				int saveBal=0;
				saveBal += currentBalance;
				
		
		
		
			
				//Saving Data
				try{
					
					JOptionPane.showMessageDialog(null,"Your details have been saved");
					
					File file1 = new File("savedBalance.dat");
				
					FileOutputStream fos1 = new FileOutputStream(file1);
		
					ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
					oos1.writeObject(saveBal);
					oos1.close();
				}catch(Exception a){
				}//End of saving data
			}
			
			
			
		
			//If there isnt any member with a valid ID
			else
			{
				JOptionPane.showMessageDialog(null,"There is no current member with that id number!","Error!",
														JOptionPane.WARNING_MESSAGE);
				
			}		
				
			
					
		}//End of transer method
		
		public int getCurrentBalance()
			{
				return currentBalance;
			}
			

}//End of class