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

WebUI.navigateToUrl('https://vnamall.vietnamairlines.com/')

WebUI.click(findTestObject('Object Repository/Page_VNAMall - Trang ch/div_H NiSCARLET (SWEET BOX) - BOX HOA MIX2._415b20'))

WebUI.click(findTestObject('Object Repository/Page_VNAMall - Trang ch/img_Next_card-img-top'))

WebUI.click(findTestObject('Object Repository/Page_Scarlet (sweet box) - box hoa mix/button_'))

WebUI.click(findTestObject('Object Repository/Page_Scarlet (sweet box) - box hoa mix/button_Mua ngay'))

WebUI.click(findTestObject('Object Repository/Page_Scarlet (sweet box) - box hoa mix/button_TIN HNH THANH TON'))

WebUI.click(findTestObject('Object Repository/Page_Scarlet (sweet box) - box hoa mix/button_Tin hnh n phng thc thanh ton'))

WebUI.click(findTestObject('Object Repository/Page_Scarlet (sweet box) - box hoa mix/div_TIP TC'))

WebUI.click(findTestObject('Object Repository/Page_Scarlet (sweet box) - box hoa mix/div_TIP TC'))

WebUI.click(findTestObject('Object Repository/Page_Scarlet (sweet box) - box hoa mix/img'))

WebUI.closeBrowser()

