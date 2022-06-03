package com.bridgeLabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static Scanner scanner = new Scanner(System.in);
    ArrayList<Contact> list = new ArrayList();

    public void addNewContact(){
        System.out.println("Enter the First Name:- ");
        String firstName = scanner.next();
        System.out.println("Enter the Last Name:- ");
        String lastName = scanner.next();
        System.out.println("Enter the Address :- ");
        String address = scanner.next();
        System.out.println("Enter the Name of city:- ");
        String city = scanner.next();
        System.out.println("Enter the Name of State:- ");
        String state = scanner.next();
        System.out.println("Enter the pin code:- ");
        String pin = scanner.next();
        System.out.println("Enter the phone number:- ");
        String phoneNumber = scanner.next();
        System.out.println("Enter the Email:-");
        String email = scanner.next();
        Contact contact = new Contact(firstName,lastName,address, city, state, pin, phoneNumber, email );
        list.add(contact);



    }
}
