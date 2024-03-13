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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement

// List of URLs
List<String> urlList = ["https://www.nutriclub.co.id/artikel/pola-asuh-anak/2-tahun/weaning-with-love-menyapih-dengan-cinta",
"https://www.nutriclub.co.id/artikel/pola-asuh-anak/2-tahun/info-daycare-dan-tips-mencari-pengasuh-infal",
"https://www.nutriclub.co.id/artikel/pola-asuh-anak/2-tahun/persiapan-dana-darurat-anak",
"https://www.nutriclub.co.id/artikel/pola-asuh-anak/2-tahun/anak-susah-makan-apa-yang-harus-dilakukan",
"https://www.nutriclub.co.id/artikel/pola-asuh-anak/2-tahun/mendidik-anak-siap-menghadapi-era-vuca",
"https://www.nutriclub.co.id/artikel/pola-asuh-anak/2-tahun/mengasah-kreativitas-balita",
"https://www.nutriclub.co.id/artikel/pola-asuh-anak/2-tahun/pendidikan-anak-usia-dini",
"https://www.nutriclub.co.id/artikel/pola-asuh-anak/2-tahun/kendalikan-tantrum-di-waktu-makan-balita",
"https://www.nutriclub.co.id/artikel/pola-asuh-anak/2-tahun/memperkenalkan-si-kecil-dengan-kakaknya",
"https://www.nutriclub.co.id/artikel/pola-asuh-anak/2-tahun/cara-menidurkan-anak-setelah-disapih",
"https://www.nutriclub.co.id/artikel/stimulasi/2-tahun/ajari-balita-menyikat-gigi",
"https://www.nutriclub.co.id/artikel/stimulasi/2-tahun/aktivitas-fisik-untuk-menunjang-kesehatan-dan-kecerdasan-anak",
"https://www.nutriclub.co.id/artikel/stimulasi/2-tahun/kemampuan-pemecahan-masalah",
"https://www.nutriclub.co.id/artikel/stimulasi/2-tahun/ketahui-bakat-terpendam-balita",
"https://www.nutriclub.co.id/artikel/stimulasi/2-tahun/melatih-kecerdasan-anak-2-tahun",
"https://www.nutriclub.co.id/artikel/stimulasi/2-tahun/metode-sukses-potty-training-balita",
"https://www.nutriclub.co.id/artikel/stimulasi/2-tahun/permainan-dalam-ruangan-yang-seru",
"https://www.nutriclub.co.id/artikel/stimulasi/2-tahun/sensory-play",
"https://www.nutriclub.co.id/artikel/stimulasi/2-tahun/usia-anak-2-tahun",
"https://www.nutriclub.co.id/artikel/stimulasi/2-tahun/yuk-buat-mainan-edukasi-bersama-si-kecil",
"https://www.nutriclub.co.id/artikel/stimulasi/2-tahun/mainan-edukasi-anak-2-tahun",
"https://www.nutriclub.co.id/artikel/stimulasi/2-tahun/eksperimen-sains-sederhana-anak",
"https://www.nutriclub.co.id/artikel/stimulasi/2-tahun/steam-education-anak",
"https://www.nutriclub.co.id/artikel/pola-asuh-anak/2-tahun/cara-menyapih-anak",
"https://www.nutriclub.co.id/artikel/stimulasi/2-tahun/kecerdasan-interpersonal",
"https://www.nutriclub.co.id/artikel/stimulasi/2-tahun/decision-making-anak"]

// Open the first URL in the main browser window
WebUI.openBrowser(urlList[0])

// Iterate through the remaining URLs and open them in new tabs using JavaScript
for (int i = 1; i < urlList.size(); i++) {
	String url = urlList[i]
	
	// JavaScript to open a new tab
	String script = "window.open('$url', '_blank');"
	WebUI.executeJavaScript(script, null)
}
