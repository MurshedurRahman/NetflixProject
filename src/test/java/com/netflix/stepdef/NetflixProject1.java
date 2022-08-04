package com.netflix.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.netflix.common.NetflixBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NetflixProject1 extends NetflixBase {
	@Given("I am on the netflix homepage")
	public void i_am_on_the_netflix_homepage() {
		launchBrowser();
	  
	}

	@When("I click on sign in")
	public void i_click_on_sign_in() {
		 WebElement signin = driver.findElement(By.xpath("//a[@class=\"authLinks redButton\"]"));
		 signin.click(); 
	}

	@Then("I put my {string} in the email address")
	public void i_put_my_in_the_email_address(String string) {
	  WebElement email = driver.findElement(By.id("id_userLoginId"));
	  email.sendKeys(string);
	}

	@Then("I put my {string}")
	public void i_put_my(String string) {
		WebElement password = driver.findElement(By.id("id_password"));
		password.sendKeys(string);
	    
	}

	@Then("I click  sign in")
	public void i_click_sign_in() {
		WebElement signinbutton = driver.findElement(By.xpath("//button[@class=\"btn login-button btn-submit btn-small\"]"));
		signinbutton.click();
	    
	}

	@Then("I access to my account")
	public void i_access_to_my_account() {
	  
	}


}
