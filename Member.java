//Aleksandar Zoric
/* This program will create the members class for the project.  It will contain
 * mutator, accessor and constructor methods, and also a toString() method to 
 * display it in a specific format */
 
 import java.io.*;
 
 public class Member implements Serializable{
 	
 	//Attributes
 	private String name;
 	private String address;
 	private String dob;
 	private String phone;
 	private String email;
 	
 
 	//Constructors
 	
 		public Member()
 		{
 			this("Unknown","Default","Unknown","","Default");	
 		}
 		
 		
 	
 		public Member(String name, String address, String dob, String phone, String email)
 		{
 			setName(name);
 			setAddress(address);
 			setDOB(dob);
 			setPhone(phone);
 			setEmail(email);	
 		}
 	
 	
 	//Mutator
 		public void setName(String name)
 		{
 			this.name = name;
 		}
 		
 		public void setAddress(String address)
 		{
 			this.address = address;
 		}
 		
 		public void setDOB(String dob)
 		{
 			this.dob = dob;
 		}
 		
 		public void setPhone(String Phone)
 		{
 			this.phone = phone;
 		}
 		
 		public void setEmail(String email)
 		{
 			this.email = email;
 		}
 		
 	
 	//Accessor
 		public String getName()
 		{
 			return name;
 		}
 		
 		public String getAddress()
 		{
 			return address;
 		}
 		
 		public String getDOB()
 		{
 			return dob;
 		}
 		
 		public String getPhone()
 		{
 			return phone;
 		}
 		
 		public String getEmail()
 		{
 			 return email;
 		}
 		
 		
 
 	//toString
 		public String toString()
 		{
 			return String.format("Name: %s\nAddress: %s\nDate Of Birth: %s\nPhone: %s\nEmail: %s\n\n",
 							   	getName(),getAddress(),getDOB(),getPhone(),getEmail());
 		}
 		
 		
 		
 		
 		
 	
 	
 	
 	
 }