package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import lombok.Getter;
public class CreateNewProjectPage 
{
@FindBy(css="select[name='customerId']")
private @Getter WebElement dropdown;
@FindBy(name="name")
private @Getter WebElement ProjectName;
@FindBy(name="createProjectSubmit")
private @Getter WebElement CreateProjBtn ;

public CreateNewProjectPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
