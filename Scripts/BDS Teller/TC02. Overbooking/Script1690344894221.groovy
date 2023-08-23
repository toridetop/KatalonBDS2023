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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl(GlobalVariable.linkBDS)
//
//WebUI.setText(findTestObject('Object Repository/Page_Bank Mega/input_Nama Akun_sign-user'), GlobalVariable.userstaff)
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Bank Mega/input_Kata Sandi_sign-pass'), GlobalVariable.passstaff)
//
////WebUI.takeScreenshot('D:\\Workspace\\Capture\\TC02\\001. Homepage Login.jpg')
//
//WebUI.click(findTestObject('Object Repository/Page_Bank Mega/button_Masuk'))
//WebUI.takeScreenshot('D:\\Workspace\\Capture\\TC02\\002. Success Login.jpg')
WebUI.click(findTestObject('Object Repository/Page_Bank Mega/button_'))

WebUI.click(findTestObject('Object Repository/Page_Bank Mega/a_Pindah Buku  Overbooking'))

WebUI.delay(1)

//WebUI.takeScreenshot('D:\\Workspace\\Capture\\TC02\\003. Menu Overbooking.jpg')
WebUI.setText(findTestObject('Page_Bank Mega/input_No. ID nasabah'), '8171041410912221')

WebUI.sendKeys(findTestObject('Page_Bank Mega/input_No. ID nasabah'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Bank Mega/input_Nomor Rekening Sumber'), '10350020774469')

WebUI.sendKeys(findTestObject('Object Repository/Page_Bank Mega/input_Nomor Rekening Sumber'), Keys.chord(Keys.TAB))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Bank Mega/input_Nomor Rekening Tujuan'), '10740020548423')

WebUI.sendKeys(findTestObject('Object Repository/Page_Bank Mega/input_Nomor Rekening Tujuan'), Keys.chord(Keys.TAB))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Bank Mega/input_Nominal transaksi'), '3,000.00')

WebUI.sendKeys(findTestObject('Object Repository/Page_Bank Mega/input_Nominal transaksi'), Keys.chord(Keys.TAB))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Bank Mega/input_Remarks'), 'test')

//WebUI.takeScreenshot('D:\\Workspace\\Capture\\TC02\\004. Detail Transaksi.jpg')
WebUI.click(findTestObject('Object Repository/Page_Bank Mega/button_Submit                    Transaksi'))

//WebUI.takeScreenshot('D:\\Workspace\\Capture\\TC02\\005. Pop Up Otorisasi.jpg')
WebUI.click(findTestObject('Object Repository/Page_Bank Mega/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Bank Mega/button_Otorisasi Transaksi'))

//WebUI.takeScreenshot('D:\\Workspace\\Capture\\TC02\\006. Pilih otorisasi Signature.jpg')
WebUI.click(findTestObject('Object Repository/Page_Bank Mega/a_Signature'))

WebUI.click(findTestObject('Object Repository/Page_Bank Mega/button_Print Slip Konfirmasi Transaksi sebe_e63c1d'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Bank Mega/Page_Bank Mega/button_Print2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)


int printIndex1 = WebUI.getWindowIndex()

WebUI.switchToWindowIndex(printIndex1, FailureHandling.OPTIONAL)

Robot robot = new Robot()
robot.keyPress(KeyEvent.VK_ESCAPE)
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Bank Mega/button_Signature OK, Approve'))
WebUI.click(findTestObject('Object Repository/Page_Bank Mega/button_Submit                    Transaksi'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Page_Bank Mega/button_Selesai'))




