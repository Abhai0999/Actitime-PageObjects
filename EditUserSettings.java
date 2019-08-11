package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class EditUserSettings {
	@FindBy(xpath = "//tr[(@class='oddRow')]/td//a[contains(@href,'userId')]")
	private @Getter WebElement UserNameRowElm;
	@FindBy(css="input[value='Delete This User']")
	private @Getter WebElement DeleteThisUserElm;
	
	public EditUserSettings(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
}
