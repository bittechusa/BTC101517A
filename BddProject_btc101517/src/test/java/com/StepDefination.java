package com;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination 
{
	
	
	@Before("@smoke")
	public void fhtr()
	{
		System.out.println("beforetag");
	}
	@Before
	public void tr()
	{
		System.out.println("before");
	}
	@After
	public void ert()
	{
		System.out.println("after");
	}
	WebDriver dr;
	@Given("^nevigate to url$")
	public void nevigate_to_url() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bittechconsulting/Downloads/chromedriver");
		dr = new ChromeDriver();
		dr.get("http://www.facebook.com");
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@When("^i type userId \"([^\"]*)\"$")
	public void i_type_userId(String arg1) throws Throwable {
		 dr.findElement(By.id("email")).sendKeys(arg1);
	}

	
	@When("^i verify the homepage title$")
	public void i_verify_the_homepage_title() throws Throwable 
	{
	    System.out.println("fgfd");
	}

	@Then("^i should get true result$")
	public void i_should_get_true_result() throws Throwable 
	{
	    System.out.println("dfg");
	}

	@When("^I type pass \"([^\"]*)\"$")
	public void i_type_pass(String arg1) throws Throwable 
	{
		
		Thread.sleep(4000);
		dr.findElement(By.id("pass")).sendKeys(arg1);
	}

	@When("^i click login button$")
	public void i_click_login_button() throws Throwable 
	{
		Thread.sleep(4000);
		dr.quit();
	}



	@When("^i type my valid userId$")
	public void i_type_my_valid_userId() throws Throwable
	{
	    dr.findElement(By.id("email")).sendKeys("khk");
	}

	@When("^I type my valid password$")
	public void i_type_my_valid_password() throws Throwable 
	{
	    dr.findElement(By.id("pass")).sendKeys("gjg");
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable 
	{
	   System.out.println("clicked");
	}

	@Then("^as a user i should be logged in$")
	public void as_a_user_i_should_be_logged_in() throws Throwable 
	{
	   System.out.println("verified");
	}

	@When("^verify title$")
	public void verify_title() throws Throwable 
	{
	    System.out.println(dr.getTitle().contains("emran"));
	}
	
	
	@When("^i type my invalid userId$")
	public void i_type_my_invalid_userId() throws Throwable 
	{
		 dr.findElement(By.id("email")).sendKeys("gjggfd");
	}

	@When("^I type my invalid password$")
	public void i_type_my_invalid_password() throws Throwable 
	{
		 dr.findElement(By.id("pass")).sendKeys("gjghfd");
	}

	@Then("^as a user i should not be logged in$")
	public void as_a_user_i_should_not_be_logged_in() throws Throwable 
	{
	    System.out.println("nothing should be appear from profile page");
	}

}
