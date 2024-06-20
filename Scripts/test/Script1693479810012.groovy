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
List<String> urlList = ["https://www.generasimaju.co.id/artikel/1-tahun/stimulasi/manfaat-aktivitas-fisik-anak-1-tahun", "https://www.generasimaju.co.id/artikel/1-tahun/stimulasi/mainan-anak-1-tahun", "https://www.generasimaju.co.id/artikel/1-tahun/tumbuh-kembang/perkembangan-motorik-anak-1-3-tahun", "https://www.generasimaju.co.id/artikel/2-tahun/stimulasi/stimulasi-anak-2-tahun", "https://www.generasimaju.co.id/artikel/2-tahun/stimulasi/mainan-anak-2-tahun", "https://www.generasimaju.co.id/artikel/2-tahun/stimulasi/mainan-anak-laki-2-tahun", "https://www.generasimaju.co.id/artikel/1-tahun/stimulasi/aktivitas-fisik-untuk-anak-usia-1-3-tahun", "https://www.generasimaju.co.id/artikel/3-tahun/stimulasi/permainan-mendidik-anak", "https://www.generasimaju.co.id/artikel/3-tahun/stimulasi/mainan-edukasi-anak-3-tahun", "https://www.generasimaju.co.id/artikel/1-tahun/pola-asuh-anak/penyebab-mengatasi-anak-tantrum", "https://www.generasimaju.co.id/artikel/1-tahun/tumbuh-kembang/perkembangan-emosi-dan-sosial-anak-yuk-kenali-tahapannya-bun", "https://www.generasimaju.co.id/artikel/1-tahun/tumbuh-kembang/perkembangan-emosi-anak-sejak-dini", "https://www.generasimaju.co.id/artikel/1-tahun/pola-asuh-anak/anak-mandiri", "https://www.generasimaju.co.id/artikel/1-tahun/resep/resep-bola-goreng-bayam", "https://www.generasimaju.co.id/artikel/2-tahun/resep/resep-nugget-kentang-brokoli", "https://www.generasimaju.co.id/artikel/3-tahun/resep/resep-pancake-daging-mini", "https://www.generasimaju.co.id/artikel/3-tahun/resep/nugget-udang-sayur", "https://www.generasimaju.co.id/artikel/1-tahun/nutrisi-makanan/alasan-pilih-susu-sgm-eksplor-untuk-anak-usia-1-tahun-ke-atas", "https://www.generasimaju.co.id/artikel/1-tahun/nutrisi-makanan/beragam-manfaat-minum-susu-sebelum-tidur", "https://www.generasimaju.co.id/artikel/1-tahun/nutrisi-makanan/kandungan-susu-anak-untuk-pertumbuhan-tulang", "https://www.generasimaju.co.id/artikel/1-tahun/nutrisi-makanan/kebutuhan-cairan-anak", "https://www.generasimaju.co.id/artikel/1-tahun/nutrisi-makanan/susu-terfortifikasi-1-tahun-ke-atas", "https://www.generasimaju.co.id/artikel/2-tahun/nutrisi-makanan/manfaat-vitamin-c-untuk-anak", "https://www.generasimaju.co.id/artikel/1-tahun/nutrisi-makanan/manfaat-zat-besi-untuk-tumbuh-kembang-anak", "https://www.generasimaju.co.id/artikel/1-tahun/nutrisi-makanan/manfaat-dan-sumber-terbaik-vitamin-d-untuk-anak", "https://www.generasimaju.co.id/artikel/1-tahun/nutrisi-makanan/5-manfaat-omega-3-untuk-anak-agar-tumbuh-kembang-optimal", "https://www.generasimaju.co.id/artikel/1-tahun/nutrisi-makanan/sumber-manfaat-kalsium-anak", "https://www.generasimaju.co.id/artikel/2-tahun/nutrisi-makanan/mengulik-fungsi-serta-manfaat-minyak-ikan-untuk-tubuh-anak", "https://www.generasimaju.co.id/artikel/1-tahun/nutrisi-makanan/zat-besi-vitamin-c", "https://www.generasimaju.co.id/artikel/1-tahun/nutrisi-makanan/manfaat-dha-epa", "https://www.generasimaju.co.id/artikel/1-tahun/nutrisi-makanan/zinc-untuk-anak"]

// Open the first URL in the main browser window
WebUI.openBrowser(urlList[0])

// Iterate through the remaining URLs and open them in new tabs using JavaScript
for (int i = 1; i < urlList.size(); i++) {
	String url = urlList[i]
	
	// JavaScript to open a new tab
	String script = "window.open('$url', '_blank');"
	WebUI.executeJavaScript(script, null)
}
