package com.example.tests;

import org.testng.annotations.Test;

public class AddressBookCreationTests extends TestBase {
  
	@Test
  public void testNonEmptyAddressBookCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
    app.getContactHelper().gotoAddressBookPage();
    AddressBookData addressBook = new AddressBookData();
    addressBook.first_name = "first name";
    addressBook.last_name = "last name";
    addressBook.address = "address";
    addressBook.home = "home";
    addressBook.mobile = "mobile";
    addressBook.work = "work";
    addressBook.email_1 = "email";
    addressBook.email_2 = "email 2";
    addressBook.bday = "1";
    addressBook.bmonth = "January";
    addressBook.byear = "1984";
    addressBook.group = "Group 1";
    addressBook.address_2 = "address2";
    addressBook.home_2 = "home 2";
    app.getContactHelper().fillAddressBookForm(addressBook);
    app.getContactHelper().submitAddressBookPage();
    app.getContactHelper().returnToHomePage();
  }

  @Test
  public void testEmptyAddressBookCreation() throws Exception {
    app.getNavigationHelper().openMainPage();
    app.getContactHelper().gotoAddressBookPage();
    app.getContactHelper().fillAddressBookForm(new AddressBookData("", "", "", "", "", "", "", "", "-", "-", "", "", "", ""));
    app.getContactHelper().submitAddressBookPage();
    app.getContactHelper().returnToHomePage();
  }
}
