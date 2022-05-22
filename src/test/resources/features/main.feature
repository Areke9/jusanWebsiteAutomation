Feature: jusan.kz website main page check

  @CheckWebsiteMainPageOpen
  Scenario: I can open jusan.kz
    Given check website main page text 'Одно приложение – много возможностей!'
    Then switch to customer type 'Для бизнеса'