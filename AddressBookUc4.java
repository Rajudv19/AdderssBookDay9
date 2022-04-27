package com.BridgeLabs.day9;
import java.util.ArrayList;
import java.util.Scanner;

import com.BridgeLabs.day10.AddressBookUC5;

public class AddressBookUc4 {
	static String first_name;
	String last_name;
	String city;
	String state;
	String ph_number;
	String zip;
	String email;
	
	static ArrayList<AddressBookUc4> alist = new ArrayList<AddressBookUc4>();

	public AddressBookUc4(String first_name, String last_name, String city, 
			              String state, String ph_number, String zip,String email){
		
		this.first_name = first_name;
		this.last_name  = last_name;
		this.city       = city;
		this.state      = state;
		this.ph_number  = ph_number;
		this.zip        = zip;
		this.email      = email;
	}
	
	@Override
	public String toString() {
		return "\n First_name = " +  first_name + "\n Last_name  = " + last_name + 
			   "\n City       = " + city        + "\n State      = " +  state + 
			   "\n Ph number  = " + ph_number   + "\n Zip        = " + zip + 
			   "\n Email      = " + email;
	}
	
	static void deleteAddr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name to Delete..  :");
		String name = sc.next();
		
		if(name.equals(first_name)){

     		for(AddressBookUc4 Addr : alist){
     		   alist.clear();  
     		 //alist.remove(0);
     	       System.out.println("Successfully deleted..." + Addr);
		    }
		}
		else{
			System.out.println("Entered name is not present in Array to delete....");
		} 
	}
	public void editAddr(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name to edit  :");
		String name = sc.next();
		
		if(name.equals(first_name))
		{
		  System.out.println("Enter First Name  :");
		  String first_name = sc.next();
		  System.out.println("Enter Last Name   :");
		  String last_name = sc.next();
		  System.out.println("Enter City        : ");
		  String city = sc.next();
		  System.out.println("Enter State       : ");
		  String state = sc.next();
		  System.out.println("Enter Phone Number: ");
		  String ph_number = sc.next();
		  System.out.println("Enter Zip         : ");
		  String zip = sc.next();
		  System.out.println("Enter Email       : ");
		  String email = sc.next(); 
		
	    	alist.set(0, new AddressBookUc4(first_name, last_name, city,
                         state, ph_number, zip,email));
      
			for(AddressBookUc4 Addr : alist){
	     	 System.out.println("Details Edited successfully.." + Addr);
			}		
		}
		else{
			System.out.println("Entered name is not present in Array to edit....");
		}  
		}

        public static void main(String[] args)
        {
        	
          System.out.println("Welcome to AddressBook Computation Program");
        
		  Scanner sc = new Scanner(System.in);

		  System.out.println("Enter First Name  :");
		  String first_name = sc.next();
       	  System.out.println("Enter Last Name   :");
		  String last_name = sc.next();
		  System.out.println("Enter City        : ");
		  String city = sc.next();
		  System.out.println("Enter State       : ");
		  String state = sc.next();
		  System.out.println("Enter Phone Number: ");
		  String ph_number = sc.next();
		  System.out.println("Enter Zip         : ");
		  String zip = sc.next();
		  System.out.println("Enter Email       : ");
		  String email = sc.next();

		  AddressBookUc4 A = new AddressBookUc4(first_name, last_name, city,
			                                    state, ph_number, zip,email);
		  alist.add(A);
     	  System.out.println("Details added successfully.." + alist);
     	
     	  A.editAddr();
     	  A.deleteAddr();
}
}
