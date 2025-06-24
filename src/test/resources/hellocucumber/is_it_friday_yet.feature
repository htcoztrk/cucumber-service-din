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

  @selamTag'deneme2
  Scenario: Selamlar
    * Selam ver
    * Selam al

  @tekHataliTekrarBasarili'deneme
  Scenario: TekHataliTekrarBasarili
    * Selam ver
    * hatali ama tekrarda basarili

  @TodayNotFriday
  Scenario Outline: Today is or is not Friday
    Given today is "<day>"
    When I ask whether it's Friday yet
    Then I should be told "<answer>"

    Examples:
      | day            | answer |
      | Friday         | TGIF   |


