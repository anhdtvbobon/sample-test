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

WebUI.navigateToUrl('http://123.31.31.237:8005/')

WebUI.setText(findTestObject('Object Repository/Input/input_Email ng nhp_usernameUserInput'), 'lcloi@moet.gov.vn')

WebUI.setEncryptedText(findTestObject('Object Repository/Input/input_Mt khu_password'), 'B4YIrji58OXT8FVDlvO4Dg==')

WebUI.click(findTestObject('Object Repository/button_NG NHP'))

WebUI.click(findTestObject('Object Repository/span_Qun tr danh mc'))

WebUI.click(findTestObject('Object Repository/span_Danh mc d liu'))

WebUI.click(findTestObject('Object Repository/span_Qun l n v cung cp d liu'))

WebUI.click(findTestObject('input_Tn n v_name'))

WebUI.setText(findTestObject('input_Tn n v_name'), 'tình bạn diệu kỳ tình bạn diệu kỳtình bạn diệu kỳtình bạn diệu kỳtình bạn diệu kỳtình bạn diệu kỳtình bạn diệu kỳtình bạn diệu kỳtình bạn diệu kỳtình bạn diệu kỳtình bạn diệu kỳtình bạn diệu kỳtình bạn diệu kỳtình bạn diệu kỳtình bạn diệu kỳtình bạn diệu kỳtình bạn diệu kỳ')

WebUI.verifyTextPresent('Tên đơn vị không được vượt quá 50 ký tự', false)

WebUI.closeBrowser()

