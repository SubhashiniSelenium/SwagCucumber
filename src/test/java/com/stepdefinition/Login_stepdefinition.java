package com.stepdefinition;

import com.pages.Login_pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_stepdefinition {
	Login_pages Login= new Login_pages();
	
	@Given("^user launches the chrome browser$")
	public void user_launches_the_chrome_browser()  {
	Login.url();
	    
	}

	@When("^the user opens the sauce demo homepage$")
	public void the_user_opens_the_sauce_demo_homepage()  {
		Login.homepage();
	    
	    
	}

	@Then("^the user enters the username and password$")
	public void the_user_enters_the_username_and_password()  {
		Login.LoginSaucedemo();
	    
	}

	@Then("^the user click the login button$")
	public void the_user_click_the_login_button()  {
		Login.Click();
	    
	}



}
