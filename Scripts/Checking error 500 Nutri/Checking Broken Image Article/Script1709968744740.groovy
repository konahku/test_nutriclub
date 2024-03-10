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

// Daftar URL artikel
List<String> articleUrls = [
    "https://example.com/article1",
    "https://example.com/article2",
    // Tambahkan URL artikel lainnya sesuai kebutuhan
]

// Fungsi untuk memeriksa apakah gambar rusak dan menampilkan hasilnya di console
def checkBrokenImages(String url) {
    WebUI.comment("Checking images on $url")
    WebUI.openBrowser(url)

    // Mendapatkan semua elemen gambar di halaman
    List<WebElement> images = DriverFactory.getWebDriver().findElements(By.tagName('img'))

    // Loop melalui setiap gambar dan periksa apakah gambar rusak
    images.each { image ->
        String imageUrl = image.getAttribute('src')

        if (imageUrl.isEmpty()) {
            WebUI.comment("Broken image found. onerror attribute: ${image.getAttribute('onerror')}")
        } else {
            // Memeriksa apakah gambar dapat diakses
            try {
                image.getSize() // A simple interaction to check if the image is present
                WebUI.comment("Image at $imageUrl is valid.")
            } catch (Exception e) {
                WebUI.comment("Broken image found. Image URL: $imageUrl")
            }
        }
    }

    WebUI.closeBrowser()
}

// Loop melalui setiap URL artikel dan periksa gambar
articleUrls.each { articleUrl ->
    checkBrokenImages(articleUrl)
}
