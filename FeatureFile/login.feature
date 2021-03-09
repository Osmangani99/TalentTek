Feature: talentTek login
  Scenario: Login in talentTek site
    Given launch chrome browser
    When user navigate to talenttek
    Then user input valid id and password
    Then click login button
