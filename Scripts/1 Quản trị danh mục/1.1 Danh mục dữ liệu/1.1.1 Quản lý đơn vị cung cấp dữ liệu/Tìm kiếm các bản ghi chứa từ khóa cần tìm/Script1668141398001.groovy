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

WebUI.setText(findTestObject('Đăng nhập/txtUser'), 'lcloi@moet.gov.vn')

WebUI.setEncryptedText(findTestObject('Đăng nhập/txtPassWord'), 'B4YIrji58OXT8FVDlvO4Dg==')

WebUI.click(findTestObject('Đăng nhập/btnSubmit'))

WebUI.verifyTextNotPresent('Trang chủ', false)

WebUI.navigateToUrl('http://123.31.31.237:8005/main/categories/data-catalog/data-provider-management')

WebUI.setText(findTestObject('Quản lý đơn vị cung cấp dữ liệu/Find/txtSearch'), 'u')

WebUI.click(findTestObject('Quản lý đơn vị cung cấp dữ liệu/Find/btnSearch'))

//def text = WebUI.getText(findTestObject('Quản lý đơn vị cung cấp dữ liệu/Find/txtVerify'))
//WebUI.verifyMatch(text, '^u*', true, FailureHandling.STOP_ON_FAILURE)
def text = WebUI.getText(findTestObject('Quản lý đơn vị cung cấp dữ liệu/Find/txtVerify'))

if (text.contains('u')) {
    //your code here
}

