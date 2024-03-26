package Urunler;

public class urunEkleme extends urunBilgileri {

    public urunEkleme(String barkodNo, String urunAdi, double urunFiyati, int stokMiktari, String urunAciklamasi){

        System.out.println("Ürün Barkodu: "+barkodNo+"\nÜrün Adı: "+urunAdi+"\nÜrün Fiyatı: "+urunFiyati+"\nStok Miktari: "
        +stokMiktari+"\nÜrün Açıklaması: "+urunAciklamasi);
    }
}
