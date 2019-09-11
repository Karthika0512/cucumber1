package com.fb.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class LoginPageSteps {
	WebDriver d;
	@Given("user launch the browser")
	public void user_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uer\\eclipse-workspace---Karthi1234\\Cucumbernew\\Driver\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://demo.guru99.com/telecom/");}

	@When("user enter all fields")
	public void user_enter_all_fields(DataTable da) {
		List<String> data=da.asList(String.class);
		d.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	    d.findElement(By.xpath("//label[@for='done']")).click();
	    d.findElement(By.xpath("//input[@id='fname']")).sendKeys(data.get(0));
	     d.findElement(By.xpath("//input[@id='lname']")).sendKeys(data.get(1));
	     d.findElement(By.xpath("//input[@id='email']")).sendKeys(data.get(2));
 d.findElement(By.xpath("//textarea[@id='message']")).sendKeys(data.get(3));
 d.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(data.get(4));
d.findElement(By.xpath("//input[@type='submit']")).click();
	   	
	   }

	@Then("verify id is displayed or not")
	public void verify_id_is_displayed_or_not() {
		 String n=d.getCurrentUrl();
		   boolean b=n.contains("addcustomer");
		   Assert.assertTrue(b);
		   System.out.println(b);
		}

	  }
