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

not_run: WebUI.callTestCase(findTestCase('NavigateURLR2018x'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('LoginToPod'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('DashboardFunctions/CreateNewDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('CompassFunctions/SmallCompassWest'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(30, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/div_compass-search-button font'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/input_compass-search-text form'), 
    'city Discover', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/div_settings-img fonticon font'), 
    30, FailureHandling.OPTIONAL)

not_run: WebUI.callTestCase(findTestCase('CompassFunctions/SearchAppInCompass'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/div_settings-img fonticon font'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/span_DS - DSQAL038 euw1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/Page_CityReferentialWidget/div_wp-tabview-panel'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(30, FailureHandling.OPTIONAL)

WebUI.waitForElementVisible(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/div_Success'), 30, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.dragAndDropToObject(findTestObject('Techno_3Dcity_DDCityReferential/Page_CityDiscoverWidget/li_City Discover'), findTestObject(
        'Techno_3Dcity_DDCityReferential/Page_Test JCN9 auto/div_wp-tabview-panel'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/span_fonticon fonticon-resize-'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(30, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Logout'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()

