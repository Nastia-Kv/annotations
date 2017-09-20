package tests;

import arithmetic.Addition;
import data.Data;
import org.testng.annotations.*;

public class Addition_test {
    Addition additionPage;

    @BeforeClass
    private void print() {
        System.out.println("Before class");
        additionPage = new Addition();
    }

    @AfterClass
    private void print1() {
        System.out.println("After class");
    }

    @Test(alwaysRun = true, dataProvider = "AdditionData", dataProviderClass = Data.class, groups = "1")
    private void add(double a, double b) {
        additionPage.add(a, b);
    }

}

