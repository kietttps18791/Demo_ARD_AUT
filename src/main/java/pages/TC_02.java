package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class TC_02 extends AppiumBase {
    AppiumBase appiumBase= new AppiumBase();

  public TC_02(){
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
  @AndroidFindBy(id = "com.zzkko:id/bxg")
  private WebElement category;
  @AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[@text='Đầm']")
  private WebElement dam_category;
  @AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[@text='Áo']")
  private WebElement shirt_caregory;
  @AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[@text='Đồ đi biển']")
  private WebElement dodibien_category;
  @AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[@text='Phụ kiện']")
  private WebElement phukien_category;
  @AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[@text='Trang sức']")
  private WebElement trangsuc_category;
  @AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[@text='Túi']")
  private WebElement tui_category;
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

    public void clickCategory(){
        webDriverWait.until(ExpectedConditions.visibilityOf(category));
        category.click();
    }
  public boolean verifyDam(){
    webDriverWait.until(ExpectedConditions.visibilityOf(dam_category));
    return dam_category.isDisplayed();
  }
  public boolean verifyAo(){
    webDriverWait.until(ExpectedConditions.visibilityOf(shirt_caregory));
    return shirt_caregory.isDisplayed();
  }
  public boolean verifyDodibien(){
    webDriverWait.until(ExpectedConditions.visibilityOf(dodibien_category));
    return dodibien_category.isDisplayed();
  }
  public boolean verifyPhukien(){
    webDriverWait.until(ExpectedConditions.visibilityOf(phukien_category));
    return phukien_category.isDisplayed();
  }
  public boolean verifyTrangsuc(){
    webDriverWait.until(ExpectedConditions.visibilityOf(trangsuc_category));
    return trangsuc_category.isDisplayed();
  }
  public boolean verifyTui(){
    webDriverWait.until(ExpectedConditions.visibilityOf(tui_category));
    return tui_category.isDisplayed();
  }


}
