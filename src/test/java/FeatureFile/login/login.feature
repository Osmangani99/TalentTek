Feature: open browser and login
  Scenario: use open talentTek site
    Given I am in talenTEK site
    And I enterd valid ID
    And  I entred valid password
    When I click on login button
    Then I verify I successfully logged in my account

