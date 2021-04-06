Feature: Login with Parameters

  @Parameters
  Scenario: As a user I can enter values in Gherkin syntax to use in the StepDef
    Given I am at talentTEK Home Page
    And I enter valid "osmangani360@gmail.com" Email
    And I enter valid password "osman123"
    When I click on Log In button
    Then I will verify I successfully logged into my existing account
