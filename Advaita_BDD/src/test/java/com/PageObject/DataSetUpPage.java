package com.PageObject;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.StepDefinition.Baseclass;
import com.Utilities.Pegination;

public class DataSetUpPage extends Baseclass {

	static WebDriver driver;
	Pegination peginate;

	public DataSetUpPage(WebDriver Driver) {
		driver = Driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='justify_icon']")
	public WebElement sideBar;

	@FindBy(xpath = "//span[normalize-space()='Data Setup']")
	public static WebElement DataSetUpButton;

	@FindBy(id = "pills-Process-tab")
	public static WebElement processTab;

	@FindBy(id = "pills-dataset-tab")
	public static WebElement dataSetTab;

	@FindBy(id = "pills-metadata-tab")
	public static WebElement metadataTab;

	@FindBy(id = "pills-dataupload-tab")
	public static WebElement datauploadTab;

	@FindBy(id = "text_search")
	public static WebElement searchBar;

	@FindBy(id = "status_search")
	public static WebElement statusDropDown;

	@FindBy(xpath = "(//img[@alt='filter_search'])[1]")
	public static WebElement searchButton;

	@FindBy(xpath = "//h6[text()='Clear All Filters']")
	public static WebElement clearButton;

	@FindBy(xpath = "//table[@class='process_table w-100']/tbody/tr[1]/td[1]//span")
	public static WebElement totalNoOfRecords;

	@FindBy(id = "create_process")
	public static WebElement createProcessButton;

	@FindBy(xpath = "(//a[normalize-space()='+ Create'])[1]")
	public static WebElement createDataSetButton;

	@FindBy(xpath = "//div[@class='modal-dialog modal-md']//div[@class='modal-content']")
	public static WebElement addProcessPupup;

	@FindBy(xpath = "//div[@class='modal-dialog modal-lg detail_form']//div[@class='modal-content']")
	public static WebElement createDataSetPupup;

	@FindBy(id = "process_name")
	public static WebElement processNameField;

	@FindBy(id = "process_desc")
	public static WebElement processDescField;

	@FindBy(id = "process_status")
	public static WebElement processStatusDropDown;

	@FindBy(id = "save_and_continnue")
	public static WebElement saveandContinueButton;

	@FindBy(xpath = "//div[@id='pills-popupprocess']//button[@value='save'][normalize-space()='Save']")
	public static WebElement saveButton;

	@FindBy(id = "sub_process")
	public static WebElement subProcessTab;

	@FindBy(id = "process_dropdown")
	public static WebElement selectProcessDropDown;

	@FindBy(id = "sub_process_name")
	public static WebElement subProcessField;

	@FindBy(id = "sub_process_desc")
	public static WebElement subProcessDescField;

	@FindBy(id = "sub_process_status")
	public static WebElement subProcessStatusDropDown;

	@FindBy(xpath = "(//button[@value='save_and_continnue'][normalize-space()='Save and Continue'])[2]")
	public static WebElement saveandContinnueButtonInSubProcess;

	@FindBy(xpath = "//div[@id='pills-popupsubprocess']//button[@value='save'][normalize-space()='Save']")
	public static WebElement saveButtonInSubProcess;

	@FindBy(id = "s_sub_process")
	public static WebElement subSubProcessTab;

	@FindBy(id = "sub_process_dropdown")
	public static WebElement selectSubProcessDropDown;

	@FindBy(id = "s_sub_process_name")
	public static WebElement subSubProcessNameField;

	@FindBy(id = "s_sub_process_desc")
	public static WebElement subSubProcessDescField;

	@FindBy(id = "s_sub_process_status")
	public static WebElement subSubProcessStatusDropDown;

	@FindBy(xpath = "//button[normalize-space()='Save And Update']")
	public static WebElement save_UpdateButtonInSubProcess;

	@FindBy(xpath = "//span[@id='change_msg'][text()='Process has been created']")
	public static WebElement createSuceessMassgage;

	@FindBy(xpath = "(//button[normalize-space()='Continue'])[1]")
	public static WebElement continueButton;

