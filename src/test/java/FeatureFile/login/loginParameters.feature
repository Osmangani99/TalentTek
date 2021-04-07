Feature: Login with Parameters

  @Parameters
  Scenario: As a user I can enter values in Gherkin syntax to use in the StepDef
    Given I am at talentTEK Home Page
    And I enter valid "osmangani360@gmail.com" Email
    And I enter valid password "osman123"
    When I click on Log In button
    Then I will verify I successfully logged into my existing account


  @Parameters1
  Scenario: Sign up and then sign back in with studentId using Gherkin Datatable
    Given I am at talentTEK Home Page
    And I click on Create New Account button
    And I filled out the form using the following data table
      | Osman | Gani | lmn@gmail.com | osman123 | osman123 | Feb | 7 | 1987 | Male |
    And I clicked on agree checkbox
    And I click Create My Account button
    And I will store the dynamic studentId
    And I click on Login Link
    And I login with newly created studentId Info
    When I click on Log In button
    Then I will verify my profile info
