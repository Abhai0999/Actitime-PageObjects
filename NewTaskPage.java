package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class NewTaskPage 
{

	@FindBy(css="input[value='Delete This Task']")
	private @Getter WebElement DelTaskBtn;
	@FindBy(css="input[id='deleteButton']")
	private @Getter WebElement CnfDelTasBtn;
	
	
	public NewTaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
