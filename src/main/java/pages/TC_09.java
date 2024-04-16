package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class TC_09 extends AppiumBase {
    AppiumBase appiumBase= new AppiumBase();

  public TC_09(){
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
  @AndroidFindBy(id = "com.zzkko:id/bxk")
  private WebElement me;
  @AndroidFindBy(id = "com.zzkko:id/ah_")
  private WebElement giftCard;
  @AndroidFindBy(id = "com.zzkko:id/dqz")
  private WebElement cardNumber;
  @AndroidFindBy(id = "com.zzkko:id/ai4")
  private WebElement pin;
  @AndroidFindBy(xpath = "//android.widget.Button")
  private WebElement checkBalence;



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
    public void clickMe(){
      webDriverWait.until(ExpectedConditions.visibilityOf(me));
      me.click();
    }
    public void clickGiftcard(){
      webDriverWait.until(ExpectedConditions.visibilityOf(giftCard));
      giftCard.click();
    }
    public boolean verifyCardNumber(){
      webDriverWait.until(ExpectedConditions.visibilityOf(cardNumber));
      return cardNumber.isDisplayed();
    }
    public boolean verifyPIN(){
      webDriverWait.until(ExpectedConditions.visibilityOf(pin));
      return pin.isDisplayed();
    }
    public boolean verifyCheckBalence(){
      webDriverWait.until(ExpectedConditions.visibilityOf(checkBalence));
      return checkBalence.isDisplayed();
    }


}