	@FindBy(xpath = "//table[@class='process_table w-100']/tbody/tr[1]/td[1]//img[@alt='table_drop_down']")
	public static WebElement dropDown1;

	@FindBy(xpath = "//table[@class='process_table w-100']/tbody/tr[2]/td[1]//img[@alt='table_drop_down']")
	public static WebElement dropDown2;

	@FindBy(xpath = "(//img[@alt='table-edit'])[1]")
	public static WebElement editOption1;

	@FindBy(xpath = "(//img[@alt='table-edit'])[2]")
	public static WebElement editOption2;

	@FindBy(xpath = "(//img[@alt='table-edit'])[3]")
	public static WebElement editOption3;

	@FindBy(xpath = "//span[@id='change_msg'][text()='Process has been updated']")
	public static WebElement updateProcessSuceessMassgage;

	@FindBy(xpath = "//span[@id='change_msg'][text()='Sub Process has been updated']")
	public static WebElement updateSubProcessSuceessMassgage;

	@FindBy(xpath = "//span[@id='change_msg'][text()='Sub Sub Process has been updated']")
	public static WebElement updateSubSubProcessSuceessMassgage;

	@FindBy(xpath = "//table[@class='process_table w-100']/tbody/tr[1]/td[1]//span")
	public static WebElement fetchCreatedRecord;

	@FindBy(id = "dataset_name")
	public static WebElement dataSetNameField;

	@FindBy(id = "process")
	public static WebElement processDropDown;

	@FindBy(id = "sub_process")
	public static WebElement subProcessDropDown;

	@FindBy(id = "s_sub_process")
	public static WebElement subSubProcessDropDown;

	@FindBy(xpath = "//input[@name='form-0-dataset_fieldname']")
	public static WebElement fieldNameField;

	@FindBy(xpath = "//input[@id='id_form-0-ds_field_label']")
	public static WebElement labelField;

	@FindBy(id = "id_form-0-ds_field_type")
	public static WebElement typeDropDown;

	@FindBy(id = "id_form-0-ds_field_value")
	public static WebElement maxLengthField;

	@FindBy(id = "id_form-0-ds_is_mandatory")
	public static WebElement mandetoryDropDown;

	@FindBy(xpath = "(//a[normalize-space()='+ Add Row'])[1]")
	public static WebElement addRowButton;

	@FindBy(xpath = "//input[@name='form-1-dataset_fieldname']")
	public static WebElement fieldNameField1;

	@FindBy(xpath = "//input[@id='id_form-1-ds_field_label']")
	public static WebElement labelField1;

	@FindBy(id = "id_form-1-ds_field_type")
	public static WebElement typeDropDown1;

	@FindBy(id = "id_form-1-ds_field_value")
	public static WebElement maxLengthField1;

	@FindBy(id = "id_form-1-ds_is_mandatory")
	public static WebElement mandetoryDropDown1;

	// ########################################

	@FindBy(xpath = "//input[@name='form-2-dataset_fieldname']")
	public static WebElement fieldNameField2;

	@FindBy(xpath = "//input[@id='id_form-2-ds_field_label']")
	public static WebElement labelField2;

	@FindBy(id = "id_form-2-ds_field_type")
	public static WebElement typeDropDown2;

	@FindBy(id = "id_form-2-ds_field_value")
	public static WebElement maxLengthField2;

	@FindBy(id = "id_form-2-ds_is_mandatory")
	public static WebElement mandetoryDropDown2;

	@FindBy(xpath = "(//img[@alt='delete-icon'])[4]")
	public static WebElement deleteButton;

	@FindBy(id = "create_btn")
	public static WebElement dataSetCreateButton;

//	public static String beforTotalrecord = driver.findElement(By.xpath("//span[@class='d-block text_default font_12']")).getText();

	public static void beforeTotal() {
		
	 String beforTotalrecord = driver.findElement(By.xpath("//span[@class='d-block text_default font_12']")).getText();
	 
	 System.out.println(beforTotalrecord);
	}
	
