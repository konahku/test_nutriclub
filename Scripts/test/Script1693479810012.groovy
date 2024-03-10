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
List<String> urlList = ["https://www.nutriclub.co.id/artikel/kehamilan-menyusui/trimester-2/minggu-ke-22", "https://www.nutriclub.co.id/artikel/kehamilan-menyusui/trimester-2/minggu-ke-23", "https://www.nutriclub.co.id/artikel/kehamilan-menyusui/trimester-2/minggu-ke-24", "https://www.nutriclub.co.id/artikel/kehamilan-menyusui/trimester-2/minggu-ke-25", "https://www.nutriclub.co.id/artikel/kehamilan-menyusui/trimester-2/minggu-ke-26", "https://www.nutriclub.co.id/artikel/kehamilan-menyusui/trimester-3/minggu-ke-27", "https://www.nutriclub.co.id/artikel/kehamilan-menyusui/trimester-3/minggu-ke-28", "https://www.nutriclub.co.id/artikel/kehamilan-menyusui/trimester-3/minggu-ke-29", "https://www.nutriclub.co.id/artikel/kehamilan-menyusui/trimester-3/minggu-ke-30", "https://www.nutriclub.co.id/artikel/kehamilan-menyusui/trimester-3/minggu-ke-31", "https://www.nutriclub.co.id/artikel/kehamilan-menyusui/trimester-3/minggu-ke-32", "https://www.nutriclub.co.id/artikel/kehamilan-menyusui/trimester-3/minggu-ke-33", "https://www.nutriclub.co.id/artikel/kehamilan-menyusui/trimester-3/minggu-ke-34", "https://www.nutriclub.co.id/artikel/kehamilan-menyusui/trimester-3/minggu-ke-35", "https://www.nutriclub.co.id/artikel/kehamilan-menyusui/trimester-3/minggu-ke-36", "https://www.nutriclub.co.id/artikel/kehamilan-menyusui/trimester-3/minggu-ke-37", "https://www.nutriclub.co.id/artikel/kehamilan-menyusui/trimester-3/minggu-ke-38", "https://www.nutriclub.co.id/artikel/kehamilan-menyusui/trimester-3/minggu-ke-39", "https://www.nutriclub.co.id/artikel/kehamilan-menyusui/trimester-3/minggu-ke-40", "https://www.nutriclub.co.id/artikel/kehamilan-menyusui/trimester-1/perkembangan-janin-pada-trimester-pertama", "https://www.nutriclub.co.id/artikel/kehamilan-menyusui/trimester-1/hamil-trimester-1", "https://www.nutriclub.co.id/artikel/nutrisi/4-6-bulan/bayi-5-bulan-diberi-makan", "https://www.nutriclub.co.id/artikel/nutrisi/4-6-bulan/mpasi-bayi-6-bulan", "https://www.nutriclub.co.id/artikel/nutrisi/7-9-bulan/resep-mpasi-7-bulan", "https://www.nutriclub.co.id/artikel/nutrisi/7-9-bulan/mpasi-bayi-8-bulan", "https://www.nutriclub.co.id/artikel/nutrisi/7-9-bulan/mpasi-bayi-9-bulan", "https://www.nutriclub.co.id/artikel/nutrisi/10-12-bulan/mpasi-bayi-10-bulan", "https://www.nutriclub.co.id/artikel/nutrisi/10-12-bulan/mpasi-bayi-11-bulan", "https://www.nutriclub.co.id/artikel/nutrisi/4-6-bulan/camilan-bayi-6-bulan", "https://www.nutriclub.co.id/artikel/nutrisi/4-6-bulan/buah-untuk-bayi-6-bulan", "https://www.nutriclub.co.id/artikel/nutrisi/7-9-bulan/cemilan-bayi-8-bulan", "https://www.nutriclub.co.id/artikel/nutrisi/4-6-bulan/makanan-bayi-6-bulan", "https://www.nutriclub.co.id/artikel/nutrisi/7-9-bulan/makanan-bayi-9-bulan", "https://www.nutriclub.co.id/artikel/nutrisi/10-12-bulan/makanan-si-kecil-usia-12-bulan", "https://www.nutriclub.co.id/artikel/nutrisi/7-9-bulan/memberikan-makanan-padat-pertama-bayi", "https://www.nutriclub.co.id/artikel/nutrisi/7-9-bulan/tekstur-makanan-bayi-9-bulan-yang-tepat", "https://www.nutriclub.co.id/artikel/nutrisi/4-6-bulan/tanda-bayi-siap-mpasi", "https://www.nutriclub.co.id/artikel/nutrisi/7-9-bulan/kapan-si-kecil-siap-untuk-makanan-tambahan", "https://www.nutriclub.co.id/artikel/pola-asuh-anak/bayi/mempersiapkan-makanan-bayi", "https://www.nutriclub.co.id/artikel/pola-asuh-anak/bayi/mengenalkan-mpasi-pada-si-kecil", "https://www.nutriclub.co.id/artikel/pola-asuh-anak/bayi/tips-memperkenalkan-makanan-pada-bayi-6-8-bulan", "https://www.nutriclub.co.id/artikel/pola-asuh-anak/bayi/tips-memberikan-makanan-pada-bayi-8-10-bulan", "https://www.nutriclub.co.id/artikel/pola-asuh-anak/bayi/strategi-tepat-mpasi-pertama", "https://www.nutriclub.co.id/artikel/nutrisi/7-9-bulan/mpasi-dengan-metode-baby-led-weaning-blw", "https://www.nutriclub.co.id/artikel/nutrisi/7-9-bulan/manfaat-mpasi", "https://www.nutriclub.co.id/artikel/nutrisi/7-9-bulan/mpasi-yang-dapat-mencerdaskan-otak"]

// Open the first URL in the main browser window
WebUI.openBrowser(urlList[0])

// Iterate through the remaining URLs and open them in new tabs using JavaScript
for (int i = 1; i < urlList.size(); i++) {
	String url = urlList[i]
	
	// JavaScript to open a new tab
	String script = "window.open('$url', '_blank');"
	WebUI.executeJavaScript(script, null)
}
