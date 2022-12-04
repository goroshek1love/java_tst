package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstName, lastName, group;

    public ContactData(String firstName, String lastName, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public String getFirstname() {
        return firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }
}
