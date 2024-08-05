package config;

import java.net.URL;
import org.aeonbits.owner.Config;

@Config.Sources({
    "classpath:testing.properties"
})

public interface WebDriverConfig extends Config {

  @Key("baseUrl")
  String getBaseUrl();


  @Key("browser")
  String getBrowser();

  @Key("remoteUrl")
  @DefaultValue("http://localhost:4444")
  URL getRemoteUrl();

  @Key("browserSize")
  String getBrowserSize();

  @Key("timeout")
  @DefaultValue("10000")
  Long getTimeout();

  @Key("isRemote")
  @DefaultValue("false")
  Boolean isRemote();

  @Key("LoadStrategy")
  @DefaultValue("eager")
  String pageLoadStrategy();

}
