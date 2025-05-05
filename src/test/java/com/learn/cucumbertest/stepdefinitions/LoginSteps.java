package com.learn.cucumbertest.stepdefinitions;

import com.learn.cucumbertest.repo.UserRepository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class LoginSteps {

    private boolean isLoginPage;
    private boolean credentialsAreValid;
    private boolean isRedirectedToHomepage;
    private String displayedMessage;

    private boolean emptyCredential;

    private UserRepository  userRepository;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        isLoginPage = true;
    }

    @When("the user enters a valid username {string}")
    public void the_user_enters_a_valid_username(String username) {
        if (isLoginPage) {
            // Simulate entering a valid username
            credentialsAreValid = true; // Assume the username is valid
        }
    }

    @When("the user enters a valid password {string}")
    public void the_user_enters_a_valid_password(String password) {
        if (isLoginPage && credentialsAreValid) {
            // Simulate entering a valid password
            credentialsAreValid = true; // Assume the password is valid
        }
    }

    @When("the user enters an invalid username {string}")
    public void the_user_enters_an_invalid_username(String username) {
        if (isLoginPage) {
            // Simulate entering an invalid username
            credentialsAreValid = false; // Assume the username is invalid
        }
    }

    @When("the user enters an invalid password {string}")
    public void the_user_enters_an_invalid_password(String password) {
        if (isLoginPage) {
            // Simulate entering an invalid password
            credentialsAreValid = false; // Assume the password is invalid
        }
    }

    @When("the user enters an empty username")
    public void the_user_enters_an_empty_username() {
        if (isLoginPage) {
            // Simulate entering an empty username
            credentialsAreValid = false; // Assume the username is empty
        }
    }

    @When("the user enters an empty password")
    public void the_user_enters_an_empty_password() {
        if (isLoginPage) {
            // Simulate entering an empty password
            credentialsAreValid = false; // Assume the password is empty
            emptyCredential = true;
        }
    }

    @When("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
        if(emptyCredential) {
            displayedMessage = "Please enter username and password";
            return;
        }
        if (isLoginPage && credentialsAreValid) {
            // Simulate redirection to the homepage
            isRedirectedToHomepage = true;
            displayedMessage = "Welcome, user1!";
        } else if (isLoginPage && !credentialsAreValid) {
            // Simulate error message display
            displayedMessage = "Invalid credentials";
        }
    }

    @Then("the user is redirected to the homepage")
    public void the_user_is_redirected_to_the_homepage() {
        assertTrue(isRedirectedToHomepage);
    }

    @Then("the welcome message {string} is displayed")
    public void the_welcome_message_is_displayed(String expectedMessage) {
        assertEquals(expectedMessage, displayedMessage);
    }

    @Then("an error message {string} is displayed")
    public void an_error_message_is_displayed(String expectedMessage) {
        assertEquals(expectedMessage, displayedMessage);
    }
}