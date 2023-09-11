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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nutriclub.eydendigital.co.id/account/register')

WebUI.click(findTestObject('Object Repository/Register Nutri/label_Tidak Hamil dan Mempunyai Anak'))

WebUI.click(findTestObject('Object Repository/Register Nutri/input_Tanggal Lahir Anak_dp1693475946926'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Register Nutri/select_JanFebMarAprMayJunJulAug'), '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Register Nutri/select_197019711972197319741975197619771978_6a9d5b'), 
    '2022', true)

WebUI.click(findTestObject('Object Repository/Register Nutri/a_1'))

WebUI.closeBrowser()

