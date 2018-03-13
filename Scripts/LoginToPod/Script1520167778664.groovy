import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Open Browser'
not_run: WebUI.openBrowser('')

'Enter POD URL in the browser'
not_run: WebUI.navigateToUrl('https://euw1-20swi10301-iam.3dx-staging.3ds.com/cas/login?serverId=FRONT_0&service=https%3A//euw1-20swi10301-ifwe.3dx-staging.3ds.com/')

'Maximize the browser window'
not_run: WebUI.maximizeWindow()

not_run: WebUI.callTestCase(findTestCase('NavigateURLR2018x'), [:], FailureHandling.STOP_ON_FAILURE)

'Enter user name'
WebUI.setText(findTestObject('LoginToPod/Page_3DPassport - Login/input_username'), 'Technoqa')

'Enter password'
WebUI.setText(findTestObject('LoginToPod/Page_3DPassport - Login/input_password'), 'Techno2016#')

WebUI.verifyElementVisible(findTestObject('LoginToPod/Page_3DPassport - Login/input_uwa-submit uwa-submit-ro'))

'Click on submit button'
WebUI.click(findTestObject('LoginToPod/Page_3DPassport - Login/input_uwa-submit uwa-submit-ro'))

WebUI.verifyElementVisible(findTestObject('LoginToPod/Page_3DPassport - Login/span_3DEXPERIENCE'), FailureHandling.STOP_ON_FAILURE)
