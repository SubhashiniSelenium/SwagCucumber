package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class search_pages {
WebDriver driver;
By username = By.id("user-name");
By password = By.id("password");
By Loginbtn = By.className("btn_action");
By AddToCart=By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button");
By Search=By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div[3]/select/option[2]");
//By ViewCart=By.xpath("/html/body/div/div[2]/div[1]/div[2]/a/svg/path");
public search_pages(WebDriver driver)
{
	this.driver=driver;
}

public void url() {
	System.setProperty("webdriver.chrome.driver", "D:/OLD/Selenium Jars/ChromeDriver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	
}
public void homepage() {
	driver.get("https://www.saucedemo.com/"); }
public void LoginSaucedemo() {
	driver.findElement(username).sendKeys("standard_user");
	driver.findElement(password).sendKeys("secret_sauce");
	
}
public void Click() {
driver.findElement(Loginbtn).click();
}
public void cart() {	
	driver.findElement(AddToCart).click();
}
	
	public void Search()
	{
		driver.findElement(Search).click();
	  // driver.findElement(ViewCart).click();
}
}
