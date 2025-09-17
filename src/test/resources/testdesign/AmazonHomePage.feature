Feature: Amazon Automation

  @lmti @amazon01
  Scenario: Handling of dropdown
    Given user navigates to the webpage
    When user extract the dropdown value
    And user select the specific value
    Then validate the dropdown values
