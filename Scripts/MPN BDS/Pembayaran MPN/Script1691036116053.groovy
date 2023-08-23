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

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('http://10.14.20.231:3000/bankmega/cabang')
//
//WebUI.setText(findTestObject('Object Repository/Menu MPN/Page_Bank Mega/input_Nama Akun_sign-user'), 'uatstaff1')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Menu MPN/Page_Bank Mega/input_Kata Sandi_sign-pass'), 'Ww1FHTu5Bdwnxl+MZHmZkA==')
//
//WebUI.sendKeys(findTestObject('Object Repository/Menu MPN/Page_Bank Mega/input_Kata Sandi_sign-pass'), Keys.chord(Keys.ENTER))
WebUI.click(findTestObject('Object Repository/Menu MPN/Page_Bank Mega/button_'))

WebUI.click(findTestObject('Object Repository/Menu MPN/Page_Bank Mega/a_TRANSAKSI LAINNYA'))

WebUI.click(findTestObject('Object Repository/Menu MPN/Page_Bank Mega/a_Pembayaran MPN'))

WebUI.setText(findTestObject('Object Repository/Menu MPN/Page_Bank Mega/input_No. ID  Jenis ID  Jenis Pelaku_form-c_6c50d4'), 
    GlobalVariable.IDnsbh)

WebUI.sendKeys(findTestObject('Object Repository/Menu MPN/Page_Bank Mega/input_No. ID  Jenis ID  Jenis Pelaku_form-c_6c50d4'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

//WebUI.takeScreenshot('D:\\Workspace\\Capture\\MPN\\001. input ID nasabah.jpg')

WebUI.setText(findTestObject('Object Repository/Menu MPN/Page_Bank Mega/input_Nomor Billing  Jenis Pembayaran_noBill'), 
    GlobalVariable.BillExp)

//WebUI.takeScreenshot('D:\\Workspace\\Capture\\MPN\\002. input ID billing.jpg')

WebUI.sendKeys(findTestObject('Object Repository/Menu MPN/Page_Bank Mega/input_Nomor Billing  Jenis Pembayaran_noBill'), 
    Keys.chord(Keys.ENTER))

//WebUI.takeScreenshot('D:\\Workspace\\Capture\\MPN\\003. Notifikasi Gagal.jpg')

WebUI.verifyTextPresent('02 - Tagihan Sudah Kadaluarsa', false)

WebUI.click(findTestObject('Object Repository/Menu MPN/Page_Bank Mega/button_OK'))

WebUI.click(findTestObject('Object Repository/Menu MPN/Page_Bank Mega/button_'))
WebUI.click(findTestObject('Object Repository/Menu MPN/Page_Bank Mega/a_Reinquiry MPN'))

WebUI.setText(findTestObject('Object Repository/Menu MPN/Page_Bank Mega/input_Nomor Billing  Jenis Pembayaran_noBill'), 
    GlobalVariable.BillExp)
WebUI.sendKeys(findTestObject('Object Repository/Menu MPN/Page_Bank Mega/input_Nomor Billing  Jenis Pembayaran_noBill'), 
    Keys.chord(Keys.ENTER))
