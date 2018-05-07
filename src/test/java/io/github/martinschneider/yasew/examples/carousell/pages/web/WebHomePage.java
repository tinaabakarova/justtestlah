package io.github.martinschneider.yasew.examples.carousell.pages.web;

import static com.codeborne.selenide.Selenide.open;

import io.github.martinschneider.yasew.configuration.Platform;
import io.github.martinschneider.yasew.examples.carousell.pages.LoginPage;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(Platform.WEB)
public class WebHomePage extends io.github.martinschneider.yasew.examples.carousell.pages.HomePage {

  private LoginPage login;

  @Override
  public LoginPage goToLogin() {
    open(configuration.getBaseUrl());
    super.goToLogin();
    return login;
  }
}
