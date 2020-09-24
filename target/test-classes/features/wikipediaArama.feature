@wikipediaArama
Feature: Wikipedia Arama
  Scenario Outline: TestCase08 kullanici wikipediada arama yapar
    Given kullanici wikipedia "https://www.wikipedia.org" sayfasina gider
    And kullanici wikipedia dropdownda dil "<searchLanguage>" secer
    And kullanici farkli dillerde "<at>" arar
    And kullanici sayfa basligini yazdirir
    Then kullanici wikipedia sayfasini kapatir

    Examples: Farkli dillerde at

    |searchLanguage|at|
    |English       |horse|
    |Cymraeg       |ceffyl |
    |Deutsch       |pferde |
    |Italiano      |cavallo|
    |Hrvatski     |konj  |


