package org.example.project

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertContains
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertNotNull

class PlatformTest {

    @Test
    fun shouldEqualEachOther() {
        assertEquals(2, 2)

    }

    @Test
    fun shouldNotEqualEachOther() {
        assertNotEquals(2, 3)
    }

    @Test
    fun stringShouldContainSubstring() {
        assertContains("Kotlin programming", "Kotlin")
    }

    @Test
    fun stringShouldNotContainSubstring() {
        assertFalse("Kotlin programming".contains("Java"))
    }

    @Test
    fun shouldBeTrue() {
        assertTrue(5 > 3)
    }

    @Test
    fun shouldBeFalse() {
        assertFalse(3 > 5)
    }

    @Test
    fun nullShouldRemainNull() {
        val nullable: String? = null
        assertNull(nullable)
    }

    @Test
    fun nonNullShouldBeNonNull() {
        val nonNullable = "Hello"
        assertNotNull(nonNullable)
    }

    @Test
    fun listShouldContainElement() {
        val list = listOf(1, 2, 3)
        assertContains(list, 2)
    }

    @Test
    fun listShouldNotContainElement() {
        val list = listOf(1, 2, 3)
        assertFalse(list.contains(4))
    }

    @Test
    fun sumShouldBeCorrect() {
        assertEquals(10, 5 + 5)
    }

    @Test
    fun differenceShouldBeCorrect() {
        assertEquals(2, 5 - 3)
    }

    @Test
    fun multiplicationShouldBeCorrect() {
        assertEquals(15, 3 * 5)
    }

    @Test
    fun divisionShouldBeCorrect() {
        assertEquals(3, 9 / 3)
    }

    @Test
    fun remainderShouldBeCorrect() {
        assertEquals(1, 10 % 3)
    }

    @Test
    fun stringShouldStartWithPrefix() {
        assertTrue("Hello World".startsWith("Hello"))
    }

    @Test
    fun stringShouldEndWithSuffix() {
        assertTrue("Hello World".endsWith("World"))
    }

    @Test
    fun stringShouldHaveCorrectLength() {
        assertEquals(11, "Hello World".length)
    }

    @Test
    fun listSizeShouldBeCorrect() {
        assertEquals(3, listOf(1, 2, 3).size)
    }

    @Test
    fun mapShouldContainKey() {
        val map = mapOf("key" to "value")
        assertTrue(map.containsKey("key"))
    }

    @Test
    fun mapShouldContainValue() {
        val map = mapOf("key" to "value")
        assertTrue(map.containsValue("value"))
    }

    @Test
    fun setShouldContainElement() {
        val set = setOf(1, 2, 3)
        assertContains(set, 2)
    }

    @Test
    fun setShouldNotContainElement() {
        val set = setOf(1, 2, 3)
        assertFalse(set.contains(4))
    }

    @Test
    fun shouldCheckEqualityOfStrings() {
        assertEquals("Kotlin", "Kotlin")
    }

    @Test
    fun shouldCheckInequalityOfStrings() {
        assertNotEquals("Kotlin", "Java")
    }

    @Test
    fun shouldVerifyFloatingPointNumbers() {
        assertEquals(3.14, 3.14, 0.001)
    }

    @Test
    fun shouldVerifyListOrder() {
        val list = listOf(1, 2, 3)
        assertEquals(list, listOf(1, 2, 3))
    }

    @Test
    fun mapShouldReturnCorrectValue() {
        val map = mapOf("key" to "value")
        assertEquals("value", map["key"])
    }

    @Test
    fun shouldCheckCharEquality() {
        assertEquals('a', 'a')
    }

    @Test
    fun shouldVerifyBooleanValue() {
        val isKotlinFun = true
        assertTrue(isKotlinFun)
    }

    @Test
    fun listShouldBeEmpty() {
        val list = emptyList<String>()
        assertTrue(list.isEmpty())
    }

    @Test
    fun listShouldNotBeEmpty() {
        val list = listOf(1, 2, 3)
        assertFalse(list.isEmpty())
    }

    @Test
    fun shouldThrowException() {
        try {
            throw IllegalArgumentException("Invalid argument")
        } catch (e: IllegalArgumentException) {
            assertEquals("Invalid argument", e.message)
        }
    }

    @Test
    fun stringShouldContainSpace() {
        assertTrue("Hello World".contains(" "))
    }

    @Test
    fun setSizeShouldBeCorrect() {
        val set = setOf(1, 2, 3)
        assertEquals(3, set.size)
    }

    @Test
    fun shouldReverseStringCorrectly() {
        val reversed = "Kotlin".reversed()
        assertEquals("niltoK", reversed)
    }

    @Test
    fun shouldUpperCaseString() {
        val upper = "kotlin".uppercase()
        assertEquals("KOTLIN", upper)
    }

    @Test
    fun shouldLowerCaseString() {
        val lower = "KOTLIN".lowercase()
        assertEquals("kotlin", lower)
    }

    @Test
    fun rangeShouldContainValue() {
        val range = 1..10
        assertTrue(range.contains(5))
    }

    @Test
    fun rangeShouldNotContainValue() {
        val range = 1..10
        assertFalse(range.contains(11))
    }

    @Test
    fun listShouldFilterCorrectly() {
        val list = listOf(1, 2, 3, 4, 5)
        val filtered = list.filter { it % 2 == 0 }
        assertEquals(listOf(2, 4), filtered)
    }

    @Test
    fun shouldSortListCorrectly() {
        val list = listOf(3, 1, 2)
        val sorted = list.sorted()
        assertEquals(listOf(1, 2, 3), sorted)
    }

    @Test
    fun stringShouldSplitCorrectly() {
        val split = "a,b,c".split(",")
        assertEquals(listOf("a", "b", "c"), split)
    }

    @Test
    fun mapShouldBeEmpty() {
        val map = emptyMap<String, String>()
        assertTrue(map.isEmpty())
    }

    @Test
    fun mapShouldNotBeEmpty() {
        val map = mapOf("key" to "value")
        assertFalse(map.isEmpty())
    }
}

