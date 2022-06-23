package Tests;

import Pages.VansUkPage;
import TestInitPackage.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DlyaAndriya extends TestInit {
    @Test
    public void vansTestBtn() {
        VansUkPage vansUkPage = new VansUkPage(driver);
        vansUkPage.goToVasSite();
        vansUkPage.allowedBTN().click();
        vansUkPage.sectionWomenFromList().getAttribute("text");       {

            boolean color = (vansUkPage.sectionWomenFromList().getCssValue("color")).equals("rgba(203, 27, 44, 1)") ;{
                Assert.assertEquals(vansUkPage.sectionWomenFromList().getCssValue("color"),"rgba(203, 27, 44, 1)");
                Assert.assertTrue(color);
                System.out.println("Color of a button : red");
            }


            //sleep(5);

        }

    }
}