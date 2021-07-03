package StepDefinitions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class HooksTest {

	@Before
	public void BeforeHooks() {
		System.out.println("Before Hooks");
	}
	
	@Given("^Execute step one$")
public void execute_step_one() throws Throwable {
   System.out.println("......Step1....");
}

@When("^Execute step two$")
public void execute_step_two() throws Throwable {
	 System.out.println("......Step2....");
    
}

@When("^Execute step three$")
public void execute_step_three() throws Throwable {
	 System.out.println("......Step3....");
}

@Then("^end the process$")
public void end_the_process() throws Throwable {
   System.out.println("End the process");
}

@After
public void AfterHooks()
{
	System.out.println("After Hooks");
}
}
