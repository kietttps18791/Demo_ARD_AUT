package pages;

import core.AppiumBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class TC_01 extends AppiumBase {
    AppiumBase appiumBase= new AppiumBase();

  public TC_01(){
    PageFactory.initElements(new AppiumFieldDecorator(driver),this);
  }
  @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
  private WebElement allow;
  @AndroidFindBy(id = "com.zzkko:id/p9")
  private WebElement goShopping;
  @AndroidFindBy(id = "com.zzkko:id/bqw")
  private WebElement confirm;
  @AndroidFindBy(id = "com.zzkko:id/asw")
  private WebElement googleContinue;
  @AndroidFindBy(xpath = "(//android.widget.LinearLayout[@resource-id='com.google.android.gms:id/container'])[1]")
  private WebElement account;
  @AndroidFindBy(id = "com.zzkko:id/bqw")
  private WebElement okBTT;
  @AndroidFindBy(id = "com.zzkko:id/bx9")
  private WebElement search;
  @AndroidFindBy(id = "com.zzkko:id/bxl")
  private WebElement shop;
  @AndroidFindBy(id = "com.zzkko:id/bxg")
  private WebElement category;
  @AndroidFindBy(id = "com.zzkko:id/bxh")
  private WebElement newinMenu;
  @AndroidFindBy(id = "com.zzkko:id/bxe")
  private WebElement cart;
  @AndroidFindBy(id = "com.zzkko:id/bxk")
  private WebElement me;
  public void gotoHomeScreen() {
    webDriverWait.until(ExpectedConditions.visibilityOf(allow));
    allow.click();
    webDriverWait.until(ExpectedConditions.visibilityOf(goShopping));
    goShopping.click();
    webDriverWait.until(ExpectedConditions.visibilityOf(confirm));
    confirm.click();
    webDriverWait.until(ExpectedConditions.visibilityOf(googleContinue));
    googleContinue.click();
    webDriverWait.until(ExpectedConditions.visibilityOf(account));
    account.click();
    webDriverWait.until(ExpectedConditions.visibilityOf(okBTT));
    okBTT.click();
  }
    public boolean verifySearch(){
        webDriverWait.until(ExpectedConditions.visibilityOf(search));
        return search.isDisplayed();
    }
    public boolean verifyCatagory(){
        webDriverWait.until(ExpectedConditions.visibilityOf(category));
        return category.isDisplayed();
    }
  public boolean verifyShop(){
    webDriverWait.until(ExpectedConditions.visibilityOf(shop));
    return shop.isDisplayed();
  }
    public boolean verifyNew(){
      webDriverWait.until(ExpectedConditions.visibilityOf(newinMenu));
      return newinMenu.isDisplayed();
    }
    public boolean verifyCart(){
      webDriverWait.until(ExpectedConditions.visibilityOf(cart));
      return cart.isDisplayed();
    }
    public boolean verifyMe(){
      webDriverWait.until(ExpectedConditions.visibilityOf(me));
      return me.isDisplayed();
    }
}
