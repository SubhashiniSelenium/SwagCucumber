package com.stepdefinition;

import com.pages.AddToCart_pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCart_stepdefinition {
	AddToCart_pages Add= new AddToCart_pages();
	
	@Given("^the user launched the chrome browser$")
	public void the_user_launched_the_chrome_browser() {
		Add.url();
		
	}

	@When("^user opens the Sauce demo homepage$")
	public void user_opens_the_Sauce_demo_homepage() {
		Add.homepage();
	}

	@Then("^user enters the username and password$")
	public void user_enters_the_username_and_password() {
		Add.LoginSaucedemo();
	}

	@Then("^the user clicks the login button$")
	public void the_user_clicks_the_login_button() 
	{
		Add.Click();
	}

	@Then("^the product is added to cart$")
	public void the_product_is_added_to_cart() {
		Add.cart();
	}



}
