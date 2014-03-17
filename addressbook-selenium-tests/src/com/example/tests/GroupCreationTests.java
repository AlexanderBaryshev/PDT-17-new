package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
	
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	openMainPage();
    gotoGroupsGage();
    initGroupCreation();
    GroupData group = new GroupData();
    group.name ="group name 1";
    group.header="group header 1";
    group.footer ="group footer 1";
	fillGroupForm(group);
    submitGroupsPage();
    returnToGroupsPage();
  }
  
  @Test
  public void testEmptyGroupCreation() throws Exception {
	openMainPage();
    gotoGroupsGage();
    initGroupCreation();
    fillGroupForm(new GroupData("", "", ""));
    submitGroupsPage();
    returnToGroupsPage();
  }
}
