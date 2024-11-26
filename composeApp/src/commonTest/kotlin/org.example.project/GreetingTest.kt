package org.example.project

import kotlin.test.Test
import kotlin.test.assertEquals

class GreetingTest {

    @Test
    fun checkValidGreeting() {
        val greeting = Greeting()
        val result = greeting.greet()

        // Adjust the expected result depending on what platform `platform.name` returns
        assertEquals("Hello, somePlatform!", result)
    }

    @Test
    fun sampleTest() {
        assertEquals('1', '1')
    }
}
