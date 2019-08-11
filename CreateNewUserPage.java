package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class CreateNewUserPage 
{
@FindBy(name="username")
private @Getter WebElement UserNameTxBx;
@FindBy(name="passwordText")
private @Getter WebElement PasswordTxBx;
@FindBy(name="passwordTextRetype")
private @Getter WebElement ReTypPasswordTxBx;
@FindBy(name="firstName")
private @Getter WebElement FirstNameTxBx;
@FindBy(name="lastName")
private @Getter WebElement LastNameTxBx;
@FindBy(name="email")
private @Getter WebElement EmailTxBx;
@FindBy(css="input[value='   Create User   ']")
private @Getter WebElement CreateUserBtn;
	
	public CreateNewUserPage(WebDriver driver)

{
		PageFactory.initElements(driver, this);	
}
	}
