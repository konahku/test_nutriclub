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

// Daftar angka dalam bentuk huruf
def numberWords = ["", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas", "dua belas", "tiga belas", "empat belas", "lima belas", "enam belas", "tujuh belas", "delapan belas", "sembilan belas", "dua puluh", "dua puluh satu", "dua puluh dua", "dua puluh tiga", "dua puluh empat", "dua puluh lima", "dua puluh enam", "dua puluh tujuh", "dua puluh delapan", "dua puluh sembilan", "tiga puluh"]

// Jumlah kali yang ingin diulang (35 kali)
def totalIterations = 35

// Kata yang akan digunakan sebelum angka
def prefix = "zizah"

// Inisialisasi StringBuilder untuk menampung hasil
def resultBuilder = new StringBuilder()

// Loop untuk menghasilkan pola
for (int i = 1; i <= totalIterations; i++) {
	def numberWord = numberWords[i]
	def result = "${prefix} ${numberWord}"
	resultBuilder.append(result).append('\n')
}

// Tampilkan hasil di log Katalon Studio
println(resultBuilder.toString())
