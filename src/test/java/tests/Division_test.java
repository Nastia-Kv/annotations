package tests;

import arithmetic.Division;
import data.Data;
import org.testng.annotations.*;

public class Division_test {
    Division divisionPage;

    @BeforeClass
    private void print() {
        System.out.println("Before class");
        divisionPage = new Division();
    }

    @AfterClass
    private void print1() {
        System.out.println("After class");
    }

    @Test(alwaysRun = true, dataProvider = "DivisionData", dataProviderClass = Data.class, groups = "2")
    private void divide(double a, double b) {
        divisionPage.divide(a, b);
    }
}
