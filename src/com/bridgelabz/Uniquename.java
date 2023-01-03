package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Uniquename extends Contact{

    public void Add(ArrayList a){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First name");
        String Str1 = sc.next();
        a.add(Str1);

        System.out.println("Enter the last name");
        String Str2 = sc.next();
        a.add(Str2);

        System.out.println("Enter the Address");
        String Str3 = sc.next();
        a.add(Str3);

        System.out.println("Enter the city");
        String Str4 = sc.next();
        a.add(Str4);

        System.out.println("Enter the state");
        String Str5 = sc.next();
        a.add(Str5);

        System.out.println("Enter the zip");
        String Str6 = sc.next();
        a.add(Str6);

        System.out.println("Enter the Phone Number");
        String Str7 = sc.next();
        a.add(Str7);

        System.out.println("Enter the email");
        String Str8 = sc.next();
        a.add(Str8);

    }

    public void Sub(ArrayList b){

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the name you wish to remove");
        String inp3 = sc3.next();

        int a = b.indexOf(inp3);

        b.remove(a);

        b.remove(a+1);

        b.remove(a+2);

        b.remove(a+3);

        b.remove(a+4);

        b.remove(a+5);

        b.remove(a+6);

        b.remove(a+7);
    }

    public void Edit(ArrayList c){

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the name you wish to edit");
        String inp4 = sc3.next();
        int d = c.indexOf(inp4);

        System.out.println("Enter the first name");
        String Str9 = sc3.nextLine();
        c.add(d,Str9);

        System.out.println("Enter the last name");
        String Str91 = sc3.nextLine();
        c.add(d+1,Str91);

        System.out.println("Enter the address");
        String Str92 = sc3.nextLine();
        c.add(d+2,Str92);

        System.out.println("Enter the City");
        String Str93 = sc3.nextLine();
        c.add(d+3,Str93);

        System.out.println("Enter the state");
        String Str94 = sc3.nextLine();
        c.add(d+4,Str94);

        System.out.println("Enter the Zip");
        String Str95 = sc3.nextLine();
        c.add(d+5,Str95);

        System.out.println("Enter the phone number");
        String Str96 = sc3.nextLine();
        c.add(d+6,Str96);

        System.out.println("Enter the email");
        String Str97 = sc3.nextLine();
        c.add(d+7,Str97);

    }

    public void Display(ArrayList d){
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the name you wish to check");
        String inp4 = sc3.next();
        int e = d.indexOf(inp4);

        System.out.println("The first name is " + d.get(e));
        System.out.println("The last name is " + d.get(e+1));
        System.out.println("The Addres is " + d.get(e+2));
        System.out.println("The city is " + d.get(e+3));
        System.out.println("The state is " + d.get(e+4));
        System.out.println("The ZIP is " + d.get(e+5));
        System.out.println("The phone number is " + d.get(e+6));
        System.out.println("The emal ID is " + d.get(e+7));

    }
    //Creating Address Book

    public void check(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the Name of the AddressBook");
        String inp = sc1.next();

        if (Slot1.contains(inp) || Slot2.contains(inp) || Slot3.contains(inp) || Slot4.contains(inp) || Slot5.contains(inp)){
            System.out.println("The name already exists");

        }else {
            System.out.println("The address book is being created");
        }

    }
    public void Create(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the Name of the AddressBook");
        String inp = sc1.next();

        if (Slot1.size() == 0){
            Slot1.add(inp);
           Add(Slot1);
        } else if (Slot2.size() == 0) {
            Slot2.add(inp);
            Add(Slot2);
        } else if (Slot3.size() == 0) {
            Slot3.add(inp);
            Add(Slot3);
        } else if (Slot4.size() == 0) {
            Slot4.add(inp);
            Add(Slot4);
        } else if (Slot5.size() == 0) {
            Slot5.add(inp);
            Add(Slot5);
        }else {
            System.out.println("You ran out of memory storage");
        }
        System.out.println("The addressbook has been created and the details of first person has been added");
    }

    // Editing AddressBook

    public void EditAddressbook() {
        int exit2 = 99;
        while (exit2 == 99) {
            System.out.println("Please enter the following details: ");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Edit");
            System.out.println("4. display");
            System.out.println("5. exit");
            Scanner sc2 = new Scanner(System.in);
            int inp = sc2.nextInt();

            if (inp == 1) {
                System.out.println("Please Enter the name of the AddressBook");
                String inp2 = sc2.next();

                if (Slot1.contains(inp2)) {
                    Add(Slot1);
                } else if (Slot2.contains(inp2)) {
                    Add(Slot2);
                } else if (Slot3.contains(inp2)) {
                    Add(Slot3);
                } else if (Slot4.contains(inp2)) {
                    Add(Slot4);
                } else if (Slot5.contains(inp2)) {
                    Add(Slot5);
                } else {
                    System.out.println("You ran out of memory storage");
                }
                System.out.println("Details has been saved");
            } else if (inp == 2) {

                System.out.println("Please Enter the name of the AddressBook");
                String inp3 = sc2.next();

                if (Slot1.contains(inp3)) {
                    Sub(Slot1);
                } else if (Slot2.contains(inp3)) {
                    Sub(Slot2);
                } else if (Slot3.contains(inp3)) {
                    Sub(Slot3);
                } else if (Slot4.contains(inp3)) {
                    Sub(Slot4);
                } else if (Slot5.contains(inp3)) {
                    Sub(Slot5);
                } else {
                    System.out.println("The Addressbook does not exist");
                }
                System.out.println("The details has been deleted");

            } else if (inp == 3) {
                System.out.println("Please Enter the name of the AddressBook");
                String inp3 = sc2.next();

                if (Slot1.contains(inp3)) {
                    Sub(Slot1);
                } else if (Slot2.contains(inp3)) {
                    Sub(Slot2);
                } else if (Slot3.contains(inp3)) {
                    Sub(Slot3);
                } else if (Slot4.contains(inp3)) {
                    Sub(Slot4);
                } else if (Slot5.contains(inp3)) {
                    Sub(Slot5);
                } else {
                    System.out.println("The Addressbook does not exist");
                }
                System.out.println("The details has been edited");
            } else if (inp == 4) {
                System.out.println("Please Enter the name of the AddressBook");
                String inp3 = sc2.next();

                if (Slot1.contains(inp3)) {
                    Display(Slot1);
                } else if (Slot2.contains(inp3)) {
                    Display(Slot2);
                } else if (Slot3.contains(inp3)) {
                    Display(Slot3);
                } else if (Slot4.contains(inp3)) {
                    Display(Slot4);
                } else if (Slot5.contains(inp3)) {
                    Display(Slot5);
                } else {
                    System.out.println("The Addressbook does not exist");
                }
            } else if (inp == 5) {
                exit2 = 100;
            } else {
                System.out.println("Wrong Input");
            }
        }
    }

    public void DeleteAddressbook(){
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Please Enter the name of the AddressBook you want to Delete");
        String inp3 = sc5.next();

        if (Slot1.contains(inp3)){
            Slot1.clear();
        } else if (Slot2.contains(inp3)) {
            Slot2.clear();
        } else if (Slot3.contains(inp3)) {
            Slot3.clear();
        } else if (Slot4.contains(inp3)) {
            Slot4.clear();
        } else if (Slot5.contains(inp3)) {
            Slot5.clear();
        }else {
            System.out.println("The Addressbook does not exist");
        }
    }
    }
