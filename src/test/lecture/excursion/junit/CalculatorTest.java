package test.lecture.excursion.junit;

import lecture.excursion.junit.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Test Suite")
class CalculatorTest {

    Calculator calculatorToTest;

    @BeforeAll
    static void setupAll(){

    }

    @BeforeEach
    void setUp() {
        // Setup before each test
        calculatorToTest = new Calculator();
    }

    @AfterEach
    void tearDown() {
        // cleanup after each test
    }

    @DisplayName("add-methods Test")
    @Nested
    class AddTest{

        @Test
        @DisplayName("add test, add 50.0 and 25.0 expected 75.0")
        void add() {
            double expectedResult = 75.0;
            double result = calculatorToTest.add(50.0, 25.0);

            assertEquals(expectedResult, result);
        }

        @Test
        @DisplayName("add test with large numbers, add 50000.0 and 25.0 expected 50025.0.0")
        void addLargeNumbers() {
            double expectedResult = 50025.0;
            double result = calculatorToTest.add(50000.0, 25.0);

            assertEquals(expectedResult, result);
        }
    }


    @ParameterizedTest(name="{0} minus {1} should result in {2}")
    @DisplayName("prameterized subtract-test")
    @CsvSource({
            "10, 5, 5",
            "15.0, 8, 7",
            "18, 20, -2",
            "100000000, -1, 100000000"
    })
    void subtract(double numberA, double numberB, double expectedResult) {
        assertEquals(expectedResult, calculatorToTest.subtract(numberA, numberB));
    }

    @ParameterizedTest(name="{0} multiplied {1} should result in {2}")
    @DisplayName("prameterized multiply-test")
    @CsvSource({
            "10, 5, 50",
            "15.0, 3, 45",
            "20, -10, -200",
            "100000000, -1, -100000000"
    })
    void multiply(double numberA, double numberB, double expectedResult) {
        assertEquals(expectedResult, calculatorToTest.multiply(numberA, numberB));
    }
}