Feature:  Additional scenarios Coverage

  @dragdrop @regression
  Scenario: drag amd drop
   # Given user navigates to the webpage
    When user do the drag and drop
    Then verify the status

    @waits @regression
  Scenario: wait example
  #  Given user navigates to the webpage
    When user clicks on button

      @wiki @regression
  Scenario: table handling
    Given user extracts the shareholder and shareholding value
    Then validate the mapping