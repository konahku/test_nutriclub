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

WebUI.openBrowser('https://nutriclub.co.id/')

//WebUI.setViewPortSize(375, 812)
WebUI.click(findTestObject('Homepage/a_Register'))

//WebUI.click(findTestObject('Register - Nutriclub/button_Saya Setuju'))
WebUI.setText(findTestObject('Register - Nutriclub/input_Nama Lengkap_Fullname'), 'zeezah testing')

WebUI.setText(findTestObject('Register - Nutriclub/input_No. Handphone (Terhubung Whatsapp)_member_mobilephone'), '085784018007')

WebUI.setEncryptedText(findTestObject('Register - Nutriclub/input_Password_member_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

//WebUI.waitForElementClickable(findTestObject('Register - Nutriclub/div_kondisi ibu'), 10)

WebUI.click(findTestObject('Register - Nutriclub/div_kondisi ibu'))

WebUI.click(findTestObject('Register - Nutriclub/li_Sedang Hamil'))

WebUI.setText(findTestObject('Register - Nutriclub/Usia Kehamilan (Minggu)'), '12')

WebUI.waitForElementClickable(findTestObject('Register - Nutriclub/Checkbox'), 10)

WebUI.check(findTestObject('Register - Nutriclub/Checkbox'))

WebUI.click(findTestObject('Register - Nutriclub/button_DAFTAR'))

