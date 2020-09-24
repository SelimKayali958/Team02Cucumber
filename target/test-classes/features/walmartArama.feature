@walmartArama
Feature: Walmartda arama
  Scenario Outline: TestCase07 kullanici walmartta aramalar yapar
    Given kullanici "https://www.walmart.com" sayfasina gider
    And kulanici walmart aramakutusunda "<urunler>" arar
    And kullanici walmartda cikan sonucu yazdirir
    Then kullanici walmart sayfasini kapatir

    Examples: Aranacak urunler

    |urunler|
    |atlas  |
    |ipad   |
    |strawberry|
    |horse     |

