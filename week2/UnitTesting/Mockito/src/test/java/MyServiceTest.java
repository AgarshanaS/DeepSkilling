package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Arrange
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        // Act
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Assert
        assertEquals("Mock Data", result);
    }

    public void testVerifyInteraction() {
        // Step 1: Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Call the method
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Step 3: Verify the interaction
        verify(mockApi).getData();  // Passes if getData() was called exactly once
    }

}
