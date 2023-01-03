package com.bridgelabz;


import java.util.ArrayList;
import java.util.*;

public class Addbook  extends Adding {
	
	 public static void main(String[] args) {

	        Contact obj = new Contact();
	        obj.FirstName = new ArrayList<>();
	        obj.LastName = new ArrayList<>();
	        obj.Address = new ArrayList<>();
	        obj.City = new ArrayList<>();
	        obj.state = new ArrayList<>();
	        obj.Zip = new ArrayList<>();
	        obj.PhoneNuber = new ArrayList<>();
	        obj.email = new ArrayList<>();

	        int exit = 8;

	        while (exit == 8) {
	            System.out.println("Please enter the following details: ");
	            System.out.println("1. Add");
	            System.out.println("4. display");
	            System.out.println("5. Exit");

	            Adding ob4 = new Adding();
	            Contact ob5 = new Contact();

	            Scanner sc3 = new Scanner(System.in);
	            int inp = sc3.nextInt();

	            if (inp == 1) {
	                ob4.Add();
	            }
	             else if (inp == 4){

	                System.out.println("Enter the name you want to display");
	                Scanner in3 = new Scanner(System.in);
	                String sp3 = in3.nextLine();

	                if (ob5.FirstName.contains(sp3)) {
	                    int v3 = ob5.FirstName.indexOf(sp3);

	                    System.out.println("The first name is " + FirstName.get(v3));
	                    System.out.println("The last name is " + LastName.get(v3));
	                    System.out.println("The Address is " + Address.get(v3));
	                    System.out.println("The City is " + City.get(v3));
	                    System.out.println("The state is " + state.get(v3));
	                    System.out.println("The Zip is " + Zip.get(v3));
	                    System.out.println("The PhoneNuber is " + PhoneNuber.get(v3));
	                    System.out.println("The email is " + email.get(v3));
	                } else {
	                    System.out.println("The name does not exist");
	                }

	            } else if (exit == 5) {
	                exit = 9;
	            } else {
	                System.out.println("Enter the velid input");
	            }

	        }
	    }
	

}
