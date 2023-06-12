Feature: Login as Teacher Functionality
  Scenario: Login with valid username and password

    Given Navigate to Campus Website
    When Enter username and password
    Then Click login on button
    Then User should login successfully
