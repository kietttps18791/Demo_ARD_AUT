package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class TC_08 extends AppiumBase {
    AppiumBase appiumBase= new AppiumBase();

  public TC_08(){
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
  @AndroidFindBy(id = "com.zzkko:id/ahc")
  private WebElement points;
  @AndroidFindBy(id = "com.zzkko:id/bpx")
  private WebElement gocheckin;
  @AndroidFindBy(xpath = "(//android.widget.LinearLayout[@resource-id='com.zzkko:id/emq'])[1]")
  private WebElement getPoints0to1000;
  @AndroidFindBy(xpath = "(//android.widget.LinearLayout[@resource-id='com.zzkko:id/emq'])[2]")
  private WebElement getPoints0to400;
  @AndroidFindBy(xpath = "(//android.widget.LinearLayout[@resource-id='com.zzkko:id/emq'])[3]")
  private WebElement getPoints5to60;


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
    public void clickPoints(){
      webDriverWait.until(ExpectedConditions.visibilityOf(points));
      points.click();
    }
    public boolean verifyGocheckin(){
      webDriverWait.until(ExpectedConditions.visibilityOf(gocheckin));
      return gocheckin.isDisplayed();
    }
    public boolean verifyPoints0to1000(){
      webDriverWait.until(ExpectedConditions.visibilityOf(getPoints0to1000));
      return getPoints0to1000.isDisplayed();
    }
    public boolean verifyPoints0to400(){
      webDriverWait.until(ExpectedConditions.visibilityOf(getPoints0to400));
      return getPoints0to400.isDisplayed();
    }
    public boolean verifyPoints5to60(){
      webDriverWait.until(ExpectedConditions.visibilityOf(getPoints5to60));
      return getPoints5to60.isDisplayed();
    }
}
