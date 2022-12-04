package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstName, lastName;

    public ContactData(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstname() {
        return firstName;
    }

    public String getLastname(){
        return lastName;
    }
}
