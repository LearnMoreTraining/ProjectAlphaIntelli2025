Feature: Login validation of salesforce application

  @SC01 @lmti @regession @smoke
  Scenario: Login validation with valid data
   # Given user navigates to salesforce login page
    When user enter the username "lmti" and password "abc"
    And user clicks on login button
    Then user should navigate to home page

    @Sc02 @lmti @apple
  Scenario: login validation with incorect data
    #Given user navigates to salesforce login page
    When user enter the username "learnmore" and password "xyz"
    And user clicks on login button
    Then user validate the error message
