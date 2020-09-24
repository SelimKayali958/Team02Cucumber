@amazonArama
Feature: Amazon Arama
  @book
  Scenario: TestCase01 kullanici amazonda kitap arar
    Given kullanici amazon sayfasina gider
    And kullanici dropdown da Books secer
    And kullanici qa automation aramasi yapar
    And kullanici cikan sonucu yazdirir
    Then kullanici sayfayi kapatir

  @kindle
  Scenario:  TestCase02 kullanici amazonda kindle arar
    Given kullanici amazon sayfasina gider
    And kullanici dropdown da "Kindle Store" secer
    And kullanici "kindle tablet" aramasi yapar
    And kullanici cikan sonucu yazdirir
    Then kullanici driver kapatir