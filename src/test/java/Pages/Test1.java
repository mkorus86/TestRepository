package Pages;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

@Epic("Test epic")
@Feature("Test feature")

public class Test1 {
    @Test(groups = {"smoke","regresion"})
    @Story("This is skmoke test")
    @Description("This test will")
    public void testName() {

    }

    @Test(groups = {"regresion"})
    public void testName2() {
    }
}
