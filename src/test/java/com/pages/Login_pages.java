package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_pages{
WebDriver driver;
By username = By.id("user-name");
By password = By.id("password");
By Loginbtn = By.className("btn_action");
public Login_pages() {
	this.driver=driver;
}

public void url() {
	System.setProperty("webdriver.chrome.driver", "D:/OLD/Selenium Jars/ChromeDriver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	
}
public void homepage() {
	driver.get("https://www.saucedemo.com/");
	
}
public void LoginSaucedemo() {
	driver.findElement(username).sendKeys("standard_user");
	driver.findElement(password).sendKeys("secret_sauce");
	
}
public void Click() {
driver.findElement(Loginbtn).click();
}
}
