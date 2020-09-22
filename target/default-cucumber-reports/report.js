$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/amazonArama.feature");
formatter.feature({
  "name": "Amazon Arama",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TestCase01 kullanici amazonda kitap arar",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "kullanici amazon sayfasina gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.AmazonAramaStepDefinitions.kullanici_amazon_sayfasina_gider()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici dropdown da Books secer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AmazonAramaStepDefinitions.kullanici_dropdown_da_Books_secer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici qa automation aramasi yapar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AmazonAramaStepDefinitions.kullanici_qa_automation_aramasi_yapar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici cikan sonucu yazdirir",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AmazonAramaStepDefinitions.kullanici_cikan_sonucu_yazdirir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici sayfayi kapatir",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.AmazonAramaStepDefinitions.kullanici_sayfayi_kapatir()"
});
formatter.result({
  "status": "passed"
});
});