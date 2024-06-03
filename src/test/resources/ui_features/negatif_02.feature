
Feature: Negatif02
  Scenario:
    Given Web sitesine git
    Then Arama kutusunda "kablo" kelimesi arat
    And Arama sonuclarindan bir urun sec
    And Secilen urunu sepete ekle
    And Giris yapmadan devam et
    And Kullanici sozlesmesi kutucugunu isaretle
    And Siparise devam et

    And Telefon no kutusuna "5533709146" gir
    And Mail adresi kutusuna "muratyaman06@hotmail.com" gir
    And Tc kimlik no kutusuna "10156174982" gir
    And Teslimat ili sec
    And Teslimat ilini "istanbul" olarak isaretle
    And Teslimat ilcesi sec
    And Teslimat ilcesini "Bahçelievler" olarak isaretle
    And Teslim alacak kisi AdSoyad kutusuna "Murat Yaman" bilgisi gir
    And Teslim alacak kisi telefon no kutusuna "5533709146" gir
    And Teslim alacak kisi adres kutusuna "Cumhuriyet Mahallesi Sakız sokak no:30" gir
    And Siparise devam et
    And Siparise devam edilemedigini dogrula
    Then Sayfayi kapatir
