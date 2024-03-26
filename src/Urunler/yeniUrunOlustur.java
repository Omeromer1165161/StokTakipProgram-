package Urunler;

import java.util.Scanner;

public class yeniUrunOlustur extends urunBilgileri{
    Scanner scanner = new Scanner(System.in);


    public void urunEkle(){
        System.out.println("Ürün Barkod : ");
        String  barkod = scanner.next();
        System.out.println("Ürün Adı : ");
        String urunAdi = scanner.next();
        System.out.println("Ürün Fiyatı : ");
        float fiyat = scanner.nextFloat();
        System.out.println("Stok Miktarı : ");
        int miktar = scanner.nextInt();
        System.out.println("Ürün Açıklması : ");
        String aciklama = scanner.next();

        System.out.println("------------------------");
        System .out.println("Ürün Barkod : "+barkod+"\nÜrün Adı : "+urunAdi+"\nÜrün Fiyatı : "+fiyat+"\nStok Miktarı : "+miktar
        +"\nÜrün Açıklaması : "+aciklama);
    }

}
