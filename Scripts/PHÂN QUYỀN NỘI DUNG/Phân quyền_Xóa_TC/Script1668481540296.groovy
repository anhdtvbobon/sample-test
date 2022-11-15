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

WebUI.setText(findTestObject('1.QTND/0. COMMOM/txtbEmail'), 'lcloi@moet.gov.vn')

WebUI.setEncryptedText(findTestObject('1.QTND/0. COMMOM/txtbPass'), 'B4YIrji58OXT8FVDlvO4Dg==')

WebUI.click(findTestObject('1.QTND/0. COMMOM/btnĐangnhap'))

WebUI.click(findTestObject('1.QTND/1.1 PQMN/mnuQTND'))

WebUI.click(findTestObject('1.QTND/1.1 PQMN/mnuPQM'))

WebUI.click(findTestObject('1.QTND/1.1 PQMN/btnPhanquyen'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.QTND/1.1 PQMN/btnXóa'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Bạn chắc chắn muốn xóa bản ghi đã chọn?', false)

WebUI.click(findTestObject('1.QTND/1.1 PQMN/btnXoa1'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Xóa thành công!', false)

WebUI.closeBrowser()

