package com.bridgelabz;
import java.util.ArrayList;
import java.util.*;
public class Adding extends Contact{

    public void Add(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First name");
        String Str1 = sc.next();
        FirstName.add(Str1);

        System.out.println("Enter the last name");
        String Str2 = sc.next();
        LastName.add(Str2);

        System.out.println("Enter the Address");
        String Str3 = sc.next();
        Address.add(Str3);

        System.out.println("Enter the city");
        String Str4 = sc.next();
        City.add(Str4);

        System.out.println("Enter the state");
        String Str5 = sc.next();
        state.add(Str5);

        System.out.println("Enter the zip");
        String Str6 = sc.next();
        Zip.add(Str6);

        System.out.println("Enter the Phone Number");
        String Str7 = sc.next();
        PhoneNuber.add(Str7);

        System.out.println("Enter the email");
        String Str8 = sc.next();
        email.add(Str8);

    }

    public void Sub(int r){

        FirstName.remove(r);

        LastName.remove(r);

        Address.remove(r);

        City.remove(r);

        state.remove(r);

        Zip.remove(r);

        PhoneNuber.remove(r);

        email.remove(r);
    }

    public void Edit(int e){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first name");
        String Str9 = sc.nextLine();
        FirstName.add(e,Str9);

        System.out.println("Enter the last name");
        String Str91 = sc.nextLine();
        LastName.add(e,Str91);

        System.out.println("Enter the address");
        String Str92 = sc.nextLine();
        Address.add(e,Str92);

        System.out.println("Enter the City");
        String Str93 = sc.nextLine();
        City.add(e,Str93);

        System.out.println("Enter the state");
        String Str94 = sc.nextLine();
        state.add(e,Str94);

        System.out.println("Enter the Zip");
        String Str95 = sc.nextLine();
        Zip.add(e,Str95);

        System.out.println("Enter the phone number");
        String Str96 = sc.nextLine();
        PhoneNuber.add(e,Str96);

        System.out.println("Enter the email");
        String Str97 = sc.nextLine();
        email.add(e,Str97);

    }

    public static void main(String[] args) {

        /*Contact obj = new Contact();
        obj.FirstName = new ArrayList<>();
        obj.LastName = new ArrayList<>();
        obj.Address = new ArrayList<>();
        obj.City = new ArrayList<>();
        obj.state = new ArrayList<>();
        obj.Zip = new ArrayList<>();
        obj.PhoneNuber = new ArrayList<>();
        obj.email = new ArrayList<>();
*/
    }

}
