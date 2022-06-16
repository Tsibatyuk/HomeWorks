package HomeWorks;

import org.testng.annotations.Test;

public class WorkForTest extends TestInit {

    @Test
    public void testWork() {
        PageObjects pageObjects = new PageObjects(driver);
        pageObjects.goToGoogle();
        pageObjects.toSearchField().click();
        pageObjects.toSearchField().sendKeys("JOJO bizarre\n");
        pageObjects.getWikiLink().click();
    }

    @Test
    public void amazonTest() {
        AmazonPageObjects amazonPageObjects = new AmazonPageObjects(driver);
        amazonPageObjects.goToAmazon();
        amazonPageObjects.clickToLeftMenu().get(2).click();
        amazonPageObjects.sectionElectronic().get(6).click();
        amazonPageObjects.videoGameSection().click();
        amazonPageObjects.xboxSection().click();
        amazonPageObjects.consoleChoose().click();
        amazonPageObjects.gamePadSelect().get(0).click();
        amazonPageObjects.toWhiteGamepadBtn().click();
        amazonPageObjects.buyOptionBtn().get(0).click();


    }

    @Test
    public void rozetkaTest() {
        RozetkaObjectsPage rozetkaObjectsPage = new RozetkaObjectsPage(driver);
        rozetkaObjectsPage.goToRozetka();
        rozetkaObjectsPage.menuBtn().click();
        rozetkaObjectsPage.smartPhonesListSection();
        rozetkaObjectsPage.aparatsSectionChoose().get(1).click();
        rozetkaObjectsPage.nikonFilterBtn().get(7).click();
        rozetkaObjectsPage.sortingList().click();
        rozetkaObjectsPage.getPromotionOption().click();
        rozetkaObjectsPage.bestSalesObject().click();
        rozetkaObjectsPage.buyBtn().click();
        rozetkaObjectsPage.cycle(5);




    }


}
