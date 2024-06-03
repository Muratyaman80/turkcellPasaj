Feature: Negatif01
  Scenario:
    Given Web sitesine git
    Then Arama kutusunda "kablo" kelimesi arat
    And Arama sonuclarindan bir urun sec
    And Secilen urunu sepete ekle
    And Giris yapmadan devam et
    And Siparise devam et
    And Siparisin gerceklesmedigini dogrula
    Then Sayfayi kapatir








