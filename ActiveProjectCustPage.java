package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import lombok.Getter;
public class ActiveProjectCustPage 
{
@FindBy(css="input[value='Create New Customer']")
private @Getter WebElement ProjndCust;
@FindBy(xpath = "//table[@id='SuccessMessages']//span[@class='successmsg']")
private @Getter WebElement SuccessMsgele;

public ActiveProjectCustPage(WebDriver driver)

{
	PageFactory.initElements(driver, this);
}}
