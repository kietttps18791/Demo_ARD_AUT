package steps;

import core.AppiumBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.net.MalformedURLException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ServiceHooks {

  AppiumBase appiumBase = new AppiumBase();

  @Before
  public void initTest() throws MalformedURLException {
    appiumBase.createDriver();
  }

  @After
  public void afterScenario(Scenario scenario) {
    if (scenario.isFailed()) {
      scenario.attach(((TakesScreenshot) AppiumBase.driver).getScreenshotAs(OutputType.BYTES),
          "image/png", "demio");
    }
    appiumBase.closeDriver();
  }
}
