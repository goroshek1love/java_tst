package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {
    @Test(enabled = false)
    public void testContactCreation() {
        app.goTo().goToHomePage();
        app.getContactHelper().createContact(new ContactData("test_firstname", "test_lastname", "test1"));
    }
}
