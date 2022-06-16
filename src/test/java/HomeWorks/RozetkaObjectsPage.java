package HomeWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class RozetkaObjectsPage extends BasePage{
    int numbers = 5;
    public RozetkaObjectsPage(WebDriver driver) {
        super(driver);
    }
    public static final String ROZETKA_LINK = "https://rozetka.com.ua/ua/";
    public static final String MENU_BTN = "//button[@id='fat-menu']";
    public static final String SMARTPHONES_SECTION = "//ul[@class='menu-categories ng-star-inserted']//a[text()='Смартфони, ТВ і електроніка']";
    public static final String CAMERAS_SECTION = "//a[text()=' Фотоапарати ']";
    public static final String NIKON_FILTER = "//a[@class='checkbox-filter__link']";
    public static final String SORTING_LIST = "//select[@class='select-css ng-untouched ng-pristine ng-valid ng-star-inserted']";
    public static final String PROMOTION_OPTION = "//option[@value='5: action']";
    public static final String BEST_SALES = "//a[@title='Фотоапарат Nikon D5600 AF-P 18-55mm f/3.5-5.6G VR Black (VBA500K001)']";
    public static final String BUY = "//app-product-buy-btn[@class='product__buy']";
    public static final String QUANTITY_ADD = "//button[@data-testid='cart-counter-increment-button']";






    public void goToRozetka(){ driver.get(ROZETKA_LINK);}
    public WebElement menuBtn(){return getElementByXpath(MENU_BTN);}
    public WebElement smartPhonesListSection(){ return moveTo(SMARTPHONES_SECTION);}
    public List<WebElement> aparatsSectionChoose(){return getElementsByXpath(CAMERAS_SECTION);}
    public List<WebElement> nikonFilterBtn(){return getElementsByXpath(NIKON_FILTER);}
    public WebElement sortingList(){return getElementByXpath(SORTING_LIST);}
    public WebElement getPromotionOption(){return getElementByXpath(PROMOTION_OPTION);}
    public WebElement bestSalesObject(){return getElementByXpath(BEST_SALES);}
    public WebElement buyBtn(){return getElementByXpath(BUY);}
    public WebElement addQuantityBtn(){return getClickAbleElementByXpath(QUANTITY_ADD);}
    public void cycle(int number){
        this.number= number;
        for (int i = 0; i <= number; i++) {
            addQuantityBtn().click();


        }
    }



}
