Feature: Test Altoto flow

  @wp
  Scenario: Test login flow navigation and transaction
    Given I login and navigate to the "Altoro Login Page" page

    Given I enter user credential and login
    When I Go to ‘View Account Summary’
    Then I Select ‘800001 Checking’ in ‘View Account Details’ drop down
    And I Click ‘Go’
    And I Click Signoff button from the menu bar

  @wp
  Scenario: Test transfer funds flow
    Given I login and navigate to the "Altoro Login Page" page

    Given I enter user credential and login
    When I Go to ‘Transfer Funds’
    Then I Select ‘800000 Corporate’ account as From Account
    Then I Select ‘800001 Corporate’ account as To Account
    Then I Enter ‘1000’ into ‘Amount to Transfer’ text box
    And  I Click on ‘Transfer Money’ button
    And I Click Signoff button from the menu bar