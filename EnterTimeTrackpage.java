package com.actitime.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BaseLib;

import lombok.Getter;
public class EnterTimeTrackpage extends BasePage
{
@FindBy(xpath="(//td[@class='pagetitle'])[2]")
private @Getter WebElement ettppageTitle;
@FindBy(xpath="(//tbody//span[@class='errormsg'])[1]")
private @Getter WebElement ettErrMsg;

public EnterTimeTrackpage(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver, this);
}
}
