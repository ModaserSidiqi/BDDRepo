@Smoke
Feature: Home Page Validation

  Scenario: Validate home page title.
    #Given is a pre-condition
    #When is the action that we are taking
    #Then is the expected result
    Then Validate Title on top left corner

    Scenario: Validate sign in button is enabled.
      Then Validate sign in button is enabled