package config;


import com.codeborne.selenide.Browser;
import com.codeborne.selenide.Configuration;
import java.net.URL;
import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config {

  @Key("baseUrl")
  @DefaultValue("https://demoqa.com")
  String getBaseUrl();


  @Key("browser")
  @DefaultValue("CHROME")
  Browser getBrowser();

  @Key("remoteUrl")
  @DefaultValue("http://localhost:4444")
  URL getRemoteUrl();

  @Key("browserVersion")
  @DefaultValue("100.0")
  String getBrowserVersion();

  @Key("browserSize")
  @DefaultValue("1920x1080")
  String getBrowserSize();

  @Key("timeout")
  @DefaultValue("10000")
  Long getTimeout();

  @Key("isRemote")
  @DefaultValue("false")
  Boolean isRemote();

  @Key("LoadStrategy")
  @DefaultValue("eager")
  Long pageLoadStrategy();

}
