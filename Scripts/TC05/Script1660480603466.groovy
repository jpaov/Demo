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

WebUI.openBrowser(GlobalVariable.Demo)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('Delay Control'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('MENU Bar/Tools/Menu Button/Menu'))

WebUI.enhancedClick(findTestObject('MENU Bar/Tools/Tabs/tab_Payees'))

WebUI.callTestCase(findTestCase('Delay Control'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('MENU Bar/Tools/Tabs/Payees/linktexts/linktext_Pay'))

WebUI.enhancedClick(findTestObject('MENU Bar/Tools/Tabs/Payees/From/Buttons/button_From'))

WebUI.setText(findTestObject('MENU Bar/Tools/Tabs/Payees/From/Textfields/textfield_SearchFrom'), 'Everyday')

WebUI.enhancedClick(findTestObject('MENU Bar/Tools/Tabs/Payees/From/Lists/List_Everyday'))

WebUI.callTestCase(findTestCase('Delay Control'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('MENU Bar/Tools/Tabs/Payees/To/Buttons/button_To'))

WebUI.setText(findTestObject('MENU Bar/Tools/Tabs/Payees/To/Textfields/textfield_SearchTo'), 'Bill')

WebUI.enhancedClick(findTestObject('MENU Bar/Tools/Tabs/Payees/To/Lists/List_Bills'))

WebUI.setText(findTestObject('MENU Bar/Tools/Tabs/Payees/Textfields/textfield_Amount'), '500')

WebUI.callTestCase(findTestCase('Delay Control'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('MENU Bar/Tools/Tabs/Payees/Buttons/button_Transfer'))

WebUI.navigateToUrl('https://www.demo.bnz.co.nz/client/')

String Everyday = WebUI.getAttribute(findTestObject('MENU Bar/Tools/Balances/Everyday_Balance'), 'textContent')

WebUI.callTestCase(findTestCase('Delay Control'), [:], FailureHandling.STOP_ON_FAILURE)

assert Everyday.contains('2,000.00')

WebUI.callTestCase(findTestCase('Delay Control'), [:], FailureHandling.STOP_ON_FAILURE)

String Bills = WebUI.getAttribute(findTestObject('MENU Bar/Tools/Balances/Bills_Balance'), 'textContent')

WebUI.callTestCase(findTestCase('Delay Control'), [:], FailureHandling.STOP_ON_FAILURE)

assert Bills.contains('920.00')

WebUI.callTestCase(findTestCase('Delay Control'), [:], FailureHandling.STOP_ON_FAILURE)

