Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  @selamTag
  Scenario: Selamlar
    * Selam ver
    * Selam al

  @tekHataliTekrarBasarili
  Scenario: TekHataliTekrarBasarili
    * Selam ver
    * hatali ama tekrarda basarili

  @selamTag'li
  Scenario: Selamlar'li
    * Selam ver
    * Selam al

  @tekHataliTekrarBasarili'li
  Scenario: TekHataliTekrarBasarili'li
    * Selam ver
    * hatali ama tekrarda basarili

  @TodayNotFridayZ
  Scenario Outline: Today is or is not Friday
    Given today is "<day>"
    When I ask whether it's Friday yet
    Then I should be told "<answer>"

    Examples:
      | day            | answer |
      | Friday         | TGIF   |


