@ebayArama
Feature: Ebay Arama
  @ebay01
  Scenario: TestCase04 kullanici ebayde kitap arar
    Given kullanici ebay gider
    And kullanici  tester kitabi arar
    And kullanici kitap sonucunu yazdirir
    Then kullanici driver kapatir
  @ebay02
  Scenario: TestCase05 kulanici ebayde kindle arar
    Given kullanici ebay gider
    And kullanici "kindle" aramasi yapari
    And kullanici ebay sonucu yazdirir
    Then kullanici driver kapatir

  @ebay03
  Scenario Outline: TestCase06 kullanici ebayde coklu arama yapar
    Given kullanici ebay gider
    And kullanici "<urun>" aramasi yapari
    And kullanici ebay sonucu yazdirir
    Then kullanici driver kapatir

    Examples: Urunler
    |urun|
    |samsung|
    |at     |
    |bag    |
    |video  |
    |pc     |
