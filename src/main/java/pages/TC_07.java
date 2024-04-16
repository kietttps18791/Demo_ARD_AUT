package pages;

import core.AppiumBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class TC_07 extends AppiumBase {
  AppiumBase appiumBase = new AppiumBase();

  public TC_07() {
    PageFactory.initElements(new AppiumFieldDecorator(driver), this);
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
  @AndroidFindBy(id = "com.zzkko:id/e99")
  private WebElement inputsearch;
  @AndroidFindBy(id = "com.zzkko:id/qp")
  private WebElement btsearch;
  @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]")
  private WebElement secondProd;
  @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.zzkko:id/ec3'])[1]")
  private WebElement clickSizeProduct;
  @AndroidFindBy(id = "com.zzkko:id/gk")
  private WebElement add1QTY;
  @AndroidFindBy(id = "com.zzkko:id/bte")
  private WebElement addtoCart;
  @AndroidFindBy(id = "com.zzkko:id/abm")
  private WebElement clickCart;
  @AndroidFindBy(id = "com.zzkko:id/mr")
  private WebElement checkout;
  @AndroidFindBy(xpath = "(//android.widget.RadioButton[@resource-id='com.zzkko:id/c_k'])[2]")
  private WebElement payCredit;
  @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Submit\"]/android.widget.Button")
  private WebElement placeOrder;
  @AndroidFindBy(id = "com.zzkko:id/rk")
  private WebElement clickOK;
  @AndroidFindBy(id = "com.zzkko:id/can")
  private WebElement cardNumber;
  @AndroidFindBy(id = "com.zzkko:id/cay")
  private WebElement expireDate;
  @AndroidFindBy(id = "com.zzkko:id/cav")
  private WebElement cvv;
  @AndroidFindBy(id = "com.zzkko:id/c_c")
  private WebElement billingAddress;
  @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]")
  private WebElement orderNumber;
  @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]")
  private WebElement subtotal;
  @AndroidFindBy(id = "com.zzkko:id/d74")
  private WebElement placeOrtherinPayment;

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

  public void search() {
    webDriverWait.until(ExpectedConditions.visibilityOf(search));
    search.click();
    webDriverWait.until(ExpectedConditions.visibilityOf(inputsearch));
    inputsearch.sendKeys("Iphone");
    webDriverWait.until(ExpectedConditions.visibilityOf(btsearch));
    btsearch.click();
  }

  public void secondPrd() throws InterruptedException {
    webDriverWait.until(ExpectedConditions.visibilityOf(secondProd));
    secondProd.click();
    Thread.sleep(2000);
  }

  public void clickFirstSize() {
    appiumBase.swipeMobileUp((AndroidDriver) driver);
    webDriverWait.until(ExpectedConditions.visibilityOf(clickSizeProduct));
    clickSizeProduct.click();
  }

  public void addQTY() {
    webDriverWait.until(ExpectedConditions.visibilityOf(add1QTY));
    add1QTY.click();
  }

  public void clickAddToCart() {
    webDriverWait.until(ExpectedConditions.visibilityOf(addtoCart));
    addtoCart.click();
  }
  public void clickCart() {
    webDriverWait.until(ExpectedConditions.visibilityOf(clickCart));
    clickCart.click();
  }
  public void clickCheckout() {
    webDriverWait.until(ExpectedConditions.visibilityOf(checkout));
    checkout.click();
    webDriverWait.until(ExpectedConditions.visibilityOf(checkout));
    checkout.click();
  }
  public void clickCredit() {
    webDriverWait.until(ExpectedConditions.visibilityOf(payCredit));
    payCredit.click();
  }
  public void clickPlaceOrder() {
    webDriverWait.until(ExpectedConditions.visibilityOf(placeOrder));
    placeOrder.click();
//    webDriverWait.until(ExpectedConditions.visibilityOf(clickOK));
//    clickOK.click();
  }
  public boolean verifyCardnumber() {
    webDriverWait.until(ExpectedConditions.visibilityOf(cardNumber));
    return cardNumber.isDisplayed();
  }
  public boolean verifyExpireDate() {
    webDriverWait.until(ExpectedConditions.visibilityOf(expireDate));
    return expireDate.isDisplayed();
  }
  public boolean verifyCVV() {
    webDriverWait.until(ExpectedConditions.visibilityOf(cvv));
    return cvv.isDisplayed();
  }
  public boolean verifyBillingAddress() {
    webDriverWait.until(ExpectedConditions.visibilityOf(billingAddress));
    return billingAddress.isDisplayed();
  }
  public boolean verifyOrderNumber() {
    webDriverWait.until(ExpectedConditions.visibilityOf(orderNumber));
    return orderNumber.isDisplayed();
  }
  public boolean verifySubtotal() {
    webDriverWait.until(ExpectedConditions.visibilityOf(subtotal));
    return subtotal.isDisplayed();
  }
  public boolean verifyPlaceorder() {
    webDriverWait.until(ExpectedConditions.visibilityOf(placeOrtherinPayment));
    return placeOrtherinPayment.isDisplayed();
  }
}
//+ Card number textbox
//        + Expire Date
//        + CVV
//        + Billing address
//        + Order number
//        + Subtotal
//        + Place order button
