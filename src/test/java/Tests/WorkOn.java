package Tests;

import Pages.Hotline;
import TestInitPackage.TestInit;
import org.testng.annotations.Test;

public class WorkOn extends TestInit {
    @Test
    public void hotlineTest(){
        Hotline hotline = new Hotline(driver);
        hotline.goToHotline();
        hotline.muzInstrument();
        hotline.gitarsSectionSelect().click();


    }
}
