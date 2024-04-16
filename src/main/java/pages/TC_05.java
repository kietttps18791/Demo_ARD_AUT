package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class TC_05 extends AppiumBase {
    AppiumBase appiumBase= new AppiumBase();

  public TC_05(){
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
  @AndroidFindBy(id = "com.zzkko:id/action_me_settings")
  private WebElement btSetting;
  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Address Book']")
  private WebElement addressBook;
  @AndroidFindBy(id = "com.zzkko:id/ko")
  private WebElement addashipping;
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
    public void clickSetting(){
      webDriverWait.until(ExpectedConditions.visibilityOf(btSetting));
      btSetting.click();
    }
    public void clickAddressBook(){
      webDriverWait.until(ExpectedConditions.visibilityOf(addressBook));
      addressBook.click();
    }
    public boolean verifyAddaShipping(){
      webDriverWait.until(ExpectedConditions.visibilityOf(addashipping));
      return addashipping.isDisplayed();
    }
}
