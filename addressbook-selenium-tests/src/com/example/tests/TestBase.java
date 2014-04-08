package com.example.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.example.fw.ApplicationManager;

public class TestBase {
	
	protected static ApplicationManager app;

	@BeforeTest
	public void setUp() throws Exception {
		
		app = new ApplicationManager();
	  }

	@AfterTest
	public void tearDown() throws Exception {
		app.stop();
 	  }
	
	@DataProvider
	public Iterator<Object[]> randomValidGrouopGenersrot(){
		List<Object[]> list = new ArrayList<Object[]>();
		for (int i = 0; i < 5; i++){
			GroupData group = new GroupData();
			group.name = generateRandomstring();
			group.header = generateRandomstring();
			group.footer = generateRandomstring();
			list.add(new Object[]{group});
		}
		return list.iterator();
	}
	
	@DataProvider
	public Iterator<Object[]> randomValidAddressBookGeneration(){
		List<Object[]> list = new ArrayList<Object[]>();
		for (int i = 0; i < 1; i++){
			AddressBookData addressBook = new AddressBookData();
			addressBook.first_name = generateRandomstring();
			addressBook.last_name = generateRandomstring();
			addressBook.address = generateRandomstring();
			addressBook.home = generateRandomstring();
			addressBook.mobile = generateRandomstring();
			addressBook.work = generateRandomstring();
			addressBook.email_1 = generateRandomstring();
			addressBook.email_2 = generateRandomstring();
			//addressBook.bday = generateRandomstring();
			//addressBook.bmonth = generateRandomstring();
			//addressBook.byear = generateRandomstring();
			addressBook.address_2 = generateRandomstring();
			addressBook.home_2 = generateRandomstring();

			list.add(new Object[]{addressBook});
		}
		return list.iterator();
	}
	
	public String generateRandomstring(){
		Random rnd = new Random();
		if (rnd.nextInt(3)== 0){
			return "";
		} else {
			return "test" + rnd.nextInt();
		}
	}
}