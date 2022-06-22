package Pages;

import BasePackage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Hotline extends BasePage {
    int numberOflistElement;
    public Hotline(WebDriver driver) {
        super(driver);
    }
    public static final String HOTLINE_ADRESS = "https://hotline.ua/";
    public static final String LEFT_MENU_LIST = "//i[@class='icon-menu icon-menu-musical_instruments']";
    public static final String GITARS_BTN = "//span[contains(text(), 'Гітари')]";
    public static final String INSTRUMENT_LIST = "//li[@class='category-navigation__item hidden-below-lg']";


    public void goToHotline(){
         driver.get(HOTLINE_ADRESS);    }
    public WebElement muzInstrument(){
        return moveToWithExplicitWait(LEFT_MENU_LIST);}
    public WebElement gitarsSectionSelect(){
        return getElementByXpath(GITARS_BTN);
    }
    public List<WebElement> getBowedInstrument(){
        return getElementsClickAble(INSTRUMENT_LIST);
    }

}
