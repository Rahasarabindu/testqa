package Stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber_java.google;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login extends google {

	//ChromeDriver driver;
	


static login ln=new login();


@Given("google page is open")
public void google_page_is_open() {
    // Write code here that turns the phrase above into concrete actions
	google.setup();
	System.out.println("hi");

	//obj.launchbrowser();

   // throw new io.cucumber.java.PendingException();
}

@When("search with cucumber")
public void search_with_cucumber(DataTable datatable) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("page title is ::::");
	ln.gettitle();
	
	List<Map<String,String>> l= datatable.asMaps(String.class,String.class);
	System.out.println(l.get(0).get("version"));
	driver.findElement(By.name("q")).sendKeys("test");
 
   // throw new io.cucumber.java.PendingException();
}

@Then("get result")
public void get_result() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("hello");
    //throw new io.cucumber.java.PendingException();
	driver.quit();
}


}
