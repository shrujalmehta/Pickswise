Feature: As as user I am able to navigate to mobile app download page and able to see download options



  Background:
    Given User is on the Pickwise Homepage

  @Test
  Scenario: Verify User is able to navigate to mobile app download page and able to see download options
    When I click on Menu Icon on the home page
    And Select Download the Pickwise App option
    Then I get navigated to download app page
    And Download options for Google Play store and Apple App Store are displayed