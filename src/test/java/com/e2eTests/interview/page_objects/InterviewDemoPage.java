package com.e2eTests.interview.page_objects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.e2eTests.interview.utils.BasePage;
import com.e2eTests.interview.utils.Setup;

public class InterviewDemoPage extends BasePage {
	
	/* Retrieve element */
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Contact us']")
	private static WebElement btnContactUs;

	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Get In Touch']")
	private static WebElement messageGetInTouch;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
	private static WebElement nameAdd;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Email']")
	private static WebElement emailAdd;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Subject']")
	private static WebElement subjectAdd;
	
	@FindBy(how = How.XPATH, using = "//textarea[@id='message']")
	private static WebElement messageAdd;
	
	@FindBy(how = How.XPATH, using = "//input[@name='upload_file']")
	private static WebElement uploadFile;
	
	@FindBy(how = How.XPATH, using = "//input[@name='submit']")
	private static WebElement submitBtn;
	
	@FindBy(how = How.ID, using = "//div[@class='status alert alert-success']")
	private static WebElement successAlert;
	
	
	
	public InterviewDemoPage() {
		super(Setup.getDriver());
	}
	public static WebElement getBtnContactUs() {
		return btnContactUs;
	}
	public static WebElement getMessageGetInTouch() {
		return messageGetInTouch;
	}
	public static WebElement getNameAdd() {
		return nameAdd;
	}

	public static WebElement getEmailAdd() {
		return emailAdd;
	}

	public static WebElement getMessageAdd() {
		return messageAdd;
	}

	public static WebElement getSubjectAdd() {
		return subjectAdd;
	}
	public static WebElement getUploadFile() {
		return uploadFile;
	}
	
	public static WebElement  getSubmitBtn() {
		return submitBtn;
	}
	public static WebElement getSuccessAlert() {
		return successAlert;
	}
	

}
