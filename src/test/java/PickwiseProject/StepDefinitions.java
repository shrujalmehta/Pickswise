package PickwiseProject;

import PickwiseProject.Pages.AppPage;
import PickwiseProject.Pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinitions {

    HomePage homePage = new HomePage();
    AppPage appPage = new AppPage();
    LoadProp prop = new LoadProp();


    @Given("^User is on the Pickwise Homepage$")
    public void user_Is_On_The_Pickwise_Homepage() {
        homePage.mainPage();
    }

    @When("I select the NextUp Sports Filter")
    public void i_select_the_next_up_sports_filter() {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickFilter();
    }
    @Then("I can see all available list of valid Sports to filter by")
    public void i_can_see_all_available_list_of_valid_sports_to_filter_by() {
        homePage.verifyDropdown();

    }


    @When("^I click on Menu Icon on the home page$")
    public void i_Click_On_Menu_Icon_On_The_HomePage() {
        homePage.clickMenu();
    }

    @And("^Select Download the Pickwise App option$")
    public void select_Download_The_Pickwise_App_Option() {
        homePage.selectDownloadPickwiseAppOption();
    }

    @Then("^I get navigated to download app page$")
    public void i_Get_Navigated_To_Download_App_Page() {
        appPage.newWindow();

    }

    @And("^Download options for Google Play store and Apple App Store are displayed$")
    public void download_Options_For_Google_Play_Store_And_Apple_App_Store_Are_Displayed() {
        appPage.showGoogleIcon();
        appPage.showAppleAppStore();
    }
}
