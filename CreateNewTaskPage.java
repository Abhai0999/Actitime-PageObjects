package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class CreateNewTaskPage 
{
@FindBy(xpath ="//td//select[@name='customerId']")
private @Getter WebElement SelCustDrpdwn;
@FindBy(xpath="//td//select[@name='projectId']")
private @Getter WebElement SelProjDrpdwn;
@FindBy(xpath="//td[@id='task0.cell']//input[@name='task[0].name']")
private @Getter WebElement EntrTaskNameField;
@FindBy(xpath="//div[@id='ext-gen6']//input[@name='task[0].deadline']")
private @Getter WebElement EntrDeadlineField;
@FindBy(css="select[name='task[0].billingType']")
private @Getter WebElement BillingTypDrpdwn;
@FindBy(css="input[name='task[0].markedToBeAddedToUserTasks']")
private @Getter WebElement MyTimeTrkCkBx;
@FindBy(css="input[value='Create Tasks']")
private @Getter WebElement CreateTskBtn;


public CreateNewTaskPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
