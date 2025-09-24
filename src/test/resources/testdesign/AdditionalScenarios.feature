Feature:  Additional scenarios Coverage

  @dragdrop
  Scenario: drag amd drop
    Given user navigates to the webpage
    When user do the drag and drop
    Then verify the status

    @waits
  Scenario: wait example
    Given user navigates to the webpage
    When user clicks on button