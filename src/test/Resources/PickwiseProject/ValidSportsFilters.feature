
Feature: As as user when I click on NextUP sports filter I should be able to see all valid options



Background:
    Given User is on the Pickwise Homepage

@Test
      Scenario: Verify User is able to see all Valid options on clicking NextUp Sports Filter
        When I select the NextUp Sports Filter
        Then I can see all available list of valid Sports to filter by



