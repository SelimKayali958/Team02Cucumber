Feature: Amazon Arama
  Scenario: TestCase01 kullanici amazonda kitap arar
    Given kullanici amazon sayfasina gider
    And kullanici dropdown da Books secer
    And kullanici qa automation aramasi yapar
    And kullanici cikan sonucu yazdirir
    Then kullanici sayfayi kapatir