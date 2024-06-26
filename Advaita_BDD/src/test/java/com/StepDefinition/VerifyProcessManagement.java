package com.StepDefinition;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.PageObject.DataSetUpPage;
import com.PageObject.LoginPage;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyProcessManagement extends Baseclass {

	public LoginPage loginPage;
	public DataSetUpPage dataSetUpPage;
	String processNo = "56";
	String dateSetNo = "7";
	public String processName = "Test Process Name" + processNo;
	public String processDesc = "Test Process Desc" + processNo;
	public String subProcessName = "Test Sub Process Name" + processNo;
	public String subProcessDesc = "Test Sub Process Desc" + processNo;
	public String subSubProcessName = "Test Sub Sub Process Name" + processNo;
	public String subSubProcessDesc = "Test Sub Sub Process Desc" + processNo;

	public String dataSetName = "Test DataSet Name" + dateSetNo;

	@Given("User Lunch Chrome Browser")
	public void user_lunch_chrome_browser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().getImplicitWaitTimeout();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginPage = new LoginPage(driver);
		dataSetUpPage = new DataSetUpPage(driver);

	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {

		driver.get(url);
	}

	@When("User Enters Name as {string} and Password as {string}")
	public void user_enters_name_as_and_password_as(String userName, String pwd) {

		loginPage.enteruserName(userName);
		loginPage.enterPWD(pwd);

	}

	@When("Click on Sign In Button")
	public void click_on_sign_in_button() {

		loginPage.clickOnLoginButton();

	}

	@Then("Page Title Should be {string}")
	public void page_title_should_be(String pageTitle) {

		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, pageTitle);

	}

	@When("User Click LogOut Button")
	public void user_click_log_out_button() {

		loginPage.clickOnLogOutButton();

	}

	@Then("Page URL Should be {string}")
	public void page_url_should_be(String url) {

		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, url);

	}

	@When("User Click on Data SetUp Option")
	public void user_click_on_data_set_up_option() {

		dataSetUpPage.clickOnDataSetUp();
//		dataSetUpPage.sideBar.click();

	}

	@Then("Data SetUp Initial Page URL Should be {string}")
	public void data_set_up_initial_page_url_should_be(String url) {

		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, url);

	}

	@Then("Process, Data Set, Metadata, Data Upload Tab Should Display")
	public void process_data_set_metadata_data_upload_tab_should_display() {

		dataSetUpPage.tabsIsDisplayed();

	}

	@Then("Click on Create Button")
	public void click_on_create_button() {

		dataSetUpPage.clickOnCreate();
	}

	@Then("Add Processes PupUp Should Display")
	public void add_processes_pup_up_should_display() {

		dataSetUpPage.addProcessPupupIsDisplaye();
	}

	@Then("Enter Process Name")
	public void enter_process_name() {

		dataSetUpPage.enterProcessNameField(processName);
	}

	@Then("Enter Process Description")
	public void enter_process_description() {

		dataSetUpPage.enterProcessDescField(processDesc);

	}

	@Then("Select the Status in Process Tab")
	public void select_the_status_in_process_tab() {

		dataSetUpPage.selectStatusInProcessTab();

	}

	@When("Click On Save and Continue Button On Process Tab")
	public void click_on_save_and_continue_button_on_process_tab() {

		dataSetUpPage.clickOnSaveandContinue();

	}

	@Then("Sub Process Tab Should Diaplay")
	public void sub_process_tab_should_diaplay() {

		dataSetUpPage.subProcessTabIsDisplayed();
	}

	@Then("Select The Process From Select Process DropDown")
	public void select_the_process_from_select_process_drop_down() {

		dataSetUpPage.selectProcess(processName);
	}

	@Then("Enter Sub Process Name in Sub Process Tab")
	public void enter_sub_process_name_in_sub_process_tab() {

		dataSetUpPage.enterSubProcessNameField(subProcessName);
	}

	@Then("Enter the Description in Sub Process Tab")
	public void enter_the_description_in_sub_process_tab() {

		dataSetUpPage.enterSubProcessDescField(subProcessDesc);
	}

	@Then("Select the Status in Sub Process Tab")
	public void select_the_status_in_sub_process_tab() {

		dataSetUpPage.selectStatusInSubProcessTab();
	}

	@When("Click On Save and Continue Button On Sub Process Tab")
	public void click_on_save_and_continue_button_on_sub_process_tab() {

		dataSetUpPage.clickOnSaveandContinueInSubProcess();
	}

	@Then("Sub Sub Process Tab Should be Diaplay")
	public void sub_sub_process_tab_should_be_diaplay() {

		dataSetUpPage.subSubProcessTabIsDisplayed();

	}

	@Then("Enter Sub Sub Process Name in Sub SUb Process Tab")
	public void enter_sub_sub_process_name_in_sub_s_ub_process_tab() {

		dataSetUpPage.enterSubSubProcessNameField(subSubProcessName);
	}

	@Then("Enter the Description in Sub Sub Process Tab")
	public void enter_the_description_in_sub_sub_process_tab() {

		dataSetUpPage.enterSubSubProcessDescField(subSubProcessDesc);
	}

	@Then("Click On Save and Update Button On Sub Sub Process Tab")
	public void click_on_save_and_update_button_on_sub_sub_process_tab() {

		dataSetUpPage.clickOnSaveandUpdateInSubProcess();

	}

	@Then("Sucess Pup up Should Display")
	public void sucess_pup_up_should_display() {

		dataSetUpPage.successPupUpIsDisplayed();
	}

	@Then("Collapse the DropDowns")
	public void collapse_the_drop_downs() throws Throwable {
		dataSetUpPage.collapseDropDowns();
	}

	@Then("Edit Process , Sub Process, Sub Sub Process")
	public void edit_process_sub_process_sub_sub_process() throws Throwable {

		dataSetUpPage.editCreatedProcess("Edited processDesc", "Edited subProcessDesc", "Edited subSubProcessDesc");
	}

	@Then("Search the Created Record")
	public void search_the_created_record() throws Throwable {

		dataSetUpPage.searchCreatedRecord();

	}

	@Then("Check the Pegination of Create Process Page")
	public void check_the_pegination_of_create_process_page() throws Exception {

		dataSetUpPage.paginateTheTablePage(3);

	}
	
	@Then("Check Total Number of Records in Process Tab")
	public void check_total_number_of_records_in_process_tab() {
	    
		
//		dataSetUpPage.checkTotalNoOfRecords();
	}

	@Then("Click on Data Set Tab")
	public void click_on_data_set_tab() {

		dataSetUpPage.clickOnDataSet();

	}

	@Then("Check Data Set Tab Page URL")
	public void check_data_set_tab_page_url() {
		dataSetUpPage.verifyTheDataSetURL();
	}

	@Then("Click on Data Set Create")
	public void click_on_data_set_create() {

		dataSetUpPage.clickOnCreateButtonOfDataSet();
	}

	@Then("Create DataSet Pop-Up Should be displayed")
	public void create_data_set_pop_up_should_be_displayed() {

		dataSetUpPage.createDataSetPopUp();
	}

	@Then("Enter Data Set Name in DataSet Name Field")
	public void enter_data_set_name_in_data_set_name_field() {

		dataSetUpPage.enterDataSetName(dataSetName);
	}

	@Then("Select Process , Sub Process , Sub Sub Process")
	public void select_process_sub_process_sub_sub_process() {

		dataSetUpPage.selectProcess_SubProcess_SubSubProcess(processName, subProcessName, subSubProcessName);
	}

	@Then("Enter Field Name , Label Name")
	public void enter_field_name_label_name() {

		dataSetUpPage.enterFieldName_LabelName("Test Field Name", "Test Label Name");
	}

	@Then("Select Type and Enter Max Length")
	public void select_type_and_enter_max_length() {

		dataSetUpPage.selectType_enterMaxLength("200", "Text Area");
	}

	@Then("Select Mandetory Drop Down")
	public void select_mandetory_drop_down() {

		dataSetUpPage.selectMandetoryDropDown();

	}

	@Then("Add Three Row with All the Details")
	public void add_three_row_with_all_the_details() {

		dataSetUpPage.addRows();
	}

	@Then("Delete One Row")
	public void delete_one_row() throws Throwable {

		dataSetUpPage.deleteRow();
	}

	@Then("Click on Create Data Set Button")
	public void click_on_create_data_set_button() {

		dataSetUpPage.clickOnDataSetCreateButton();

	}

	@Then("Close Browser")
	public void close_browser() {
		driver.manage().window().minimize();
		driver.quit();

	}

	@AfterStep
	public void addScreenshot(Scenario scenario) {

		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			// attach image file report(data, media type, name of the attachment)
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
	}
}
