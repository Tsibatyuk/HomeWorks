package Zakaz;

import HomeWorks.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class zakazTest extends TestInit {
    @Test
    public void zakazPelmeni() {
        ZakazMainPage zakazMainPage = new ZakazMainPage(driver);
        zakazMainPage.goToPelmeniLaska();
        zakazMainPage.addToCart().click();
        zakazMainPage.choiseDdelivery().click();
        zakazMainPage.regionSelectBtn().click();
        zakazMainPage.regionKyivSelect().click();
        zakazMainPage.clickAgreeBtn().click();

        Assert.assertTrue(zakazMainPage.deliveryAdress().isDisplayed());
    }

    @Test
    public void zakazPelmeni2() {
        ZakazMainPage zakazMainPage = new ZakazMainPage(driver);
        zakazMainPage.goToPelmeniLaska();
        zakazMainPage.addToCart().click();
        zakazMainPage.choiseDdelivery().click();
        zakazMainPage.regionSelectBtn().click();
        zakazMainPage.regionKyivSelect().click();
        zakazMainPage.clickAgreeBtn().click();

        Assert.assertTrue(zakazMainPage.deliveryAdress().isDisplayed());
    }
}


