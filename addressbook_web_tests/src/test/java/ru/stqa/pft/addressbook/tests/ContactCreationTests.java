package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.io.File;
import java.util.HashSet;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactCreationTests extends TestBase {
    @Test
    public void testContactCreation() {
        app.goTo().homePage();
        HashSet<ContactData> before = app.contact().all();
        File photo = new File("src/test/resources/IMG_0901.JPG");
        ContactData contact = new ContactData().withFirstName("test_firstname").withLastName("test_lastname")
                .withPhoto(photo).withGroup("test1");
        app.contact().create(contact);
        assertThat(app.contact().count(), equalTo(before.size() + 1));
        HashSet<ContactData> after = app.contact().all();
        contact.withId(after.stream().mapToInt((c) -> c.getId()).max().getAsInt());
        before.add(contact.withId(after.stream().mapToInt((c) -> c.getId()).max().getAsInt()));
        assertThat(after, equalTo(before));
    }

}
