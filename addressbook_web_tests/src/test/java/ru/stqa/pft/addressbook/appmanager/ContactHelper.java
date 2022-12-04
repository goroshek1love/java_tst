package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver){
        super(driver);
    }

    public void initContactCreation(){
        click(By.linkText("add new"));
    }

    public void fillContactForm(ContactData contactData) {
        //click(By.name("firstname"));
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"),  contactData.getLastname());
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void returnToHomePage() {
        click(By.linkText("home page"));
    }
}
