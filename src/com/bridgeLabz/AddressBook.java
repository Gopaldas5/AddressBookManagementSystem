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
            System.out.println("1. To add contact")
            System.out.println("2. To display contact");
            System.out.println("3. To edit");
            System.out.println("4. To delete");
            System.out.println("5. To Exit");
            System.out.print("Enter your choice : ");
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
        System.out.println("Displaying the Contact list");
        System.out.println(list);
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
