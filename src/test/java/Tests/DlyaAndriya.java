package Tests;

import Pages.VansUkPage;
import TestInitPackage.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DlyaAndriya extends TestInit {
    @Test
    public void vansTestBtn() throws InterruptedException {
        VansUkPage vansUkPage = new VansUkPage(driver);
        vansUkPage.goToVasSite();
        sleep(5);
        try{
            vansUkPage.allowedBTNError().click();
        } catch (NoSuchElementException e) {
            vansUkPage.allowedBTN().click();
            System.out.println("We made this");

        }

        sleep(2);
        vansUkPage.sectionWomenFromList().getAttribute("text");{

            boolean color = (vansUkPage.sectionWomenFromList().getCssValue("color")).equals("rgba(203, 27, 44, 1)") ;{
                Assert.assertEquals(vansUkPage.sectionWomenFromList().getCssValue("color"),"rgba(203, 27, 44, 1)");
                Assert.assertTrue(color);
                System.out.println("Color of a button : red");
            }




        }

    }
}