//package com.learn.cucumbertest.service;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//class ChildClassTest {
//
//    @Test
//    void test1() {
//
//        /**
//         In Mockito, spy() is a method used to create a partial mock of an object. A spy allows you to mock some methods of an object while keeping the real behavior of the other methods. This is useful when you want to mock certain methods while still testing the actual behavior of others.
//
//         Key Points about spy():
//         Partial Mocking:
//         When you create a spy, the object is real (not a mock). You can selectively mock specific methods and keep the others as they are. For instance, you can mock the behavior of a void method but still call the actual methods on the object that are not mocked.
//
//         Usage:
//         spy() is typically used when you want to mock only a few methods of an object, but still use the real methods of that object for other methods.
//
//         Difference between spy() and mock():
//
//         mock() creates a completely mocked object, where all methods are stubbed to return default values (e.g., null for objects, 0 for integers, etc.) unless explicitly specified.
//
//         spy() creates a real instance of the object, and you can choose to mock only specific methods of that object while keeping the original behavior of others.
//         **/
//        // Create a spy of the ChildClass instance
//        ChildClass childClass = spy(new ChildClass());
//
//        // Mock the inherited protected void method to do nothing
//        doNothing().when(childClass).myProtectedVoidMethod();
//
//        // Call the test method which internally calls myProtectedVoidMethod()
//        childClass.test();  // This will call the mocked version of myProtectedVoidMethod()
//
//        // You can also verify that the protected method was called
//        verify(childClass).myProtectedVoidMethod();  // Verifying the call
//
//    }
//}