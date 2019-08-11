package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import lombok.Getter;

public class OpenTaskPage 
{
	WebDriver driver;
@FindBy(linkText = "Projects & Customers")
private @Getter WebElement PndCElm;
@FindBy(css="input[value='Create New Tasks']")
private @Getter WebElement CreateNewTasks;
@FindBy(xpath = "//table[@id='SuccessMessages']//span")
private @Getter WebElement TskSuccessmsg;

@FindBy(id="cpSelector.cpButton.contentsContainer")
private @Getter WebElement TskSelDepdown;
@FindBy(xpath="//div[@class='dropdown-panel-inner-div']//td/input[@id='allActiveCustomersProjectsRadio']")
private @Getter WebElement ALLActivePro_CustRadioBtn;
@FindBy(xpath="//span[text()='GE HealthCare']")
private @Getter WebElement SelCustChkBx;
@FindBy(id="closeButton")
private @Getter WebElement SelTskCloseBtn;
@FindBy(name="visiableFilterString")
private @Getter WebElement TskNameTxBx;
@FindBy(id="tasksFilterSubmitButton")
private @Getter WebElement TskFiltrBtn;
@FindBy(xpath= "//td[@class='listtblcell']//a[contains(@href,'taskId')]")
private @Getter WebElement TaskSelLink;
@FindBy(xpath="//td/span[@class='successmsg']")
private @Getter WebElement DelTskSuccMsg;

public OpenTaskPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
