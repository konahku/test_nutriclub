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
	
// Jumlah kali yang ingin diulangi
def totalIterations = 35

// Nama yang ingin digunakan
def name = 'zizah'

	WebUI.openBrowser('https://nutriclub.eydendigital.co.id/account/register')

	WebUI.maximizeWindow()

// Masukkan kode script ke dalam langkah "Script"
	for (int i = 1; i <= totalIterations; i++) {
		def numberWord = numberToWords(i)

		def result = "$name $numberWord"
	
	// Buka tab baru
	//WebUI.callTestCase('Common/Click New Tab')

	// Ganti ke tab baru
	//WebUI.switchToWindowIndex(WebUI.getWindowHandles().size() - 1)

    // Isi field dalam form dengan angka acak
    String randomNum = generateRandomNumber()


    WebUI.setText(findTestObject('Register Nutri/input_Nama Lengkap_Fullname'), result)

    // Ganti "idField" dengan ID elemen field yang ingin diisi dengan angka acak
    WebUI.setText(findTestObject('Register Nutri/input_No. Handphone (Terhubung Whatsapp)_member_mobilephone'), randomNum)

    WebUI.setEncryptedText(findTestObject('Register Nutri/input_Password_member_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

    WebUI.setEncryptedText(findTestObject('Register Nutri/input_Konfirmasi Password_ConfirmPassword'), 'iFGeFYmXIrUhQZHvW7P22w==')
}


// Fungsi untuk mengubah angka menjadi huruf dalam bahasa Indonesia
def numberToWords(int number) {
    def words = ['satu', 'dua', 'tiga', 'empat', 'lima', 'enam', 'tujuh', 'delapan', 'sembilan', 'sepuluh', 'sebelas', 'dua belas'
        , 'tiga belas', 'empat belas', 'lima belas', 'enam belas', 'tujuh belas', 'delapan belas', 'sembilan belas']

    if (number < 20) {
        return words[number]
    } else if (number < 100) {
        return ((words[(number / 10)]) + ' puluh ') + (words[(number % 10)])
    } else {
        return ''
    }
}

String generateRandomNumber() {
    Random random = new Random()

    String lastNineDigits = String.format('%09d', random.nextInt(1000000000))

    String randomNumber = '0811' + lastNineDigits

    return randomNumber
}

