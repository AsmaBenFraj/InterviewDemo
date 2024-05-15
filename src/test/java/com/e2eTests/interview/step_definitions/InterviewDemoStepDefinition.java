package com.e2eTests.interview.step_definitions;
import java.util.Map;
import org.openqa.selenium.WebElement;
import com.e2eTests.interview.page_objects.InterviewDemoPage;
import com.e2eTests.interview.utils.ConfigFileReader;
import com.e2eTests.interview.utils.SelectFromListUtils;
import com.e2eTests.interview.utils.SeleniumUtils;
import com.e2eTests.interview.utils.Setup;
import com.e2eTests.interview.utils.Validations;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InterviewDemoStepDefinition {

	public SeleniumUtils seleniumUtils;

	public SelectFromListUtils selectFromListUtils;

	public InterviewDemoPage interviewDemoPage;

	public ConfigFileReader configFileReader;

	public Validations validations;

	public InterviewDemoStepDefinition() {

		interviewDemoPage = new InterviewDemoPage();

		seleniumUtils = new SeleniumUtils();

		selectFromListUtils = new SelectFromListUtils();

		configFileReader = new ConfigFileReader();
		
		validations = new Validations();

	}

	@Given("I navigate to automation exercice app")
	public void iNavigateToAutomationExerciceApp() {
		
		Setup.getDriver().get("https://automationexercise.com/");
		
	}

	@When("I click on Contact Us")
	public void iClickOnContactUs() {

		seleniumUtils.click(InterviewDemoPage.getBtnContactUs());
	}

	@Then("verify the page has changed and {string} is displayed")
	public void verifyThePageHasChangedAndIsDisplayed(String string) {
		
		validations.isElementDisplayed(InterviewDemoPage.getMessageGetInTouch());

	}

	@Then("I fill out the form")
	public void iFillOutTheForm(DataTable dataTable) {
		
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		String Name = dataMap.get("Name");
		WebElement element = InterviewDemoPage.getNameAdd();
		seleniumUtils.writeText(element, Name);
		seleniumUtils.writeText(InterviewDemoPage.getEmailAdd(), dataMap.get("Email"));
		seleniumUtils.writeText(InterviewDemoPage.getSubjectAdd(), dataMap.get("Subject"));
		seleniumUtils.writeText(InterviewDemoPage.getMessageAdd(), dataMap.get("Your Message Here"));

	}

	@Then("I choose file")
	public void iChooseFile() {
		
		InterviewDemoPage.getUploadFile().sendKeys("C:\\Users\\Dell\\Desktop\\asmacv.jpg");
		
	}

	@Then("I click on Submit")
	public void iClickOnSubmit() throws InterruptedException {
		
		seleniumUtils.click(InterviewDemoPage.getSubmitBtn());
    Thread.sleep(3000);
	}

	@Then("verify the message {string} is displayed")
	public void verifyTheMessageIsDisplayed(String string) {
		
		Setup.getDriver().switchTo().alert().accept();
		
		validations.isElementDisplayed(InterviewDemoPage.getSuccessAlert());

	}
}
