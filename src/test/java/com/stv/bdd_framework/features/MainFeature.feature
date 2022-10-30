Feature: Navigate to login page

  Scenario: 01. Open the main project page
    Given Main page is loaded
    When Click on accoun link
    Then Account page is loaded

  Scenario Outline: 011.Input email address
    When The user input email <address>
    And The user clears email field
    Examples:
      | address |
      | 1111    |
      | 2222    |

  Scenario Outline: 02. Input password
    When The user input password "<password>"
    And The user clears password field
    Examples:
      | password   |
      | laa        |
      | MyPassword |