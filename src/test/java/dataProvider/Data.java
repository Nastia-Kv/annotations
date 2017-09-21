package dataProvider;

import org.testng.annotations.DataProvider;

public class Data {

    @DataProvider(name = "MultiplicationData")
    public static Object[][] multiplicationData() {
        return new Object[][]{
                {1, 2},
                {3, 4}
        };
    }

    @DataProvider(name = "SubtractionData")
    public static Object[][] subtractionData() {
        return new Object[][]{
                {1, 2},
                {3, 4}
        };
    }


    @DataProvider(name = "DivisionData")
    public static Object[][] divisionData() {
        return new Object[][]{
                {1, 2},
                {3, 4}
        };
    }

}
