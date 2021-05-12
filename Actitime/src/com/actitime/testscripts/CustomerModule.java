package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FileLib;
import com.actitime.objectrepository.EnterTimeTrackPage;
import com.actitime.objectrepository.TaskListPage;

@Listeners(com.actitime.generics.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	
@Test
public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
	FileLib f=new FileLib();
	String CustomerName = f.getExcelData("CreateCustomer", 1, 2);
	String CustomerDescp=f.getExcelData("CreateCustomer", 1, 3);
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	//Cilck on task tab
	e.clickTaskTab();
	TaskListPage t=new TaskListPage(driver);
	//click on add Addnew Button
	t.getAddNewBtn().click();	
	//click on new customer option
	t.getNewCustomerOption().click();	
	//enter the customer name
	t.getEnterCustNameTbx().sendKeys(CustomerName);
	//enter the customer description
	t.getEnterCustDesTbx().sendKeys(CustomerDescp);
	
	t.getSelectCustDD().click();
	t.getOurCompanyName().click();
	t.getCreateCustomerBtn().click();
	Thread.sleep(4000);
	String ActualCustomer = t.getActualCustomer().getText();
	Assert.assertEquals(ActualCustomer,CustomerName);
	Reporter.log(ActualCustomer +" is the Customer created ",true);
}
}
