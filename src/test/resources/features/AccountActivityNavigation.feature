Feature: Navigating to specific accounts in Accounts Activity
  @wip
  Scenario Outline: <accountType> account redirect
    Given the user is logged in
    When the user clicks on "<accountType>" link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have "<accountType>" selected
    Examples:
      | accountType |
      | Savings     |
      | Brokerage   |
      | Checking    |
      | Credit Card |
      | Loan        |