package com.actitime.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import lombok.Getter;

public class EditCustomerInformation 
{
@FindBy(xpath="//input[@value='Delete This Customer']")
private @Getter WebElement DelCustBtn;
@FindBy(xpath="//input[@value='Delete Customer']")
private @Getter WebElement DelCustCnfbtn;


public EditCustomerInformation(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
