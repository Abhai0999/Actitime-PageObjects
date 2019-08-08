package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class LoginPAge 
{
@FindBy(name="username")
private @Getter WebElement UnTxBx;
@FindBy(name="pwd")
private @Getter WebElement pswTxBx;
@FindBy(id="loginButton")
private @Getter WebElement LoginBtn;

 public LoginPAge(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 }