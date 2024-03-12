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

String randomPhoneNumber = generateRandomPhoneNumber()

println("Nomor telepon acak dengan kondisi: $randomPhoneNumber")

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nutriclub.eydendigital.co.id/account/register')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Register Nutri/input_Nama Lengkap_Fullname'), 'zia')

// Ganti "idField" dengan ID elemen field yang ingin diisi dengan angka acak
WebUI.setText(findTestObject('Register Nutri/input_No. Handphone (Terhubung Whatsapp)_member_mobilephone'), randomPhoneNumber)

WebUI.setEncryptedText(findTestObject('Register Nutri/input_Password_member_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.setEncryptedText(findTestObject('Register Nutri/input_Konfirmasi Password_ConfirmPassword'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.verifyTextPresent('Nomor HP Mama tidak terdaftar di Indonesia', false)

WebUI.click(findTestObject('Register Nutri/div_Ya Hapus_registration__image text-center'))

WebUI.delay(3)

WebUI.scrollToPosition(10, 800)

WebUI.click(findTestObject('Register Nutri/checked sk'))

WebUI.verifyElementNotClickable(findTestObject('Register Nutri/button_DAFTAR'))

String generateRandomPhoneNumber() {
    def random = new Random()

    def phoneNumber = ''

    while (true) {
        phoneNumber = '08'

        while (phoneNumber.size() < 12) {
            def digit = random.nextInt(10)

            phoneNumber += digit
        }
        
        def excludedPrefixes = ['0811', '0812', '0813', '0821', '0822', '0823', '0852', '0853', '0814', '0815', '0816', '0855'
            , '0856', '0857', '0858', '0881', '0882', '0883', '0884', '0885', '0886', '0887', '0888', '0889', '0817', '0818'
            , '0819', '0859', '0877', '0878', '0831', '0832', '0833', '0838', '0895', '0896', '0897', '0898', '0899']

        def isExcludedPrefix = false

        for (String prefix : excludedPrefixes) {
            if (phoneNumber.startsWith(prefix)) {
                isExcludedPrefix = true

                break
            }
        }
        
        if (!(isExcludedPrefix)) {
            break
        }
    }
    
    return phoneNumber
}

