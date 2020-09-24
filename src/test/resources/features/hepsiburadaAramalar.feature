@hepsiburada
Feature: hepsiburada arama
  @cokluArama
  Scenario Outline: TestCase03 kullanici hepsiburada da coklu arama yapar
    Given kullanici hepsiburada sayfasina gider
    And kullanici "<urunler>" yapar
    And kullanici urunlerin sonucunu yazdirir
    Then kullanici sayfalari kapatir

    Examples: Urun isimleri
    |urunler|
    |sehpa  |
    |at     |
    |dolma kalem|
    |defter     |
    |tv  |
    |iphone     |
    |samsung    |

