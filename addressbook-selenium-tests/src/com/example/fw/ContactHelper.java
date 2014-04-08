package com.example.fw;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.AddressBookData;
import com.example.tests.GroupData;

public class ContactHelper extends HelperBase {

	public Object selectGroupToAdd;

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void submitAddressBookPage() {
		click(By.name("submit"));
	}

	public void returnToHomePage() {
		click(By.linkText("home page"));
	}

	public void gotoAddressBookPage() {
		driver.findElement(By.linkText("add new")).click();
	}

	public void fillAddressBookForm(AddressBookData parameterObject) {
		type(By.name("firstname"), parameterObject.first_name);
	    type(By.name("lastname"), parameterObject.last_name);
	    type(By.name("address"),parameterObject.address);
	    type(By.name("home"), parameterObject.home);
	    type(By.name("mobile"), parameterObject.mobile);
	    type(By.name("work"), parameterObject.work);
	    type(By.name("email"), parameterObject.email_1);
	    type(By.name("email2"), parameterObject.email_2);
	    selectByText(By.name("bday"), parameterObject.bday);
	    selectByText(By.name("bmonth"), parameterObject.bmonth);
	    type(By.name("byear"), parameterObject.byear);
	    //selectByText(By.name("new_group"), parameterObject.group);
	    type(By.name("address2"), parameterObject.address_2);
	    type(By.name("phone2"), parameterObject.home_2);
	}

	public void editAddressBook(int index) {
		click (By.cssSelector("img[alt=\"Edit\"]"));
	}

	public void deleteAddressBook() {
		click (By.xpath("(//input[@name='update'])[2]")); 		
	}

	public void updateAddressBookForm() {
		click (By.name("update"));
	}
	
	public List<AddressBookData> getContacts() {
		List<AddressBookData> contacts = new ArrayList<AddressBookData>();
		List<WebElement> checkboxes = driver.findElements(By.name("selected[]"));
		for (WebElement checkbox : checkboxes) {
			AddressBookData addressBook=new AddressBookData();
			String title = checkbox.getAttribute("title");
			addressBook.first_name = title.substring("Select (".length(), title.length() - ")".length());
			contacts.add(addressBook);
		}
		return contacts;
	}
}
	