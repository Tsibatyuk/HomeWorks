package Pages;

import BasePackage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazMainPage extends BasePage {
    public ZakazMainPage(WebDriver driver) {
        super(driver);
    }

    public static final String ADRESS = "https://novus.zakaz.ua/ru/products/04820171998793/pelmeni-laska-400g/";
    public static final String BTN_CLICK = "//span[text()='Добавить в корзину']";
    public static final String DONT_REMEMBER = "//li[@id='react-tabs-2']";
    public static final String REGION_SELECT_BTN = "//div[@class='RegionSelect css-2b097c-container']";
    public static final String KYIV_CHOOSE = "//div[text()='Киев']";
    public static final String STORE_CHOOSE = "//span[@class='jsx-2819847497 Radio__checkmark Radio__checkmark_checked']";
    public static final String SEND_KEYS = "//input[@id='pickup-city-store-482010105']";


    public WebElement storeChoose() {
        return getElementByXpath(STORE_CHOOSE);
    }

    public WebElement clickEnterBtn() {
        return getElementByXpath(SEND_KEYS);
    }

    public WebElement regionKyivSelect() {
        return getElementByXpath(KYIV_CHOOSE);
    }

    public WebElement regionSelectBtn() {
        return getElementByXpath(REGION_SELECT_BTN);
    }

    public WebElement choiseDdelivery() {
        return getElementByXpath(DONT_REMEMBER);
    }

    public WebElement addToCart() {
        return getElementByXpath(BTN_CLICK);
    }

    public void goToPelmeniLaska() {
        driver.get(ADRESS);
    }


    public WebElement clickAgreeBtn() {
        return getElementByXpath("//button[text()='Заборонити']");
    }

    public WebElement deliveryAdress() {
        return getElementByXpath("//div[text()='Адрес доставки']");
    }
}

