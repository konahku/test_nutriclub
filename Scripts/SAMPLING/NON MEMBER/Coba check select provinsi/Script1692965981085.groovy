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

String randomNum = generateRandomNumber()

def randomEmail = generateRandomEmail()

def randomAddress = generateRandomAddress()

println("Alamat Acak: $randomAddress")

println("Email Acak: $randomEmail")


WebUI.openBrowser('https://nutriclub.eydendigital.co.id/sampling/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('button - cookie saya setuju'))

WebUI.setText(findTestObject('Sampling Form/input_Mama, Silakan Upload Struk Pembelian,_cb14af'), randomNum)

WebUI.click(findTestObject('Sampling Form/button_check phone number'))

WebUI.setText(findTestObject('Sampling Form/input__member_fullname'), 'jabar')

WebUI.setText(findTestObject('Sampling Form/input_Email Mama_member_email'), randomEmail)

WebUI.click(findTestObject('Sampling Form/button_Selanjutnya to address form'))

WebUI.verifyTextPresent('Provinsi', false)

WebUI.click(findTestObject('Sampling Form/dropdown provinsi'))

//WebUI.click(findTestObject('Sampling Form/li_Jawa Barat'))
WebUI.setText(findTestObject('Sampling Form/form alamat'), randomAddress)


def generateRandomChar() {
    def chars = 'abcdefghijklmnopqrstuvwxyz1234567890'

    def random = new Random()

    return chars[random.nextInt(chars.length())]
}

def generateRandomAddress() {
    def address = ''

    while (address.length() < 30) {
        address += generateRandomChar()
    }
    
    return address
}

def generateRandomEmail() {
    def email = 'user'

    def domain = '@mailinator.com'

    def maxLength = 10

    (1..maxLength).each({ 
            email += generateRandomChar()
        })

    return email + domain
}

String generateRandomNumber() {
    Random random = new Random()

    String lastNineDigits = String.format('%09d', random.nextInt(1000000000))

    String randomNumber = '0812' + lastNineDigits

    return randomNumber
}

