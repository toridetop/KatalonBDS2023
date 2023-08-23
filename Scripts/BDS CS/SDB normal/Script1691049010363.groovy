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
import org.openqa.selenium.Keys
import org.openqa.selenium.remote.server.handler.FindElement as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://10.14.20.41:8443/newbds/login.zul')

WebUI.setText(findTestObject('Object Repository/BDS SDB/Page_Login/input_Branch Delivery System_h89Pc'), 'uatstaff4')

WebUI.setEncryptedText(findTestObject('Object Repository/BDS SDB/Page_Login/input_Branch Delivery System_h89Pe'), 'Ww1FHTu5BdwN8otar1e5ZA==')

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_Login/span_Masuk'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/Page_/i_Laporan Print_z-icon-save'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/span_Safe Deposit'))

WebUI.click(FindElement)

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/img_Cari_eBCP5k4'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/span_Pilih Penyewa'))

WebUI.setText(findTestObject('Object Repository/BDS SDB/Page_/input_Nomor Rekening_dCDPt6'), '010740016003196')

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/span_Cari'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/div_FRAENDLY TITIS HOCCOP'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/span_Tambah'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/i_Periode_z-combobox-icon z-icon-caret-down'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/li_Tahunan'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/i_Perpanjangan_z-combobox-icon z-icon-caret-down'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/li_AutoRollOver(ARO)'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/input_Sumber Dana__pgiku7p6'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/i_Debet Rekening_z-combobox-icon z-icon-caret-down'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/span_010740016003196'))

WebUI.setText(findTestObject('Object Repository/BDS SDB/Page_/textarea_Catatan_dCDPg5'), 'test')

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/span_Print Formulir'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/i_E-Form_z-icon-times'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/span_Pilih Otorisasi'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/span_Override'))

WebUI.setText(findTestObject('Object Repository/BDS SDB/Page_/input_User ID_dCDPrb'), 'uatspv1')

WebUI.setEncryptedText(findTestObject('Object Repository/BDS SDB/Page_/input_Password_dCDPzb'), 'Ww1FHTu5BdwqkL8Mqo5cqg==')

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/button_Approve'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/button_OK_1'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/span_Pesan'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/button_Yes'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/input_Pernyataan Ketentuan Produk_dCDPac-real'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/button_Lanjut'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/button_OK_1_2'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/button_OK_1_2_3'))

WebUI.setText(findTestObject('Object Repository/BDS SDB/Page_/input_No Rekening_nGuP30'), '010740016003196')

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/div_Cari_1'))

WebUI.click(findTestObject('Object Repository/BDS SDB/Page_/div_KC JKT TENDEAN'))

