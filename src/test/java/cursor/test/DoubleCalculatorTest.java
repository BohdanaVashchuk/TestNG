package cursor.test;

import company.CalculatorDouble;
import company.CalculatorInteger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DoubleCalculatorTest {
    private CalculatorDouble calculatorDouble;

    @BeforeMethod
    public void init() {
        calculatorDouble = new CalculatorDouble();
        System.out.println("Create object before each Method");
    }

    @Test()
    @Parameters({"val1","val2"})
    public void additionDouble(double v1, double v2){
        Double expectedResult = 5.1;
        Double actualResult = (Double) calculatorDouble.addition(v1,v2);
        System.out.println(actualResult);
        assertEquals(actualResult, expectedResult, "Addition failed");
    }
    @Test()
    public void multiplicationDouble(){
        Double a = 10.0, b = 23.1;
        Double expectedResult = 231.0;
        Double actualResult = (Double) calculatorDouble.multiplication(a,b);
        System.out.println(actualResult);
        assertEquals(actualResult, expectedResult, "Addition failed");
    }


    @Test()
    public void subtractionDouble(){
        Double a = 120.0, b = 60.0;
        Double expectedResult = 60.0;
        Double actualResult = (Double) calculatorDouble.subtraction(a,b);
        System.out.println(actualResult);
        assertEquals(actualResult, expectedResult,"Subtraction is failed");
    }

    @Test()
    public void divisionDouble(){
        Double a = 10.10, b = 2.0;
        Double expectedResult = 5.05;
        Double actualResult = (Double) calculatorDouble.division(a,b);
        System.out.println(actualResult);
        assertEquals(actualResult, expectedResult, "Division is failed");
    }

    @Test(expectedExceptions = AssertionError.class)
    public void divisionByZeroDouble(){
        Double a = 0.0, b = 2.0;
        Double expectedResult = 5.05;
        Double actualResult = (Double) calculatorDouble.division(a,b);
        System.out.println(actualResult);
        assertEquals(actualResult, expectedResult, "Division is failed");
    }

}
