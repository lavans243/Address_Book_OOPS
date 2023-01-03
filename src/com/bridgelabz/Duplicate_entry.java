package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Duplicate_entry extends Adding {

	public static void main(String[] args) {


        int exit = 8;

        while (exit == 8) {
            System.out.println("Please enter the following details: ");
            System.out.println("1. Create Addressbook");
            System.out.println("2. Edit Addressbook");
            System.out.println("3. Delete Addressbook");
            System.out.println("");


            Adding ob4 = new Adding();

            Scanner sc3 = new Scanner(System.in);
            int inp = sc3.nextInt();

            if (inp == 1) {
                ob4.Create();
            } else if (inp == 2) {

                ob4.EditAddressbook();

            } else if (inp == 3) {

                ob4.DeleteAddressbook();
            } else if(inp == 4) {
                exit = 9;
            }else
                System.out.println("Enter the valid input");
        }
    }
}
