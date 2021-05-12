package com.actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[.='Add New']")
	private WebElement AddNewBtn;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement NewCustomerOption;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement EnterCustNameTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement EnterCustDesTbx;
	
	@FindBy(xpath="(//div[.='- Select Customer -'])[2]")
	private WebElement SelectCustDD;
	
	@FindBy(xpath="//div[.='Our company' and @class='itemRow cpItemRow ']")
	private WebElement OurCompanyName;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement CreateCustomerBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement ActualCustomer;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return AddNewBtn;
	}

	public WebElement getNewCustomerOption() {
		return NewCustomerOption;
	}

	public WebElement getEnterCustNameTbx() {
		return EnterCustNameTbx;
	}

	public WebElement getEnterCustDesTbx() {
		return EnterCustDesTbx;
	}

	public WebElement getSelectCustDD() {
		return SelectCustDD;
	}

	public WebElement getOurCompanyName() {
		return OurCompanyName;
	}

	public WebElement getCreateCustomerBtn() {
		return CreateCustomerBtn;
	}

	public WebElement getActualCustomer() {
		return ActualCustomer;
	}
	
}
