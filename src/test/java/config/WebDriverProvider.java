package config;

import com.codeborne.selenide.Configuration;
import java.net.URL;
import org.aeonbits.owner.ConfigFactory;

public class WebDriverProvider {

  static WebDriverConfig webConfig = ConfigFactory.create(WebDriverConfig.class,System.getProperties());

  public static void testConfig() {
    Configuration.baseUrl = WebDriverProvider.webConfig.getBaseUrl();
    Configuration.browserSize = WebDriverProvider.webConfig.getBrowserSize();
    Configuration.browser = WebDriverProvider.webConfig.getBrowser();
    Configuration.pageLoadStrategy = WebDriverProvider.webConfig.pageLoadStrategy();
    URL remoteUrl = WebDriverProvider.webConfig.getRemoteUrl();
}

}
