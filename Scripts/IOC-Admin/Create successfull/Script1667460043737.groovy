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

WebUI.setText(findTestObject('IOC/Login/Page_B GIO DC O TO/input_Email ng nhp_usernameUserInput'), 'lcloi@moet.gov.vn')

WebUI.setEncryptedText(findTestObject('IOC/Login/Page_B GIO DC O TO/input_Mt khu_password'), 'B4YIrji58OXT8FVDlvO4Dg==')

WebUI.click(findTestObject('IOC/Login/Page_B GIO DC O TO/button_NG NHP'))

WebUI.click(findTestObject('Object Repository/IOC/Page_Trung tm qun l iu hnh/span_Qun tr ni dung'))

WebUI.click(findTestObject('Object Repository/IOC/Page_Trung tm qun l iu hnh/span_Qun l s kin'))

WebUI.click(findTestObject('Object Repository/IOC/Page_Trung tm qun l iu hnh/button_Thm mi'))

WebUI.setText(findTestObject('Object Repository/IOC/Page_Trung tm qun l iu hnh/input_Tn s kin_name'), 'Sự kiện khai trương')

WebUI.setText(findTestObject('Object Repository/IOC/Page_Trung tm qun l iu hnh/textarea_M t s kin_description'), 'sự kiện khai trương')

WebUI.click(findTestObject('Object Repository/IOC/Page_Trung tm qun l iu hnh/span_nbspNovember2022SuMoTuWeThFrSa30311234_5ec700'))

WebUI.click(findTestObject('Object Repository/IOC/Page_Trung tm qun l iu hnh/span_15'))

WebUI.click(findTestObject('Object Repository/IOC/Page_Trung tm qun l iu hnh/button_Lu'))

WebUI.verifyTextPresent('Thêm mới thành công', false)

WebUI.closeBrowser()

