Feature:Hepsiburada Urun Test

@Hepsiburada
  Scenario: Urun Hepsiburada
  Given Anasayfada Konum alanına Kklanır.
  And İl, ilçe ve mahalle sKonumunuz Kaydedildi popup’ı kontrol edilir.
  And Konumunuz Kaydedildi popup’ı kontrol edilir.
  And Tab bar üzerinden kategoriler tabına Kklanır.
  And Herhangi bir kategori seçilip listeleme sayfasına yönlenilir.
  Then Listeleme sayfasında Yarın Kapında alanında gelen il bilgisi ile anasayfada seçilen il bilgisinin aynı olduğu kontrol edilir.


