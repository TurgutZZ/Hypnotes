package stepDefinitions;

import enums.USERCREDENTIAL;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CommonPage;
import utilities.ReusableMethods;

public class EducationAdd_Stepdefs extends CommonPage {
    @Given("User accesses the home page successfully")
    public void userAccessesTheHomePageSuccessfully() {
        getLoginPage().login(USERCREDENTIAL.TR2);
    }

    @Then("User accesses the profile page successfully")
    public void userAccessesTheProfilePageSuccessfully() {
        getAccauntHomePage().goesToProfile();
    }

    @And("User clicks add new education button")
    public void userClicksAddNewEducationButton() {
        ReusableMethods.clickElement(getProfilePage().addNewEducationButton);
        getProfilePage().addedEducations();
    }

    @Then("User fills in the boxes School Name Department Start Date")
    public void userFillsInTheBoxesSchoolNameDepartmentStartDate(DataTable dataTable) {
        getProfilePage().entryNewEducationData(dataTable);
    }

    @And("User clicks save button")
    public void userClicksSaveButton() {
        ReusableMethods.waitFor(2);
        ReusableMethods.clickElement(getProfilePage().saveButton);
        ReusableMethods.waitFor(2);
    }

    @Then("User should see the added education under the education heading")
    public void userShouldSeeTheAddedEducationUnderTheEducationHeading() {
        getProfilePage().verifyAddedEducations();
    }
}
