package cursor.test;

import company.CalculatorInteger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntegerCalculatorTest {
    private CalculatorInteger calculatorInteger = new CalculatorInteger();

//    @BeforeMethod
//    public void init() {
//        calculatorInteger = new CalculatorInteger();
//        System.out.println("Create object before each Method");
//    } for group is not working

    @Test(groups = "smoke", dataProvider = "dataProvider")
    public void addition(int a, int b, int result) {
        int expectedResult = result;
        int actualResult = (int) calculatorInteger.addition(a, b);
        System.out.println(actualResult);
        assertEquals(actualResult, expectedResult, "Addition failed");
    }

    @Test(expectedExceptions = ClassCastException.class, groups = "smoke")
    public void additionWithDouble() {
        double a = 10.23, b = 23.23;
        double expectedResult = 33.46;
        double actualResult = (double) calculatorInteger.addition(a, b);
        System.out.println(actualResult);
        assertEquals(expectedResult, actualResult, "error is failed");
    }

    @Test(groups = "smoke")
    public void subtraction() {
        int a = 10, b = 23;
        int expectedResult = -13;
        int actualResult = (int) calculatorInteger.subtraction(a, b);
        System.out.println(actualResult);
        assertEquals(actualResult, expectedResult, "Subtraction is failed");
    }

    @Test(groups = "smoke")
    public void division() {
        Double a = 10.10, b = 2.0;
        Double expectedResult = 5.05;
        Double actualResult = (Double) calculatorInteger.division(a, b);
        System.out.println(actualResult);
        assertEquals(actualResult, expectedResult, "Division is failed");
    }

    @Test(expectedExceptions = AssertionError.class, groups = "smoke")
    public void divisionByZero() {
        Double a = 0.0, b = 2.0;
        Double expectedResult = 5.05;
        Double actualResult = (Double) calculatorInteger.division(a, b);
        System.out.println(actualResult);
        assertEquals(actualResult, expectedResult, "Division is failed");
    }

    @DataProvider(name = "dataProvider")
    public Object[][] dpMethod(){
        return new Object[][] {{2, 3 , 5}, {5, 7, 12}};
    }
}
