package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class TC_04 extends AppiumBase {
    AppiumBase appiumBase= new AppiumBase();

  public TC_04(){
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
  @AndroidFindBy(id = "com.zzkko:id/oy")
  private WebElement filter;
  @AndroidFindBy(xpath = "//android.widget.TextView[@text='New']")
  private WebElement newfilter;
  @AndroidFindBy(xpath = "//android.view.ViewGroup[4]//android.widget.TextView[@resource-id='com.zzkko:id/dz6']")
  private WebElement firstCategory;
  @AndroidFindBy(id = "com.zzkko:id/dp8")
  private WebElement done;
  @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")
  private WebElement secondProduct;
  @AndroidFindBy(id = "com.zzkko:id/al9")
  private WebElement image;
  @AndroidFindBy(id = "com.zzkko:id/dv0")
  private WebElement price;
  @AndroidFindBy(id = "com.zzkko:id/gd")
  private WebElement qty;
  @AndroidFindBy(id = "com.zzkko:id/bte")
  private WebElement addtocart;

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
    public void clickFilter(){
      webDriverWait.until(ExpectedConditions.visibilityOf(filter));
      filter.click();
    }
    public void selectFilterNew(){
      webDriverWait.until(ExpectedConditions.visibilityOf(newfilter));
      newfilter.click();
    }
    public void clickFirstCategory(){
      webDriverWait.until(ExpectedConditions.visibilityOf(firstCategory));
      firstCategory.click();
    }
    public void clickDone(){
      webDriverWait.until(ExpectedConditions.visibilityOf(done));
      done.click();
    }
    public void clickSecondProduct(){
      webDriverWait.until(ExpectedConditions.visibilityOf(secondProduct));
      secondProduct.click();
    }

    public boolean verifyImage(){
      webDriverWait.until(ExpectedConditions.visibilityOf(image));
      return   image.isDisplayed();
   }
    public boolean verifyPrice(){
      webDriverWait.until(ExpectedConditions.visibilityOf(price));
      return   price.isDisplayed();
    }
    public boolean verifyQTY(){
      webDriverWait.until(ExpectedConditions.visibilityOf(qty));
      return   qty.isDisplayed();
    }
    public boolean verifyAddtocart(){
      webDriverWait.until(ExpectedConditions.visibilityOf(addtocart));
      return   addtocart.isDisplayed();
    }

}
