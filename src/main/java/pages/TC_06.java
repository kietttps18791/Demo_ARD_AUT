package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class TC_06 extends AppiumBase {
    AppiumBase appiumBase= new AppiumBase();

  public TC_06(){
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
  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Nhà']")
  private WebElement home;
  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Home Appliances']")
  private WebElement hanggiadung;
  @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")
  private WebElement secondProduc;
  @AndroidFindBy(id = "com.zzkko:id/bte")
  private WebElement addtocart;
  @AndroidFindBy(id = "com.zzkko:id/cu4")
  private WebElement clickCart;
  @AndroidFindBy(id = "com.zzkko:id/mr")
  private WebElement checkOut;
  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"unselected option Cash On Delivery    \"]//android.widget.RadioButton")
  private WebElement cashondelivery;
  @AndroidFindBy(xpath = "//android.widget.Button[@text='CONTINUE TO PAYMENT']")
  private WebElement continuetodelivery;
  @AndroidFindBy(id = "com.zzkko:id/d37")
  private WebElement text;
  @AndroidFindBy(id = "com.zzkko:id/d32")
  private WebElement phoneNumber;
  @AndroidFindBy(id = "com.zzkko:id/a2c")
  private WebElement verifyCode;
  @AndroidFindBy(id = "com.zzkko:id/sh")
  private WebElement verifyTextCannot;

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

    public void clickNha(){
        webDriverWait.until(ExpectedConditions.visibilityOf(home));
        home.click();
    }
    public void clickHanggiadung(){
      webDriverWait.until(ExpectedConditions.visibilityOf(hanggiadung));
      hanggiadung.click();
    }
    public void clickSecondProduct(){
      webDriverWait.until(ExpectedConditions.visibilityOf(secondProduc));
      secondProduc.click();
    }
    public void clickAddtoCart(){
      webDriverWait.until(ExpectedConditions.visibilityOf(addtocart));
      addtocart.click();
    }
    public void clickCart(){
      webDriverWait.until(ExpectedConditions.visibilityOf(clickCart));
      clickCart.click();
    }
    public void clickCheckout(){
      webDriverWait.until(ExpectedConditions.visibilityOf(checkOut));
      checkOut.click();
      webDriverWait.until(ExpectedConditions.visibilityOf(checkOut));
      checkOut.click();
    }
    public void selectCashOnDelivery(){
      webDriverWait.until(ExpectedConditions.visibilityOf(cashondelivery));
      cashondelivery.click();
    }
    public void clickContinue(){
      webDriverWait.until(ExpectedConditions.visibilityOf(continuetodelivery));
      continuetodelivery.click();
    }
  public boolean verifyText(){
    webDriverWait.until(ExpectedConditions.visibilityOf(text));
   return text.isDisplayed();
  }
  public boolean verifyPhoneNumber(){
    webDriverWait.until(ExpectedConditions.visibilityOf(phoneNumber));
    return phoneNumber.isDisplayed();
  }
  public boolean verifyCode(){
    webDriverWait.until(ExpectedConditions.visibilityOf(verifyCode));
    return verifyCode.isDisplayed();
  }
  public boolean verifyTextCannot(){
    webDriverWait.until(ExpectedConditions.visibilityOf(verifyTextCannot));
    return verifyTextCannot.isDisplayed();
  }


}
