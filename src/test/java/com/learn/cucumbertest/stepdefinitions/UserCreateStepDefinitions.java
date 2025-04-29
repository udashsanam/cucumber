package com.learn.cucumbertest.stepdefinitions;

import com.learn.cucumbertest.controller.UserController;
import com.learn.cucumbertest.dto.UserCreatDto;
import com.learn.cucumbertest.entity.User;
import com.learn.cucumbertest.repo.UserRepository;
import com.learn.cucumbertest.service.UserService;
import io.cucumber.java.en.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
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

    @Mock
    private UserRepository userRepository ;

    @InjectMocks
    private UserService userController;

    public UserCreateStepDefinitions(){
        MockitoAnnotations.openMocks(this);
    }

    @Given("a user with fullname {string} and email {string}")
    public void a_user_with_fullname_and_email(String fullname, String email) {
        userData.put("fullname", fullname);
        userData.put("email", email);
        User user = new User();
        user.setFullname("test");
        Mockito.when(userRepository.saveuser(Mockito.any())).thenReturn(user);
        String response = userController.userSave(new UserCreatDto());

        Assertions.assertTrue(response.contains("test"));


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
}
