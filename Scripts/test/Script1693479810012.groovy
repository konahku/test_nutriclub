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
List<String> urlList = ["https://www.nutriclub.co.id/artikel/kesehatan/4-6-bulan/bayi-sering-kentut-belum-tentu-pertanda-adanya-gangguan-pencernaan", "https://www.nutriclub.co.id/artikel/kesehatan/4-6-bulan/atasi-konstipasi-pada-si-kecil", "https://www.nutriclub.co.id/artikel/kesehatan/7-9-bulan/mengatasi-perut-kembung-bayi", "https://www.nutriclub.co.id/artikel/kesehatan/7-9-bulan/bab-berdarah-pada-bayi", "https://www.nutriclub.co.id/artikel/kesehatan/7-9-bulan/ketahui-lebih-banyak-seputar-diare-pada-si-kecil", "https://www.nutriclub.co.id/artikel/kesehatan/7-9-bulan/atasi-flu-perut-atau-gastroenteritis-pada-si-kecil", "https://www.nutriclub.co.id/artikel/kesehatan/1-tahun/penyebab-anak-susah-bab", "https://www.nutriclub.co.id/artikel/kesehatan/1-tahun/kenali-diare-pada-anak-jenis-tanda-bahaya-dan-pencegahan", "https://www.nutriclub.co.id/artikel/kesehatan/1-tahun/kenali-penyebabnya-dan-cegah-resiko-infeksi-usus-pada-anak", "https://www.nutriclub.co.id/artikel/kesehatan/2-tahun/atasi-masalah-mata-yang-umum-terjadi-pada-balita", "https://www.nutriclub.co.id/artikel/kesehatan/2-tahun/informasi-lengkap-seputar-pendengaran-bagi-balita", "https://www.nutriclub.co.id/artikel/kesehatan/4-6-bulan/cegah-terjadinya-infeksi-telinga-pada-si-kecil", "https://www.nutriclub.co.id/artikel/kesehatan/1-tahun/kenali-masalah-keseimbangan-tubuh-balita", "https://www.nutriclub.co.id/artikel/kesehatan/1-tahun/mengatasi-asma-pada-balita", "https://www.nutriclub.co.id/artikel/kesehatan/0-3-bulan/informasi-seputar-penatalaksanaan-ikterus-pada-si-kecil", "https://www.nutriclub.co.id/artikel/kesehatan/0-3-bulan/mengatasi-kuning-pada-si-kecil", "https://www.nutriclub.co.id/artikel/kesehatan/1-tahun/waspadai-gejala-cerebral-palsy-pada-balita", "https://www.nutriclub.co.id/artikel/kesehatan/1-tahun/penyakit-autoimun-pada-anak", "https://www.nutriclub.co.id/artikel/kesehatan/3-tahun-atas/waspadai-risiko-kanker-pada-balita", "https://www.nutriclub.co.id/artikel/kesehatan/0-3-bulan/sindrom-kematian-mendadak-pada-si-kecil", "https://www.nutriclub.co.id/artikel/kesehatan/7-9-bulan/perilaku-autistik-pada-anak", "https://www.nutriclub.co.id/artikel/kesehatan/1-tahun/tanda-autisme-pada-balita", "https://www.nutriclub.co.id/artikel/kesehatan/0-3-bulan/kenali-informasi-lengkap-seputar-down-syndrome-pada-si-kecil", "https://www.nutriclub.co.id/artikel/kesehatan/2-tahun/tanda-perilaku-adhd", "https://www.nutriclub.co.id/artikel/kesehatan/2-tahun/stres-pada-balita"]

// Open the first URL in the main browser window
WebUI.openBrowser(urlList[0])

// Iterate through the remaining URLs and open them in new tabs using JavaScript
for (int i = 1; i < urlList.size(); i++) {
	String url = urlList[i]
	
	// JavaScript to open a new tab
	String script = "window.open('$url', '_blank');"
	WebUI.executeJavaScript(script, null)
}
