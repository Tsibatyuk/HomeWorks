package Pages;

import BasePackage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects extends BasePage {
    public PageObjects(WebDriver driver) {
        super(driver);
    }
    public static final String GOOGLE_ADRESS = "https://google.com.ua";
    public static final String SEARCH_FIELD = "//input[@class='gLFyf gsfi']";
    public static final String LINK_TO_WIKI = "//*[contains(text(),' Bizarre Adventure - Википедия')]";





    public void goToGoogle(){        driver.get(GOOGLE_ADRESS);    }
    public WebElement toSearchField(){return getElementByXpath(SEARCH_FIELD);}
    public WebElement getWikiLink(){return getElementByXpath(LINK_TO_WIKI);}




}
