package com.bridgeLabz;

import static com.bridgeLabz.AddressBook.scanner;

public class Contact {
    private String firstName;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private String pin;
    private String phoneNumber;
    private String email;

    public Contact(String firstName) {

    }

    public Contact(String firstName, String lastname, String address, String city, String state, String pin, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pin = pin;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pin='" + pin + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public void editExistingContact(){

        System.out.println("Enter the First Name:- ");
        firstName = scanner.next();
        System.out.println("Enter the Last Name:- ");
        lastname = scanner.next();
        System.out.println("Enter the Address :- ");
        address = scanner.next();
        System.out.println("Enter the Name of city:- ");
        city = scanner.next();
        System.out.println("Enter the Name of State:- ");
        state = scanner.next();
        System.out.println("Enter the pin code:- ");
        pin = scanner.next();
        System.out.println("Enter the phone number:- ");
        phoneNumber = scanner.next();
        System.out.println("Enter the Email:-");
        email = scanner.next();
    }
    public void deleteExistingContact(){
        System.out.println("Enter the First Name:- ");
        firstName = scanner.next();
        System.out.println("Enter the Last Name:- ");
        lastname = scanner.next();
        System.out.println("Enter the Address :- ");
        address = scanner.next();
        System.out.println("Enter the Name of city:- ");
        city = scanner.next();
        System.out.println("Enter the Name of State:- ");
        state = scanner.next();
        System.out.println("Enter the pin code:- ");
        pin = scanner.next();
        System.out.println("Enter the phone number:- ");
        phoneNumber = scanner.next();
        System.out.println("Enter the Email:-");
        email = scanner.next();

    }
}
