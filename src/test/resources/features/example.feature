Feature: User Login
  Background:
    Given the user is on the login page
  Scenario: Successful login
    When the user enters a valid username "user1"
    And the user enters a valid password "password123"
    And the user clicks the login button
    Then the user is redirected to the homepage
    And the welcome message "Welcome, user1!" is displayed
  Scenario: Unsuccessful login due to invalid credentials
    When the user enters an invalid username "invalidUser"
    And the user enters an invalid password "wrongPassword"
    And the user clicks the login button
    Then an error message "Invalid credentials" is displayed

  Scenario: Unsuccessful login due to empty credentials
    When the user enters an empty username
    And the user enters an empty password
    And the user clicks the login button
    Then an error message "Please enter username and password" is displayed