Feature: Login page testing

  Scenario: Verify login page
    Given Main page is loaded
    When The user clears password field
    Then Verify that the user