package com.actitime.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import lombok.Getter;

public class CreatenewCust 
{
@FindBy(name="name")
private @Getter WebElement CustNametxbx;
@FindBy(name="createCustomerSubmit")
private @Getter WebElement CreateCustSubmitBtn;

public CreatenewCust(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
