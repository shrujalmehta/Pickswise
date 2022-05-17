$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MobileAppDownload.feature");
formatter.feature({
  "line": 1,
  "name": "As as user I am able to navigate to mobile app download page and able to see download options",
  "description": "",
  "id": "as-as-user-i-am-able-to-navigate-to-mobile-app-download-page-and-able-to-see-download-options",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9187772300,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User is on the Pickwise Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.user_Is_On_The_Pickwise_Homepage()"
});
formatter.result({
  "duration": 401909500,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify User is able to navigate to mobile app download page and able to see download options",
  "description": "",
  "id": "as-as-user-i-am-able-to-navigate-to-mobile-app-download-page-and-able-to-see-download-options;verify-user-is-able-to-navigate-to-mobile-app-download-page-and-able-to-see-download-options",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I click on Menu Icon on the home page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Select Download the Pickwise App option",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I get navigated to download app page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Download options for Google Play store and Apple App Store are displayed",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.i_Click_On_Menu_Icon_On_The_HomePage()"
});
formatter.result({
  "duration": 307386900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.select_Download_The_Pickwise_App_Option()"
});
formatter.result({
  "duration": 372074600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_Get_Navigated_To_Download_App_Page()"
});
formatter.result({
  "duration": 1557792500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.download_Options_For_Google_Play_Store_And_Apple_App_Store_Are_Displayed()"
});
formatter.result({
  "duration": 85570800,
  "status": "passed"
});
formatter.after({
  "duration": 1437576700,
  "status": "passed"
});
formatter.uri("ValidSportsFilters.feature");
formatter.feature({
  "line": 2,
  "name": "As as user when I click on NextUP sports filter I should be able to see all valid options",
  "description": "",
  "id": "as-as-user-when-i-click-on-nextup-sports-filter-i-should-be-able-to-see-all-valid-options",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6420558900,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User is on the Pickwise Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.user_Is_On_The_Pickwise_Homepage()"
});
formatter.result({
  "duration": 69004900,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify User is able to see all Valid options on clicking NextUp Sports Filter",
  "description": "",
  "id": "as-as-user-when-i-click-on-nextup-sports-filter-i-should-be-able-to-see-all-valid-options;verify-user-is-able-to-see-all-valid-options-on-clicking-nextup-sports-filter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I select the NextUp Sports Filter",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I can see all available list of valid Sports to filter by",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_select_the_next_up_sports_filter()"
});
formatter.result({
  "duration": 278854900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_can_see_all_available_list_of_valid_sports_to_filter_by()"
});
formatter.result({
  "duration": 274643700,
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertTrue(Assert.java:44)\r\n\tat org.testng.Assert.assertTrue(Assert.java:54)\r\n\tat PickwiseProject.Pages.HomePage.verifyDropdown(HomePage.java:49)\r\n\tat PickwiseProject.StepDefinitions.i_can_see_all_available_list_of_valid_sports_to_filter_by(StepDefinitions.java:30)\r\n\tat ✽.Then I can see all available list of valid Sports to filter by(ValidSportsFilters.feature:12)\r\n",
  "status": "failed"
});
formatter.write("Current Page URL is https://www.pickswise.com/");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2527452600,
  "status": "passed"
});
});