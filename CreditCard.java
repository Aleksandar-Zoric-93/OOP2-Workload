//Aleksandar Zoric
/* This program will create the CreditCard class for the project. Each member will
 * have a credit card associated with their credentials.
 * It will contain mutator, accessor and constructor methods, and also a toString() method to 
 * display it in a specific format */
 
  import java.io.*;
  
  public class CreditCard implements Serializable{
 	
 	//Attributes
 	private String forename;
 	private String surname;
 	private long cardNumber;
 	private String expiryDate;
 	private int cvv;
 	private int balance = CreditDriver.currentBalance;
 	CreditDriver c1;
 	//end of Attributes
 	
 	
 		
 	//Constructor methods
 	public CreditCard(CreditDriver c1)
 	{
 		this("Unknown","Unknown",0,"",0,CreditDriver.currentBalance);	
 		this.c1 = c1;
 	}
 		
 		

 	public CreditCard(String forename, String surname, 
 				  long cardNumber, String expiryDate, int cvv, int balance)
 	{
 		setForename(forename);
 		setSurname(surname);
 		setCardNumber(cardNumber);
 		setExpiry(expiryDate);
 		setCVV(cvv);
 		setBalance(balance);	
 	}
 	// end of Constructor methods
 	
 	
 	
 	//Mutator methods
 	public void setForename(String forename)
 	{
 		this.forename = forename;
 	}
 	
 	public void setSurname(String surname)
 	{
 		this.surname = surname;
 	}
 	
 	public void setCardNumber(long cardNumber)
 	{
 		this.cardNumber = cardNumber;
 	}
 	
 	public void setExpiry(String expiryDate)
 	{
 		this.expiryDate = expiryDate;
 	}
 	
 	public void setCVV(int cvv)
 	{
 		this.cvv = cvv;
 	}
 	
 		public void setBalance(int balance)
 	{
 		this.balance = balance;
 	}
 	// end of Mutator methods
 	
 	
 	
 	//Accessor methods
 	public String getForename()
 	{
 		return forename;
 	}
 	
 	public String getSurname()
 	{
 		return surname;
 	}
 	
 	public long getCardNumber()
 	{
 		return cardNumber;
 	}
 	
 	public String getExpiryDate()
 	{
 		return expiryDate;
 	}
 	
 	public int getCVV()
 	{
 		return cvv;
 	}
 	
 	public int getBalance()
 	{
 		return balance;
 	}
 	// end of Accessor methods
 	
 	
 	
 	
 		//toString methods
 	public String toString()
 	{
 		return String.format("Forename: %s\nSurname: %s\nCard Number: %d\nExpiry Date: %s\nCVV number: %d\n\n",
 							   	getForename(),getSurname(),getCardNumber(),getExpiryDate(),getCVV());
 	}
  }