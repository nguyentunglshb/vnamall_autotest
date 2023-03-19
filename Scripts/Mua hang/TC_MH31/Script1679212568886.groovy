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

WebUI.click(findTestObject('Object Repository/Page_VNAMall - Trang ch/img_Next_card-img-top'))

WebUI.click(findTestObject('Object Repository/Page_Gi hoa 82X_Lovely/button_Mua ngay'))

WebUI.click(findTestObject('Object Repository/Page_Gi hoa 82X_Lovely/button_TIN HNH THANH TON'))

WebUI.setText(findTestObject('Object Repository/Page_Gi hoa 82X_Lovely/input_H_firstName'), 'tung')

WebUI.setText(findTestObject('Object Repository/Page_Gi hoa 82X_Lovely/input_Tn_lastName'), 'nguyen')

WebUI.setText(findTestObject('Object Repository/Page_Gi hoa 82X_Lovely/input_Email_email'), 'n@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Gi hoa 82X_Lovely/input_a ch c th_address'), 'ko')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Gi hoa 82X_Lovely/select_TnhThnh phThnh ph H NiThnh ph H Ch M_3fcb21'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Gi hoa 82X_Lovely/select_QunHuynQun Ba nhQun Hon KimQun Ty HQ_894b89'), 
    '1016', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Gi hoa 82X_Lovely/select_PhngXTh trn Sc SnX Tin DcX Vit LongX_e61fe6'), 
    '101600382', true)

WebUI.click(findTestObject('Object Repository/Page_Gi hoa 82X_Lovely/button_Tin hnh n phng thc thanh ton'))

WebUI.closeBrowser()

