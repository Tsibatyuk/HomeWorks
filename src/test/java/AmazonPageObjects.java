import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AmazonPageObjects extends BasePage{
    public AmazonPageObjects(WebDriver driver) {
        super(driver);
    }
    public static final String AMAZON_ADRESS = "https://amazon.com";
    public static final String LEFT_LIST = "//div[@class='nav-left']";

    public static final String ELECTRONIC_SECTION = "//ul[@data-menu-id='1']/li";
    public static final String VIDEO_GAME_SECTION = "//*[text()='Video Game Consoles & Accessories']";
    public static final String XBOX_ONE = "//span[text()='Xbox One']";
    public static final String CONSOLE = "//span[text()='Consoles']";
    public static final String GAMEPADE = "//div[@data-asin='B099H65X5D']";
    public static final String WHITE_GAMEPAD = "//li[@id='color_name_1']";
    public static final String BUY_OPTION = "//div[@id='exports_desktop_unqualifiedBuybox_all_buying_options_cta_feature_div']";
    public static final String ADD_TO_CART = "//span[@id='a-autoid-2-offer-1']";
    public static final String QUANTITY_BTN = "//span[@id='aod-offer-qty-button-1-announce']";







    public void goToAmazon(){driver.get(AMAZON_ADRESS);}
    public List<WebElement> clickToLeftMenu() {return getElementsByXpath(LEFT_LIST);}
    public List<WebElement> sectionElectronic(){return getElementsByXpath(ELECTRONIC_SECTION);}
    public WebElement videoGameSection(){return getElementByXpath(VIDEO_GAME_SECTION);}
    public WebElement xboxSection(){return getElementByXpath(XBOX_ONE);}
    public WebElement consoleChoose(){return getElementByXpath(CONSOLE);}
    public List<WebElement> gamePadSelect(){return getElementsByXpath(GAMEPADE);}
    public WebElement toWhiteGamepadBtn(){return getElementByXpath(WHITE_GAMEPAD);}
    public List<WebElement> buyOptionBtn(){return getElementsByXpath(BUY_OPTION);}
    public WebElement addToCartBtn(){return getElementByXpath(ADD_TO_CART);}
    public WebElement quantityBtn(){return getElementByXpath(QUANTITY_BTN);}



}
