package com.learn.cucumbertest.stepdefinitions;

import com.learn.cucumbertest.entity.User;
import io.cucumber.java.en.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class UserCreateStepDefinitions {

    private RequestSpecification request;

    private User user=new User();
    private final String BASE_URL = "http://localhost:8080/users"; // Change the port if needed

    private Map<String, String> userData = new HashMap<>();

    @Given("a user with fullname {string} and email {string}")
    public void a_user_with_fullname_and_email(String fullname, String email) {
        userData.put("fullname", fullname);
        userData.put("email", email);
    }

    @When("the client sends a POST request to {string}")
    public void the_client_sends_a_post_request_to(String endpoint) {
        user.setFullname(userData.get("fullname"));
        user.setUsername(userData.get("email"));
    }

    @Then("the response should contain {string}")
    public void the_response_should_contain(String expectedMessage) {
        Assertions.assertTrue(("Successfully saved: "+user.getFullname()).equals(expectedMessage));
    }
}gith
