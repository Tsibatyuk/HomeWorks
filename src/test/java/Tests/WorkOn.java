package Tests;

import Pages.Hotline;
import TestInitPackage.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class WorkOn extends TestInit {
    @Test
    public void hotlineTest(){
        Hotline hotline = new Hotline(driver);
        hotline.goToHotline();
        hotline.muzInstrument();
        hotline.gitarsSectionSelect().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        hotline.getBowedInstrument().get(2).click();


    }
}
