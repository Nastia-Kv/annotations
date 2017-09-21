package tests;

import arithmetic.Addition;
import dataProvider.Data;
import org.testng.annotations.*;

public class Addition_test {
    Addition additionPage;

    //alwaysRun = true or groups = "1"
    @BeforeClass(groups = "1")
    private void print() {
        System.out.println("Before class");
        additionPage = new Addition();
    }

    @AfterClass
    private void print1() {
        System.out.println("After class");
    }

    @Test(alwaysRun = true, dataProvider = "AdditionData", groups = "1")
    private void add(double a, double b) {
        additionPage.add(a, b);
    }

    @DataProvider(name = "AdditionData")
    public static Object[][] additionData() {
        return new Object[][]{
                {1, 2},
                {3, 4}
        };
    }

}

