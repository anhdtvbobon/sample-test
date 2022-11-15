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

WebUI.navigateToUrl('http://123.31.31.237:8000/')

WebUI.setText(findTestObject('Object Repository/1.QTND/1.2QLMN/Page_B GIO DC O TO/input_Email ng nhp_usernameUserInput'), 
    'lcloi@moet.gov.vn')

WebUI.setEncryptedText(findTestObject('Object Repository/1.QTND/1.2QLMN/Page_B GIO DC O TO/input_Mt khu_password'), 'B4YIrji58OXT8FVDlvO4Dg==')

WebUI.click(findTestObject('Object Repository/1.QTND/1.2QLMN/Page_B GIO DC O TO/button_NG NHP'))

WebUI.click(findTestObject('1.QTND/1.1 PQMN/mnuQTND'))

WebUI.click(findTestObject('1.QTND/1.4 QLHDSD/mnu_QLSD'))

WebUI.click(findTestObject('1.QTND/1.4 QLHDSD/btn_Xoa'))

WebUI.click(findTestObject('1.QTND/1.4 QLHDSD/btn_xac_nhan_xoa'))

WebUI.verifyTextPresent('Xóa thành công!', false)

