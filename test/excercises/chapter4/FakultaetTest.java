package test.excercises.chapter4;

import excercises.chapter4.Fakultaet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FakultaetTest {

    private final PrintStream systemOut = System.out;
    private final InputStream systemIn = System.in;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    void setUp() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @AfterEach
    void tearDown() {
        System.setOut(systemOut);
        System.setIn(systemIn);
    }

    void provideInputToSystemIn(String data){
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @ParameterizedTest(name="Factorial of {0} should be {1}")
    @DisplayName("Factorial Calculation")
    @CsvSource({
            "1, 1",
            "3, 6",
            "4, 24",
            "5, 120"
    })
    void main(int input, int result) {
        String output = "Die Fakultät beträgt: " + result + "\n";

        provideInputToSystemIn(Integer.toString(input));

        Fakultaet.main(new String[0]);

        assertEquals(output, testOut.toString());
    }
}