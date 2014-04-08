package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class AddressBookCreationTests extends TestBase {
  
	 @Test(dataProvider = "randomValidAddressBookGeneration")
	  public void testAddressBookCreationWithValidData(AddressBookData addressBook) throws Exception {
	app.getNavigationHelper().openMainPage();
    
	//save old state
    List<AddressBookData> oldList = app.getContactHelper().getContacts();
    
    // actions
    app.getContactHelper().gotoAddressBookPage();
    app.getContactHelper().fillAddressBookForm(addressBook);
    app.getContactHelper().submitAddressBookPage();
    app.getContactHelper().returnToHomePage();
    
    //save new state
    List<AddressBookData> newList = app.getContactHelper().getContacts();
    
    //compare state
    oldList.add(addressBook);
    Collections.sort(oldList);
    assertEquals(newList, oldList);
  }
}