package tests;

import arithmetic.Multiplication;
import dataProvider.Data;
import org.testng.annotations.*;

public class Multiplication_test {
    Multiplication multiplicationPage;

    @BeforeClass
    private void print() {
        System.out.println("Before class");
        multiplicationPage = new Multiplication();
    }

    @AfterClass
    private void print1() {
        System.out.println("After class");
    }

    @Test(alwaysRun = true, dataProvider = "MultiplicationData", dataProviderClass = Data.class, groups = "2")
    private void multiply(double a, double b) {
        multiplicationPage.multiply(a, b);
    }
}
