Feature: User Creation

  Scenario: Creating a new user successfully
    Given a user with fullname "John Doe" and email "john.doe@example.com"
    When the client sends a POST request to "/users"
    Then the response should contain "Successfully saved: John Doe"
