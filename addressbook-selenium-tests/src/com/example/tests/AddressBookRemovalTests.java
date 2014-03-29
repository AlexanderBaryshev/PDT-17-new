package com.example.tests;
import org.testng.annotations.Test;

public class AddressBookRemovalTests extends TestBase   {

	@Test
	public void deleteSomeAddressBook(){
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().editAddressBook(1);
		app.getContactHelper().deleteAddressBook();
		app.getContactHelper().returnToHomePage();
	}
}