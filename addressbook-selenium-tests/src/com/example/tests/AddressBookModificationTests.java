package com.example.tests;
import org.testng.annotations.Test;

public class AddressBookModificationTests extends TestBase   {
	
	@Test
	public void modifySomeAddressBook(){
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().editAddressBook(1);
		AddressBookData contact = new AddressBookData ();
		contact.first_name = "first name new";
		contact.last_name = "last name new";
		contact.address = "address new";
		app.getContactHelper().fillAddressBookForm(contact);
		app.getContactHelper().updateAddressBookForm();
	    app.getContactHelper().returnToHomePage();
	}
}