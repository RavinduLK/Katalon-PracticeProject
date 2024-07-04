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

WebUI.navigateToUrl('https://lms.uom.lk/login_index.php')

WebUI.setText(findTestObject('Page_LearnOrg 3.0/input_Username_LearnOrgUsername'), 'karunaweerarl.20')

WebUI.setEncryptedText(findTestObject('Page_LearnOrg 3.0/input_Password_LearnOrgPassword'), 'K5oySGqbkPnTsDMFkgwHNg==')

WebUI.click(findTestObject('Page_LearnOrg 3.0/input_Password_LearnOrgLogin'))

WebUI.navigateToUrl('https://lms.uom.lk/mis_exam/reports/view_my_results.php')

WebUI.delay(2)

WebUI.closeBrowser()

