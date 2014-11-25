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
 	private int expiryDate;
 	private int cvv;
 	
 	
 		
 		//Constructors
 	public CreditCard()
 	{
 		this("Unknown","Unknown",0,0,0);	
 	}
 		
 		

 	public CreditCard(String forename, String surname, 
 				  long cardNumber, int expiryDate, int cvv)
 	{
 		setForename(forename);
 		setSurname(surname);
 		setCardNumber(cardNumber);
 		setExpiry(expiryDate);
 		setCVV(cvv);	
 	}
 	
 	
 	
 		//Mutator
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
 	
 	public void setExpiry(int expiryDate)
 	{
 		this.expiryDate = expiryDate;
 	}
 	
 	public void setCVV(int cvv)
 	{
 		this.cvv = cvv;
 	}
 	
 	
 	
 		//Accessor
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
 	
 	public int getExpiryDate()
 	{
 		return expiryDate;
 	}
 	
 	public int getCVV()
 	{
 		return cvv;
 	}
 	
 	
 	
 	
 		//toString
 	public String toString()
 	{
 		return String.format("Forename: %s\nSurname: %s\nCard Number: %d\nExpiry Date: %d\nCVV number: %d",
 							   	getForename(),getSurname(),getCardNumber(),getExpiryDate(),getCVV());
 	}
  }