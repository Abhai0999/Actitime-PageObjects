package com.actitime.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import lombok.Getter;

public abstract class BasePage 
{
	@FindBy(xpath="//span[@class='bottomBorder']/preceding-sibling::div[text()='Tasks']")
	private @Getter WebElement TaskEle;
	@FindBy(id="logoutLink")
	private @Getter WebElement Logoutlink;
    public BasePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
