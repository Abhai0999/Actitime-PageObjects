package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class UserListPage 
{
	@FindBy(xpath = "//span[text()='Create New User']")
	private @Getter WebElement CreateNewUserBtn;
	@FindBy(xpath = "//td//span[@class='successmsg']")
	private @Getter WebElement Create_DelUsrSuccessMsg;
	@FindBy(xpath = "//tr[(@class='oddRow')]/td//a[contains(@href,'userId')]")
	private @Getter WebElement UserNameRowElm;

	public UserListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
}
