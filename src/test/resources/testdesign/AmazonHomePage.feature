Feature: Amazon Automation

  @lmti @amazon01
  Scenario: Handling of dropdown
    Given user navigates to the webpage
    When user extract the dropdown value
    And user select the specific value
    Then validate the dropdown values

    @amazon02
   Scenario: Babywishlist validation
     Given user navigates to the webpage
     When user clicks on baby wish list
     Then validate the navigation

    @anazon03
   Scenario: user orders a product
     Given user navigates to the webpage
     When user search for product and select one product from the search result
