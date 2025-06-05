package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AppTest {

    @Test
    public void testMainMethodRunsWithoutException() {
        // This test checks that the main method executes without throwing any exceptions
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}
