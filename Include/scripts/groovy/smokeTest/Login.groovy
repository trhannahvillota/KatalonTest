package smokeTest
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class Login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	
	@Given("I navigate to PIQ Portal (.*)")
	public void i_navigate_to_PIQ_Porta(url) {
		WebUI.openBrowser("")		
		WebUI.navigateToUrl(url, FailureHandling.STOP_ON_FAILURE)
		WebUI.waitForPageLoad(30)
		
	}
	
	@When("I login valid (.*) and (.*)")
	public void i_login_valid_and(String email, String password) {
		// Write code here that turns the phrase above into concrete actions
		WebUI.setText(findTestObject('Page_Login/Login_Email'), email)
		WebUI.setText(findTestObject('Page_Login/Login_Password'), password)
		WebUI.click(findTestObject('Object Repository/Page_Login/button_Log in'))
		
	}
	
	@Then("I should be navigated to PIQ Portal landing page")
	public void i_should_be_navigated_to_PIQ_Portal_landing_page() {
		// Write code here that turns the phrase above into concrete actions
	}
	
	
}