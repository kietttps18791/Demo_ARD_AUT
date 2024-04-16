package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class TC_03 extends AppiumBase {
    AppiumBase appiumBase= new AppiumBase();

  public TC_03(){
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
  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Kitchen&Dining']")
  private WebElement bepvaphongan;
  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Home Decor']")
  private WebElement homeDecor;
  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Home Textile']")
  private WebElement detmay;
  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Home Appliances']")
  private WebElement hanggiadung;
  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Home Improvement']")
  private WebElement caitao;
  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Storage&Organization']")
  private WebElement storage;
  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Lighting ']")
  private WebElement lighting ;
  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bedding']")
  private WebElement bedding;
  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Event&Party Supplies']")
  private WebElement event;
  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bathroom']")
  private WebElement bathroom;
  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Pet Supplies']")
  private WebElement petSupplies;
  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Toys&Games']")
  private WebElement toysGames;

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
  public boolean verifyKitchen(){
    webDriverWait.until(ExpectedConditions.visibilityOf(bepvaphongan));
    return bepvaphongan.isDisplayed();
  }
  public boolean verifyHomeDecor(){
    webDriverWait.until(ExpectedConditions.visibilityOf(homeDecor));
    return homeDecor.isDisplayed();
  }
  public boolean verifyDetmay(){
    webDriverWait.until(ExpectedConditions.visibilityOf(detmay));
    return detmay.isDisplayed();
  }
  public boolean verifyCaithien(){
    webDriverWait.until(ExpectedConditions.visibilityOf(caitao));
    return caitao.isDisplayed();
  }
  public boolean verifyHanggiadung(){
    webDriverWait.until(ExpectedConditions.visibilityOf(hanggiadung));
    return hanggiadung.isDisplayed();
  }
  public boolean verifyStorage(){
    webDriverWait.until(ExpectedConditions.visibilityOf(storage));
    return storage.isDisplayed();
  }
  public boolean verifyLighting(){
    webDriverWait.until(ExpectedConditions.visibilityOf(lighting));
    return lighting.isDisplayed();
  }
  public boolean verifyBedding(){
    webDriverWait.until(ExpectedConditions.visibilityOf(bedding));
    return bedding.isDisplayed();
  }
  public boolean verifyEvent(){
    webDriverWait.until(ExpectedConditions.visibilityOf(event));
    return event.isDisplayed();
  }
  public boolean verifyBathroom(){
    webDriverWait.until(ExpectedConditions.visibilityOf(bathroom));
    return bathroom.isDisplayed();
  }
  public boolean verifyPet(){
    webDriverWait.until(ExpectedConditions.visibilityOf(petSupplies));
    return petSupplies.isDisplayed();
  }
  public boolean verifyToy(){
    webDriverWait.until(ExpectedConditions.visibilityOf(toysGames));
    return toysGames.isDisplayed();
  }
}
