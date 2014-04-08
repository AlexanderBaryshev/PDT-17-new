package com.example.tests;
import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class AddressBookRemovalTests extends TestBase   {

	@Test
	public void deleteSomeAddressBook(){
		app.getNavigationHelper().openMainPage();
		
		//save old state
	    List<AddressBookData> oldList = app.getContactHelper().getContacts();
	    
	    Random rnd = new Random();
	    int index = rnd.nextInt(oldList.size()-1);
	    
	    // actions
		app.getContactHelper().editAddressBook(index);
		app.getContactHelper().deleteAddressBook();
		app.getContactHelper().returnToHomePage();
		
		 //save new state
	    List<AddressBookData> newList = app.getContactHelper().getContacts();
	    
	    //compare state
	    oldList.remove(index);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
  
	}
}