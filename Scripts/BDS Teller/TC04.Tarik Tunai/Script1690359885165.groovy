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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.linkBDS)

WebUI.setText(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/input_Nama Akun_sign-user'), GlobalVariable.userstaff)

WebUI.setEncryptedText(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/input_Kata Sandi_sign-pass'), GlobalVariable.passstaff)

WebUI.click(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/button_'))

WebUI.click(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/a_Tarik Tunai'))

WebUI.setText(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/input_No. ID  Jenis ID  Jenis Pelaku_form-c_6c50d4'), 
    '8171041410912221')

WebUI.sendKeys(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/input_No. ID  Jenis ID  Jenis Pelaku_form-c_6c50d4'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/input no rekening'), '10350020774469')

WebUI.sendKeys(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/input no rekening'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/input_Nominal Tunai yang ditarik_amount_2'), 
    '5,000.00')

WebUI.sendKeys(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/input_Nominal Tunai yang ditarik_amount_2'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/textarea_Remarks_form-control form-control-sm'), 
    'test tarik tunai')

WebUI.click(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/button_Submit                    Transaksi'))

WebUI.click(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/button_Close'))

WebUI.click(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/button_Otorisasi Transaksi'))

WebUI.click(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/a_Signature'))

WebUI.click(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/button_Print Slip Konfirmasi Transaksi sebe_e63c1d'))

WebUI.click(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/button_Print'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/button_Signature OK, Approve'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/button_Submit                    Transaksi'))

WebUI.click(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/button_Selesai'))

WebUI.click(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/button_uatstaff1'))

WebUI.click(findTestObject('Object Repository/Menu_Tarik_Tunai/Page_Bank Mega/button_Sign Out'))

WebUI.closeBrowser()

