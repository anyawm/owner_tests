package tests;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import config.WebDriverProvider;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPage;

public class TestBase {

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
    WebDriverProvider.testConfig();
    }

}