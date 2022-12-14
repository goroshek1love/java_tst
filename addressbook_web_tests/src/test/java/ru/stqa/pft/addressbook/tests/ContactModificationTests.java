package ru.stqa.pft.addressbook.tests;

import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.HashSet;

public class ContactModificationTests extends TestBase {

    @Test(enabled = false)
    public void testContactModification(){
        app.goTo().homePage();
        if (!app.contact().isThereAContact()){
            app.contact().create(new ContactData().withLastName("testLastName"));
        }
        app.contact().initContactModification();
        app.contact().fillContactForm(new ContactData().withFirstName("firstName1").withLastName("lastName2"), false);
        app.contact().submitContactModification();
        app.contact().returnToHomePage();
    }
}
