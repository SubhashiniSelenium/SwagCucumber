package com.stepdefinition;


import com.pages.search_pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search_stepdefinition {
	search_pages search=new search_pages(null);
	
	@Given("^user launched chrome browser$")
	public void user_launched_chrome_browser() {
		search.url();
	}

	@When("^user opens Sauce demo homepage$")
	public void user_opens_Sauce_demo_homepage() {
		search.homepage();
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		search.LoginSaucedemo();
	}

	@Then("^user clicks login button$")
	public void user_clicks_login_button() {
		search.Click();
	}

	@Then("^product is add to cart$")
	public void product_is_add_to_cart() {
		search.cart();
	}

	@Then("^it serachs A to Z items$")
	public void it_serachs_A_to_Z_items() {
		search.Search();
	}



}
