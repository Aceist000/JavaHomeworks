package ge.btu.junit.demo;

import ge.btu.junit.demo.service.impl.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceTest {
    @Autowired
    CalculatorService calculatorService;

    @Test
    void multiplicationTest() {
        int expected = 20;
        int actual;
        actual = calculatorService.multiplication(10, 2);
        assertEquals(expected, actual);
    }
}