package tests;

import arithmetic.Subtraction;
import dataProvider.Data;
import org.testng.annotations.*;

public class Subtraction_test {
    Subtraction subtractionPage;

    @BeforeClass
    private void print() {
        System.out.println("Before class");
        subtractionPage = new Subtraction();
    }

    @AfterClass
    private void print1() {
        System.out.println("After class");
    }

    @Test(alwaysRun = true, dataProvider = "DivisionData", dataProviderClass = Data.class, groups = "1")
    private void subtract(double a, double b) {
        subtractionPage.subtract(a, b);
    }
}
