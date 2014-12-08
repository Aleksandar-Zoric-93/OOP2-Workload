
/** 
  This program will create the members class for the project.  It will contain
  mutator, accessor and constructor methods, and also a toString() method to 
  display it in a specific format 
 
 @author Aleksandar Zoric
 
 @version 1.4 final
*/
 
 //Import statements
 import java.io.*;
 
 public class Member implements Serializable{
 	
 	//Attributes
 	private String name;
 	private String address;
 	private String dob;
 	private String email;
 	public int idNum;
 	
 
 	/**No argument constuctor method
 	 
 	 	@param Insert the details asked for the member*/
 		public Member()
 		{
 			this("Unknown","Default","Unknown","Default",0);
 		}
 		
 		
 
 
 	/**5 arguement constructor method
 	 
 	 	@Set the default values for each attribute*/
 		public Member(String name, String address, String dob, String email, int idNum)
 		{
 			setName(name);
 			setAddress(address);
 			setDOB(dob);
 			setEmail(email);	
 		}
 	
 	
 	
 	/** mutator method to set the members name
 	 	@param set the name of the member*/
 		public void setName(String name)
 		{
 			this.name = name;
 		}
 		
 	
 	/** mutator method to set the members address
 	 	@param set the address of the member*/
 		public void setAddress(String address)
 		{
 			this.address = address;
 		}
 		
 	
 	/** mutator method to set the members date of birth
 	 	@param set the date of birth of the member*/
 		public void setDOB(String dob)
 		{
 			this.dob = dob;
 		}
 		
 	
 	/** mutator method to set the members email address
 	 	@param set the email address of the member*/
 		public void setEmail(String email)
 		{
 			this.email = email;
 		}
 		
 	
 	/** mutator method to set the members unique ID number
 	 	@param set the ID number of the member*/
 		public void setID(int idNum)
 		{
 			this.idNum = idNum;
 		}
 		
 	
 	
 	
 	/** accessor method to return the members name
 	 	@return the name of the member*/
 		public String getName()
 		{
 			return name;
 		}
 		
 	/** accessor method to return the members address
 	 	@return the address of the member*/
 		public String getAddress()
 		{
 			return address;
 		}
 		
 	/** accessor method to return the members date of birth
 	 	@return the members date of birth*/
 		public String getDOB()
 		{
 			return dob;
 		}
 		
 	/** accessor method to return the members email
 	 	@return the members email*/	
 		public String getEmail()
 		{
 			 return email;
 		}
 		
 	/** accessor method to return the members ID number
 	 	@return the members ID number*/
 		public int getID()
 		{
 			 return idNum;
 		}
 		
 		
 
 	/**toString method to return the members details
 	 	@return the name,address,date of birth and email of the member as a String*/
 		public String toString()
 		{
 			return String.format("Name: %s\nAddress: %s\nDate Of Birth: %s\nEmail: %s\n\n",
 							   	getName(),getAddress(),getDOB(),getEmail());
 		}
 		
 		
 		
 		
 		
 	
 	
 	
 	
 }