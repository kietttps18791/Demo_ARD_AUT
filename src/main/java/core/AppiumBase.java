package core;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.datatable.DataTable;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppiumBase {

  public static WebDriver driver;
  public static WebDriverWait webDriverWait;

  public void createDriver() throws MalformedURLException{
    UiAutomator2Options uiAutomator2Options = new UiAutomator2Options()
        .setPlatformName("Android")
        .setUdid("emulator-5554")
        .setAppPackage("com.zzkko")
        .setAppActivity("com.shein.welcome.WelcomeActivity");
    driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),uiAutomator2Options);
    webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));

  }
  public void swipeMobileUp(AndroidDriver driver){
    Dimension size = driver.manage().window().getSize();
    int starty = (int) (size.height * 0.8);
    int endy = (int) (size.height * 0.2);
    int startx = size.width / 2;
    swipe(startx,starty,startx,endy,driver);
  }
      public void swipeMobileDown(AndroidDriver driver){
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.8);
        int endy = (int) (size.height * 0.2);
        int startx = size.width / 2;
        swipe(startx,endy,startx,starty,driver);
    }
  public void swipe(int startx, int starty, int endx,int endy, AndroidDriver driver){
    new TouchAction(driver).longPress(PointOption.point(startx,starty))
            .moveTo(PointOption.point(endx,endy))
            .release().perform();
  }

public  void closeDriver(){
    driver.quit();
}
}
