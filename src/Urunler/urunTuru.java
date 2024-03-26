package Urunler;

public class urunTuru extends urunBilgileri {
    private String urunMarka;
    public String urunTuru;

    public String getUrunMarka(){
        return urunMarka;
    }
    public urunTuru(String barkodNo, String urunAdi, String urunMarka, String urunTuru){

        System.out.println("Ürün Barkodu: "+barkodNo+"\nÜrün Adı: "+urunAdi+"\nÜrün Markası: "+urunMarka+"\nÜrün Türü: "+urunTuru);
    }
}
