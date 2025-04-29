//package com.learn.cucumbertest.service;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.MockitoAnnotations;
//import org.mockito.Spy;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//class MyServiceTest {
//
////    @Spy
//////    @InjectMocks
////    private MyService myService;  // Create a spy for MyService
//
//    @BeforeEach
//    public void setUp() {
//        MockitoAnnotations.openMocks(this);  // Initialize mocks
//    }
//
//    @Test
//    public void testProcess_withMockedHelperMethod() {
//        // Mock the helperMethod() to do nothing or return a value
//        MyService myService = spy(new MyService());
//        doNothing().when(myService).helperMethod(anyString());
//        MyClass moc  = mock(MyClass.class);
//        myService.x = moc;
//        when(moc.getParam("hello")).thenReturn("k chh ");
//
//        // Call the method under test
//        String result = myService.process("input");
//
//        // Verify that the helperMethod() was called
//        verify(myService, times(2)).helperMethod("input");
//
//        // Assert that the result is as expected
//        assertEquals("Processed: null", result); // Since helperMethod does nothing, the result should not have been altered
//    }
//
//}