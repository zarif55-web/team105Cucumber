Feature: 1002 Kullanici amazonda birden fazla urun aratir

  Scenario: TC02 Kullanici urunleri aratip test edebilmeli

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna Nutella yazip aratir
    And arama sonuclarinin Nutella icerdigini test eder


    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna Java yazip aratir
    And arama sonuclarinin Java icerdigini test eder


    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna Samsung yazip aratir
    And arama sonuclarinin Samsung icerdigini test eder
