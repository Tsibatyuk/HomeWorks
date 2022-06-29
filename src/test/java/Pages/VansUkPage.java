package Pages;

import BasePackage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VansUkPage extends BasePage {
    public VansUkPage(WebDriver driver) {
        super(driver);
    }

    public static String VANS_MAIN_PAGE = "https://www.vans.co.uk/";
    public static String COOCKIE_ALLOWED_BTN_ERROR = "//button[@id='onetrust-accept-btn-handler1']";
    public static String COOCKIE_ALLOWED_BTN = "//button[@id='onetrust-accept-btn-handler']";
    public static String LIST_BTNS_FROM_THE_UP = "//ul[@role='menubar']/li";
    public static String WOMEN_BTN = "//*[text()='Women'][1]";


    public void goToVasSite() {
        driver.get(VANS_MAIN_PAGE);
    }

    public WebElement allowedBTN() {
        return driver.findElement(By.xpath(COOCKIE_ALLOWED_BTN));
    }

    public WebElement allowedBTNError() {
        return driver.findElement(By.xpath(COOCKIE_ALLOWED_BTN_ERROR));
    }

    public WebElement sectionWomenFromList() {
        return moveToWithExplicitWait(WOMEN_BTN);
    }


}
