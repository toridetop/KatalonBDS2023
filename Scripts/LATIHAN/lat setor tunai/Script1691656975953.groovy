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

WebUI.navigateToUrl('http://10.14.20.156:3000/bankmega/cabang')

WebUI.setText(findTestObject('Object Repository/latihan setor tunai/Page_Bank Mega/input_Nama Akun_sign-user'), 'uatstaff5')

WebUI.setEncryptedText(findTestObject('Object Repository/latihan setor tunai/Page_Bank Mega/input_Kata Sandi_sign-pass'), 
    'Ww1FHTu5Bdxt+kp6glzPzQ==')

WebUI.click(findTestObject('Object Repository/latihan setor tunai/Page_Bank Mega/button_Masuk'))

WebUI.click(findTestObject('Object Repository/latihan setor tunai/Page_Bank Mega/button_'))

WebUI.click(findTestObject('Object Repository/latihan setor tunai/Page_Bank Mega/a_Setor Tunai'))

WebUI.click(findTestObject('Object Repository/latihan setor tunai/Page_Bank Mega/Page_Bank Mega/input_Nomor Rekening Escrow  Jenis Rekening  CIF_form-control form-control-sm'))

WebUI.setText(findTestObject('Object Repository/latihan setor tunai/Page_Bank Mega/Page_Bank Mega/input_Nomor Rekening Escrow  Jenis Rekening  CIF_form-control form-control-sm'), 
    '10740020548423')

WebUI.sendKeys(findTestObject('Object Repository/latihan setor tunai/Page_Bank Mega/Page_Bank Mega/input_Nomor Rekening Escrow  Jenis Rekening  CIF_form-control form-control-sm'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/latihan setor tunai/Page_Bank Mega/input_No. ID  Jenis ID  Jenis Pelaku_form-c_6c50d4'), 
    '8171041410912221')

WebUI.sendKeys(findTestObject('Object Repository/latihan setor tunai/Page_Bank Mega/input_No. ID  Jenis ID  Jenis Pelaku_form-c_6c50d4'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/latihan setor tunai/Page_Bank Mega/Page_Bank Mega/Page_Bank Mega/input_Nominal yang disetor_form-control form-control-sm'), 
    '13,000.00')

WebUI.setText(findTestObject('Object Repository/latihan setor tunai/Page_Bank Mega/textarea_Remarks_form-control form-control-sm'), 
    'test setor tunai')

WebUI.click(findTestObject('Object Repository/latihan setor tunai/Page_Bank Mega/button_Submit                    Transaksi'))

WebUI.click(findTestObject('Object Repository/latihan setor tunai/Page_Bank Mega/button_Close'))

WebUI.click(findTestObject('Object Repository/latihan setor tunai/Page_Bank Mega/button_Otorisasi Transaksi'))

WebUI.click(findTestObject('Object Repository/latihan setor tunai/Page_Bank Mega/a_Signature'))

WebUI.click(findTestObject('Object Repository/latihan setor tunai/Page_Bank Mega/button_Print Slip Konfirmasi Transaksi sebe_e63c1d'))

WebUI.click(findTestObject('Object Repository/latihan setor tunai/Page_Bank Mega/button_Print'))

WebUI.click(findTestObject('Object Repository/latihan setor tunai/Page_Bank Mega/button_Signature OK, Approve'))
WebUI.delay(7)
WebUI.click(findTestObject('Object Repository/latihan setor tunai/Page_Bank Mega/button_Submit                    Transaksi'))


WebUI.click(findTestObject('Object Repository/latihan setor tunai/Page_Bank Mega/button_Selesai'))

