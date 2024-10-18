Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  @selamTag7
  Scenario: Selamlar7
    * Selam ver
    * Selam al

  @tekHataliTekrarBasarili7
  Scenario: TekHataliTekrarBasarili7
    * Selam ver
    * hatali ama tekrarda basarili

  @TodayNotFriday7
  Scenario Outline: Today is or is not Friday7
    Given today is "<day>"
    When I ask whether it's Friday yet
    Then I should be told "<answer>"

    Examples:
      | day            | answer |
      | Pazartesi      | Nope   |

