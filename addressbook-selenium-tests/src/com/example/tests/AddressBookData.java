package com.example.tests;

public class AddressBookData {
	public String first_name;
	public String last_name;
	public String address;
	public String home;
	public String mobile;
	public String work;
	public String email_1;
	public String email_2;
	public String bday;
	public String bmonth;
	public String byear;
	public String group;
	public String address_2;
	public String home_2;

	public AddressBookData(){
		
	}
	
	public AddressBookData(String first_name, String last_name, String address,
			String home, String mobile, String work, String email_1,
			String email_2, String bday, String bmonth, String byear,
			String group, String address_2, String home_2) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.home = home;
		this.mobile = mobile;
		this.work = work;
		this.email_1 = email_1;
		this.email_2 = email_2;
		this.bday = bday;
		this.bmonth = bmonth;
		this.byear = byear;
		this.group = group;
		this.address_2 = address_2;
		this.home_2 = home_2;
	}
}