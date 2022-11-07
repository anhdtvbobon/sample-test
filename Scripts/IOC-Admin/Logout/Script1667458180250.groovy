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

WebUI.navigateToUrl('https://dangnhap.moet.gov.vn/authenticationendpoint/login.do?client_id=DNoW4q482RZfMLfzbDfKwN_Nm1sa&commonAuthCallerPath=%2Foauth2%2Fauthorize&forceAuth=false&passiveAuth=false&redirect_uri=http%3A%2F%2F123.31.31.237%3A8000%2F&response_type=code&scope=openid&tenantDomain=carbon.super&sessionDataKey=a9517d20-9cfd-4e01-8135-ff6b2a375102&relyingParty=DNoW4q482RZfMLfzbDfKwN_Nm1sa&type=oidc&sp=Test-SSO&isSaaSApp=false&authenticators=BasicAuthenticator%3ALOCAL')

WebUI.setText(findTestObject('Page_B GIO DC O TO/input_Email ng nhp_usernameUserInput'), 'lcloi@moet.gov.vn')

WebUI.setEncryptedText(findTestObject('Page_B GIO DC O TO/input_Mt khu_password'), 'B4YIrji58OXT8FVDlvO4Dg==')

WebUI.click(findTestObject('Page_B GIO DC O TO/button_NG NHP'))

WebUI.click(findTestObject('Object Repository/IOC/Logout/span_l'))

WebUI.click(findTestObject('Object Repository/IOC/Logout/a_ng xut'))

WebUI.closeBrowser()

