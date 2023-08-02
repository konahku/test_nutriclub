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

// Isi field dalam form dengan angka acak
String randomNum = generateRandomNumber()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nutriclub.eydendigital.co.id/account/register')

WebUI.setText(findTestObject('Object Repository/Register SGM/input_Nama Lengkap_Fullname'), 'Testing sdk')

// Ganti "idField" dengan ID elemen field yang ingin diisi dengan angka acak
WebUI.setText(findTestObject('Object Repository/Register SGM/input_No. Handphone (Terhubung Whatsapp)_member_mobilephone'), 
    randomNum)

WebUI.setEncryptedText(findTestObject('Object Repository/Register SGM/input_Password_member_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.setEncryptedText(findTestObject('Object Repository/Register SGM/input_Konfirmasi Password_ConfirmPassword'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Register SGM/kondisi belum hamil'))

WebUI.click(findTestObject('Object Repository/Register SGM/input_Kode Refereal  Kode Event (opsional)_Agreement'))

WebUI.click(findTestObject('Object Repository/Register SGM/button_DAFTAR'))

String generateRandomNumber() {
    Random random = new Random()

    String lastNineDigits = String.format('%09d', random.nextInt(1000000000))

    String randomNumber = '0895' + lastNineDigits

    return randomNumber
}

////SGM Register
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://generasi.eydendigital.co.id/klub-generasi-maju/register')
//
//WebUI.click(findTestObject('Object Repository/Register SGM/button_SAYA SETUJU'))
//
//WebUI.scrollToPosition(10, 500)
//
//WebUI.click(findTestObject('Object Repository/Register SGM/div_Kondisi Bunda'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Object Repository/Register SGM/div_Belum Hamil'))
//
//WebUI.click(findTestObject('Object Repository/Register SGM/input_Saya telah membacadan_sayasetuju'))

