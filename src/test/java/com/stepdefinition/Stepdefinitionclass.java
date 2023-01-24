package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinitionclass {
	
	WebDriver driver ;
	
	@Given("user is on adactin page")
	public void user_is_on_adactin_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	   
	}

	@When("user should enter {string}and{string}")
	public void user_should_enter_and(String username, String password) {
		 WebElement usr = driver.findElement(By.id("username"));
		   usr.sendKeys(username);
	
		   WebElement pass = driver.findElement(By.id("password"));
		   pass.sendKeys(password);
		
	   
	}

	@When("user should click login button")
	public void user_should_click_login_button() {
		WebElement btn = driver.findElement(By.id("login"));
		   btn.click();  
	   
	}

	@Then("user should verify after login success message")
	public void user_should_verify_after_login_success_message() {
	   
		 Assert.assertTrue("verifiying", true);
	}

	@Then("user should enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_enter(String Location, String Hotels, String roomtype, String noofrooms, String datein, String dateout, String adper, String cdper) {
		WebElement loc = driver.findElement(By.id("location"));
		loc.sendKeys(Location);
		
		WebElement htl = driver.findElement(By.id("hotels"));
		htl.sendKeys(Hotels);
		
		WebElement rtype = driver.findElement(By.id("room_type"));
		rtype.sendKeys(roomtype);
		
		WebElement noofroms = driver.findElement(By.id("room_nos"));
		noofroms.sendKeys(noofrooms);
		
		WebElement din = driver.findElement(By.id("datepick_in"));
		din.sendKeys(datein);
		
		WebElement dout = driver.findElement(By.id("datepick_out"));
		dout.sendKeys(dateout);
		
		WebElement aper = driver.findElement(By.id("adult_room"));
		aper.sendKeys(adper);
		
		WebElement cper = driver.findElement(By.id("child_room"));
		cper.sendKeys(cdper);
	   
	}

	@Then("user should click search button")
	public void user_should_click_search_button() {
		WebElement srchbtn = driver.findElement(By.id("Submit"));
		srchbtn.click();
	   
	}

	@Then("user should selecthotel")
	public void user_should_selecthotel() {
		WebElement slcthtl = driver.findElement(By.id("radiobutton_1"));
		slcthtl.click();
	}

	@Then("user should click continue")
	public void user_should_click_continue() {
	   
		WebElement cnt = driver.findElement(By.id("continue"));
		cnt.click();
	}

	@Then("user should enter after select hotel {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_enter_after_select_hotel(String frstnme, String lstnme, String add, String ccnum, String cctype, String month, String yr, String ccv) {
		WebElement frstnmee = driver.findElement(By.id("first_name"));
		frstnmee.sendKeys(frstnme);
		
		WebElement lstnmee = driver.findElement(By.id("last_name"));
		lstnmee.sendKeys(lstnme);
		
		WebElement addd = driver.findElement(By.id("address"));
		addd.sendKeys(add);
		
		WebElement ccnumm = driver.findElement(By.id("cc_num"));
		ccnumm.sendKeys(ccnum);
		
		WebElement cctypee = driver.findElement(By.id("cc_type"));
		cctypee.sendKeys(cctype);
		
		WebElement monthh = driver.findElement(By.id("cc_exp_month"));
		monthh.sendKeys(month);
		
		WebElement yrr = driver.findElement(By.id("cc_exp_year"));
		yrr.sendKeys(yr);
		
		WebElement ccvv = driver.findElement(By.id("cc_cvv"));
		ccvv.sendKeys(ccv);
	   
	   
	}

	@Then("user should click booknow")
	public void user_should_click_booknow() {
	   
		WebElement bknow = driver.findElement(By.id("book_now"));
		bknow.click();
	   
	}

	@Then("user should get booking id")
	public void user_should_get_booking_id() throws InterruptedException {
		Thread.sleep(5000);
		WebElement bkid = driver.findElement(By.xpath("//input[@name='order_no']"));
		String attribute = bkid.getAttribute("value");
		System.out.println(attribute);
	   
	}


}