	public void clickOnDataSetUp() {

		DataSetUpButton.isDisplayed();
		DataSetUpButton.click();

	}

	public void tabsIsDisplayed() {
		processTab.isDisplayed();
		dataSetTab.isDisplayed();
		metadataTab.isDisplayed();
		datauploadTab.isDisplayed();
	}

	public void clickOnCreate() {
		createProcessButton.isDisplayed();
		createProcessButton.click();
	}

	public void addProcessPupupIsDisplaye() {
		addProcessPupup.isDisplayed();
	}

	public void enterProcessNameField(String processName) {
		processNameField.isDisplayed();
		processNameField.click();
		processNameField.isSelected();
		processNameField.sendKeys(processName);
	}

	public void enterProcessDescField(String processDesc) {
		processDescField.isDisplayed();
		processDescField.click();
		processDescField.isSelected();
		processDescField.sendKeys(processDesc);
	}

	public void selectStatusInProcessTab() {
		processStatusDropDown.isDisplayed();
		Select select = new Select(processStatusDropDown);
		select.selectByVisibleText("Active");
	}

	public void clickOnSaveandContinue() {
		saveandContinueButton.isDisplayed();
		saveandContinueButton.click();
	}

	public void subProcessTabIsDisplayed() {
		subProcessTab.isDisplayed();
	}

	public void selectProcess(String visibleText) {
		Select select = new Select(selectProcessDropDown);
		select.selectByVisibleText(visibleText);
	}

	public void enterSubProcessNameField(String subProcessName) {
		subProcessField.isDisplayed();
		subProcessField.click();
		subProcessField.isSelected();
		subProcessField.sendKeys(subProcessName);
	}

	public void enterSubProcessDescField(String subProcessDesc) {
		subProcessDescField.isDisplayed();
		subProcessDescField.click();
		subProcessDescField.isSelected();
		subProcessDescField.sendKeys(subProcessDesc);
	}

	public void selectStatusInSubProcessTab() {
		subProcessStatusDropDown.isDisplayed();
		Select select = new Select(subProcessStatusDropDown);
		select.selectByVisibleText("Active");
	}

	public void clickOnSaveandContinueInSubProcess() {
		saveandContinnueButtonInSubProcess.isDisplayed();
		saveandContinnueButtonInSubProcess.click();
	}

	public void subSubProcessTabIsDisplayed() {
		subSubProcessTab.isDisplayed();
	}

	public void selectSubProcess(String subVisibleText) {
		Select select = new Select(selectSubProcessDropDown);
		select.selectByVisibleText(subVisibleText);
	}

	public void enterSubSubProcessNameField(String subProcessName) {
		subSubProcessNameField.isDisplayed();
		subSubProcessNameField.click();
		subSubProcessNameField.isSelected();
		subSubProcessNameField.sendKeys(subProcessName);
	}

	public void enterSubSubProcessDescField(String subProcessDesc) {
		subSubProcessDescField.isDisplayed();
		subSubProcessDescField.click();
		subSubProcessDescField.isSelected();
		subSubProcessDescField.sendKeys(subProcessDesc);
	}

	public void selectStatusInSubSubProcessTab() {
		subSubProcessStatusDropDown.isDisplayed();
		Select select = new Select(subSubProcessStatusDropDown);
		select.selectByVisibleText("Active");
	}

	public void clickOnSaveandUpdateInSubProcess() {
		save_UpdateButtonInSubProcess.isDisplayed();
		save_UpdateButtonInSubProcess.click();
	}

