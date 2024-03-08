import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriverException

WebUI.openBrowser(GlobalVariable.URL)

WebUI.click(findTestObject('Homepage/a_Login'))

try {

	// Verify the response code
	int responseCode = DriverFactory.getWebDriver().manage().logs().get("performance")
		.filter { it.message.contains('"statusCode":') }
		.collect { it.message.replaceAll(/.*"statusCode": (\d+),.*/, '$1') }
		.find { it.toInteger() >= 500 }

	if (responseCode != null) {
		// The website returned a 5xx status code
		println("Website returned a $responseCode status code.")
	} else {
		// The website is accessible
		println("Website is accessible.")
	}
} catch (WebDriverException e) {
	// Handle WebDriverException (e.g., if the website is not reachable)
	println("Error accessing the website: " + e.getMessage())
} finally {
	// Close the browser
	WebUI.closeBrowser()
}
