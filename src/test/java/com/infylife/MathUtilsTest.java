package com.infylife;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing MathUtils Class")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeAll
    void init() {
        mathUtils = new MathUtils();
    }

    @Nested
    @DisplayName("add method")
    class AddTest {

        @Test
        @DisplayName("when adding two positive integer")
        void testTwoPositiveInteger() {
            assertEquals(500, mathUtils.add(200, 300));
        }

        @Test
        @DisplayName("when adding two negative integer")
        void testTwoNegativeInteger() {
            assertEquals(-7, mathUtils.add(-4, -3));
        }

        @Test
        @DisplayName("when one of the argument is zero")
        void testWhenOneArgumentIsZero() {
            assertEquals(3, mathUtils.add(3, 0));
        }
    }

    @Nested
    @DisplayName("subtract method")
    class SubtractTest {

        @Test
        @DisplayName("when both are positive integer")
        void testWhenTwoPositiveNumber() {
            assertEquals(10, mathUtils.subtract(30, 20));
        }

        @Test
        @DisplayName("when both are negative integer")
        void testWhenTwoNegativeNumber() {
            assertEquals(-15, mathUtils.subtract(-20, -5));
        }

        @Test
        @DisplayName("when first argument is negative")
        void testWhenFirstArgumentIsNegative() {
            assertEquals(-7, mathUtils.subtract(-5, 2));
        }

        @Test
        @DisplayName("when second argument is negative")
        void testWhenSecondArgumentIsNegative() {
            assertEquals(7, mathUtils.subtract(5, -2));
        }

        @Test
        @DisplayName("when first argument is zero")
        void testWhenFirstArgumentIsZero() {
            assertEquals(-5, mathUtils.subtract(0, 5));
        }

        @Test
        @DisplayName("when second argument is zero")
        void testWhenSecondArgumentIsZero() {
            assertEquals(5, mathUtils.subtract(5, 0));
        }
    }

    @Nested
    @DisplayName("divide method")
    class DivideTest {

        @Test
        @DisplayName("when both argument is positive")
        void testWhenBothPositive() {
            assertEquals(5, mathUtils.divide(10, 2));
        }

        @Test
        @DisplayName("when one argument is negative")
        void testWithNegativeArgument() {
            assertEquals(-6, mathUtils.divide(36, -6));
        }

        @Test
        @DisplayName("when second argument is zero (divide by zero)")
        void testWhenDivideByZero() {
            assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0));
        }
    }

    @Nested
    @DisplayName("multiply method")
    class MultiplyTest {

        @Test
        @DisplayName("when both argument is positive")
        void testWhenBothPositive() {
            assertEquals(49, mathUtils.multiply(7, 7));
        }

        @Test
        @DisplayName("when one argument is negative")
        void testWithNegativeArgument() {
            assertEquals(-36, mathUtils.multiply(3, -12));
        }

        @Test
        @DisplayName("when one argument is zero")
        void testWhenOneArgumentIsZero() {
            assertEquals(0, mathUtils.multiply(15, 0));
        }
    }

}