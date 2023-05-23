Feature: A101 kredi karti ile aliş veris
  @A101
  Scenario: TC kadin siyah dizalti corap alimi
    Given Kullanıcı "A101Url" girer
    Then Kullanıcı cokies i kabul eder
    And Kullanici Giyim&Aksesuar bolumune mouse'u getirerek bekler.
    And Kullanici Dizaltı Corap tiklar
    And Kullanici Siyah Corap olana tiklar
    And Kullanici secilen urunun siyah oldugunu dogrular
    And Kullanici sepete ekler butonuna tiklar
    And Kullanici sepeti görüntüle butonuna tiklar
    And Kullanici sepeti onayla butonuna tiklar
    And Kullanici uye girisi olmadan butonuna tiklar
    And Kullanici email girisi yapar
    And Kullanici yeni adres oluştur butonuna tiklar
    And Kullanici adres basligi ve diger bilgileri girer
    And Kullanici il secer
    And Sistem 1 sn beklet
    And Kullanici ilce secer
    And Sistem 1 sn beklet
    And Kullanici mahalle secer
    And Sistem 1 sn beklet
    And Kullanci adres bilgileri girer
    And Sistem 1 sn beklet
    And Kullanci kaydet butonuna tiklar
    And Sistem 1 sn beklet
    And Kullanci adres kaydetdikten ve kargo secildikten sonra kaydet devam et butonuna tiklar
    And Kullanıci ödeme sayfasina geldigini dogrular
    And Kullanici sayfayi kapatir








