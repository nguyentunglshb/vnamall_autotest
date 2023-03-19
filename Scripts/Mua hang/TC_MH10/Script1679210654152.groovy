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

WebUI.click(findTestObject('Object Repository/Page_VNAMall - Trang ch/div_H Ni'))

WebUI.click(findTestObject('Object Repository/Page_Almira - B baby trng size trung/button_Mua ngay'))

WebUI.click(findTestObject('Object Repository/Page_Almira - B baby trng size trung/button_TIN HNH THANH TON'))

WebUI.setText(findTestObject('Object Repository/Page_Almira - B baby trng size trung/input_H_firstName'), '<style>@keyframes x{}</style><applet style="animation-name:x" onanimationstart="alert(1)"></applet>')

WebUI.setText(findTestObject('Object Repository/Page_Almira - B baby trng size trung/input_Tn_lastName'), 'nguyen')

WebUI.setText(findTestObject('Object Repository/Page_Almira - B baby trng size trung/input_Email_email'), 'n@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Almira - B baby trng size trung/input_S in thoi_phone'), '0987776543')

WebUI.setText(findTestObject('Object Repository/Page_Almira - B baby trng size trung/input_a ch c th_address'), 'a')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Almira - B baby trng size trung/select_TnhThnh phThnh ph H NiThnh ph H Ch M_3fcb21'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Almira - B baby trng size trung/select_QunHuynQun Ba nhQun Hon KimQun Ty HQ_894b89'), 
    '1008', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Almira - B baby trng size trung/select_PhngXPhng Thanh TrPhng Hong LitPhng _702cce'), 
    '100800325', true)

WebUI.click(findTestObject('Object Repository/Page_Almira - B baby trng size trung/button_Tin hnh n phng thc thanh ton'))

WebUI.closeBrowser()