	public void successPupUpIsDisplayed() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertTrue(createSuceessMassgage.isDisplayed(), "It is Not Displayed");
		continueButton.click();

	}

	public void collapseDropDowns() throws Throwable {

		driver.navigate().refresh();
		Thread.sleep(2000);

		dropDown1.isDisplayed();
		dropDown1.click();
		Thread.sleep(1000);
		dropDown2.isDisplayed();
		dropDown2.click();
		Thread.sleep(1000);

	}

	public void editCreatedProcess(String editProcessDesc, String editSubProcessDesc, String editSubSubProcessDesc)
			throws Throwable {

		editOption1.click();
		processDescField.clear();
		processDescField.sendKeys(editProcessDesc);
		saveButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(updateProcessSuceessMassgage.isDisplayed(), "It is Not Displayed");
		continueButton.click();

		dropDown1.isDisplayed();
		dropDown1.click();
		Thread.sleep(1000);
		dropDown2.isDisplayed();
		dropDown2.click();
		Thread.sleep(1000);

		editOption2.click();
		subProcessDescField.clear();
		subProcessDescField.sendKeys(editSubProcessDesc);
		saveButtonInSubProcess.click();
		Thread.sleep(3000);
		Assert.assertTrue(updateSubProcessSuceessMassgage.isDisplayed(), "It is Not Displayed");
		continueButton.click();

		dropDown1.isDisplayed();
		dropDown1.click();
		Thread.sleep(1000);
		dropDown2.isDisplayed();
		dropDown2.click();
		Thread.sleep(1000);

		editOption3.click();
		subSubProcessDescField.clear();
		subSubProcessDescField.sendKeys(editSubProcessDesc);
		save_UpdateButtonInSubProcess.click();
		Thread.sleep(2000);
		Assert.assertTrue(updateSubSubProcessSuceessMassgage.isDisplayed(), "It is Not Displayed");
		continueButton.click();

	}

	public void searchCreatedRecord() throws Throwable {

		String searchText = fetchCreatedRecord.getText();

		searchBar.clear();
		searchBar.sendKeys(searchText);
		searchButton.click();
		Thread.sleep(2000);
		clearButton.click();

	}

	public void paginateTheTablePage(int pageNumber) throws Exception {

		js = (JavascriptExecutor) driver;

		// Click a specific page by its number
		WebElement pageLink = driver.findElement(By.cssSelector(
				".pagination_nav .pagination .page-item:not(.disabled) a[href*='?page=" + pageNumber + "']"));
		js.executeScript("arguments[0].scrollIntoView(true);", pageLink);
		js.executeScript("arguments[0].click();", pageLink);

		for (int i = 1; i <= 6; i++) {
			WebElement nextPageLink = driver
					.findElement(By.cssSelector(".pagination_nav .pagination .page-item:last-child a"));
			js.executeScript("arguments[0].scrollIntoView(true);", nextPageLink);
			js.executeScript("arguments[0].click();", nextPageLink);

		}

		for (int j = 1; j <= 5; j++) {
			// Click the previous page link
			WebElement previousPageLink = driver
					.findElement(By.cssSelector(".pagination_nav .pagination .page-item:first-child a"));
			js.executeScript("arguments[0].scrollIntoView(true);", previousPageLink);
			js.executeScript("arguments[0].click();", previousPageLink);
		}

	}

	public static String extractNumericPart(String beforeTotal) {
		// Define the regex pattern to match digits
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(beforeTotal);

		// Find the first occurrence of the numeric part
		if (matcher.find()) {
			return matcher.group();
		}

		// If no numeric part found, return empty string or handle as needed
		return "";
	}

	public void clickOnDataSet() {

		assertTrue(dataSetTab.isDisplayed());
		dataSetTab.click();
	}

	public void verifyTheDataSetURL() {

		String expecteddURL = "https://app.transmonqa.in/en/dataset_management/dataset/";

		String actualURL = driver.getCurrentUrl();

		assertEquals(actualURL, expecteddURL);
	}

	public void clickOnCreateButtonOfDataSet() {

		assertTrue(createDataSetButton.isDisplayed());
		createDataSetButton.click();

	}

	public void createDataSetPopUp() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertTrue(createDataSetPupup.isDisplayed());

	}

	public void enterDataSetName(String dataSetName) {

		assertTrue(dataSetNameField.isDisplayed());
		assertTrue(dataSetNameField.isEnabled());
		dataSetNameField.click();
//		assertTrue(dataSetNameField.isSelected());
		dataSetNameField.sendKeys(dataSetName);
	}

	public void selectProcess_SubProcess_SubSubProcess(String process, String subProcess, String subSubProcess) {

		assertTrue(processDropDown.isDisplayed());
		Select select = new Select(processDropDown);
		select.selectByVisibleText(process);

		assertTrue(subProcessDropDown.isDisplayed());
		Select select1 = new Select(subProcessDropDown);
		select1.selectByVisibleText(subProcess);

		assertTrue(subSubProcessDropDown.isDisplayed());
		Select select2 = new Select(subSubProcessDropDown);
		select2.selectByVisibleText(subSubProcess);
	}

	public void enterFieldName_LabelName(String fieldName, String labelName) {

		assertTrue(fieldNameField.isDisplayed());
		assertTrue(fieldNameField.isEnabled());
		fieldNameField.click();
//		assertTrue(fieldNameField.isSelected());
		fieldNameField.sendKeys(fieldName);

		assertTrue(labelField.isDisplayed());
		assertTrue(labelField.isEnabled());
		labelField.click();
//		assertTrue(labelField.isSelected());
		labelField.sendKeys(labelName);
	}

	public void selectType_enterMaxLength(String maxLength, String type) {

		assertTrue(typeDropDown.isDisplayed());
		Select select = new Select(typeDropDown);
		select.selectByVisibleText(type);

		assertTrue(maxLengthField.isDisplayed());
		assertTrue(maxLengthField.isEnabled());
		maxLengthField.click();
//		assertTrue(maxLengthField.isSelected());
		maxLengthField.sendKeys(maxLength);
	}

	public void selectMandetoryDropDown() {

		assertTrue(mandetoryDropDown.isDisplayed());
		Select select = new Select(mandetoryDropDown);
		select.selectByVisibleText("Yes");

	}

	public void addRows() {

		for (int i = 1; i <= 2; i++) {
			addRowButton.click();
		}

		assertTrue(fieldNameField1.isDisplayed());
		assertTrue(fieldNameField1.isEnabled());
		fieldNameField1.click();
//		assertTrue(fieldNameField.isSelected());
		fieldNameField1.sendKeys("Test Field Name 2");

		assertTrue(labelField1.isDisplayed());
		assertTrue(labelField1.isEnabled());
		labelField1.click();
//		assertTrue(labelField.isSelected());
		labelField1.sendKeys("Test Label 2");

		assertTrue(typeDropDown1.isDisplayed());
		Select select = new Select(typeDropDown1);
		select.selectByVisibleText("Boolean");

		assertTrue(maxLengthField1.isDisplayed());
		assertTrue(maxLengthField1.isEnabled());
		maxLengthField1.click();
//		assertTrue(maxLengthField.isSelected());
		maxLengthField1.sendKeys("300");

		assertTrue(mandetoryDropDown1.isDisplayed());
		Select select1 = new Select(mandetoryDropDown1);
		select1.selectByVisibleText("Yes");

		// #####################################################

		assertTrue(fieldNameField2.isDisplayed());
		assertTrue(fieldNameField2.isEnabled());
		fieldNameField2.click();
//		assertTrue(fieldNameField.isSelected());
		fieldNameField2.sendKeys("Test Field Name 3");

		assertTrue(labelField2.isDisplayed());
		assertTrue(labelField2.isEnabled());
		labelField2.click();
//		assertTrue(labelField.isSelected());
		labelField2.sendKeys("Test Label 3");

		assertTrue(typeDropDown2.isDisplayed());
		Select select2 = new Select(typeDropDown2);
		select2.selectByVisibleText("Number");

		assertTrue(maxLengthField2.isDisplayed());
		assertTrue(maxLengthField2.isEnabled());
		maxLengthField2.click();
//		assertTrue(maxLengthField.isSelected());
		maxLengthField2.sendKeys("400");

		assertTrue(mandetoryDropDown2.isDisplayed());
		Select select3 = new Select(mandetoryDropDown2);
		select3.selectByVisibleText("No");
	}

	public void deleteRow() {

		deleteButton.click();
	}

	public void clickOnDataSetCreateButton() {

		dataSetCreateButton.click();

	}
}
