package tests;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import config.WebDriverConfig;
import java.net.URL;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPage;

public class TestBase {

  static WebDriverConfig webConfig = ConfigFactory.create(WebDriverConfig.class,System.getProperties());

  public static void testConfig() {
    Configuration.baseUrl = TestBase.webConfig.getBaseUrl();
    Configuration.browserSize = TestBase.webConfig.getBrowserSize();
    Configuration.browser = TestBase.webConfig.getBrowser();
    Configuration.pageLoadStrategy = TestBase.webConfig.pageLoadStrategy();
    URL remoteUrl = TestBase.webConfig.getRemoteUrl();
  }

  RegistrationPage registrationPage = new RegistrationPage();
  Faker faker = new Faker();
  String userName = faker.name().firstName();
  String lastName = faker.name().lastName();
  String userEmail = faker.internet().emailAddress();
  String userNumber = faker.phoneNumber().subscriberNumber(10);
  String currentAddress = faker.lebowski().quote();
  String userSubject = "English";

  @BeforeAll
  static void beforeAll() {
    TestBase.testConfig();
    }

}