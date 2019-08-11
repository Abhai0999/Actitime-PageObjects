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
@FindBy(xpath="//table[@id='SuccessMessages']//td//span")
private @Getter WebElement DeleteMsg;
@FindBy(xpath="//a[text()='GE HealthCare']")
private @Getter WebElement Customer;
@FindBy(css="input[value='Create New Project']")
private @Getter WebElement CreateNewProject;
@FindBy(xpath="//span[@class='successmsg']")
private @Getter WebElement ProjCreatedMsgele;
@FindBy(name="selectedCustomer")
private @Getter WebElement Customerdrpdown;
@FindBy(css="input[value='  Show  ']")
private @Getter WebElement CustrshowBtn;
@FindBy(xpath="//td[starts-with(@id,'customerNameCell')]//a[contains(@href,'customerId')]")
private @Getter WebElement CustrNameLink;
public ActiveProjectCustPage(WebDriver driver)

{
	PageFactory.initElements(driver, this);
}}
