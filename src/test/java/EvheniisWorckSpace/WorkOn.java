package EvheniisWorckSpace;

import HomeWorks.AmazonPageObjects;
import HomeWorks.TestInit;
import org.testng.annotations.Test;

@Test
public class WorkOn extends TestInit {
    public void amazonShoping(){
        AmazonPageObjects amazonPageObjects = new AmazonPageObjects(driver);
        amazonPageObjects.goToAmazon();

    }
}
