package com.bridgeLabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static Scanner scanner = new Scanner(System.in);
    ArrayList<Contact> list = new ArrayList();

    public void addressBookMenu() {
        int option;
        boolean check = false;
        do {
            System.out.println("press\n1. To add contact\n2.To display contact\n3.To edit\4. To delete");
            option = scanner.nextInt();
            scanner.nextInt();
            switch (option) {
                case 1:
                    addNewContact();
                    break;
                case 2:
                    diplayContact();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    check = true;
                default:
                    System.out.println("Choose a valid option");
            }
        }
        while (!check);
    }
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
    public void diplayContact(){

    }
    public void editContact(){
        System.out.println("Please Enter the name first to edit :-");
        String editName = scanner.next();
        for(Contact contact:list){
            if(contact.getFirstName().equals(editName)){
                contact.editExistingContact();
            }
        }
    }
    public void deleteContact() {
        String deleteName = scanner.next();
        for (Contact contact:list){
            if (contact.getFirstName().equalsIgnoreCase(deleteName)) {
                list.remove(contact);
                contact.deleteExistingContact();
            }
        }
    }
}
