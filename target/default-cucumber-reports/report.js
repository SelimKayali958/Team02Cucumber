$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ebayArama.feature");
formatter.feature({
  "name": "Ebay Arama",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ebayArama"
    }
  ]
});
formatter.scenario({
  "name": "TestCase05 kulanici ebayde kindle arar",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ebayArama"
    },
    {
      "name": "@ebay02"
    }
  ]
});
formatter.step({
  "name": "kullanici ebay gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.EbayAramaStepDefinitions.kullanici_ebay_gider()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "kullanici \"kindle\" aramasi yapar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AmazonAramaStepDefinitions.kullanici_aramasi_yapar(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "kullanici ebay sonucu yazdirir",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.EbayAramaStepDefinitions.kullanici_ebay_sonucu_yazdirir()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "kullanici driver kapatir",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.EbayAramaStepDefinitions.kullanici_driver_kapatir()"
});
formatter.result({
  "status": "skipped"
});
});