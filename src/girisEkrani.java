import Musteri.*;
import Personel.*;
import Toptanci.*;
import Urunler.*;
import Banka.*;
import SatisEkrani.*;
import FaturaEkrani.*;
import java.util.Scanner;
public class girisEkrani {
    Scanner scanner = new Scanner(System.in);

   public void anaKategori(){


       System.out.println("1)Müşteri İşlemleri\n"+"2)Personel İşlemleri\n"+"3)Toptanci İşlemleri\n"+"4)Banka İşlemleri\n"
               +"5)Ürün İşlemleri\n"+"6)Fatura İşlemleri\n"+"7)Satış İşlemleri\n");
       int n= scanner.nextInt();

       switch(n) {
           case 1:
               System.out.println("Müşteri İşlemleri :");
               System.out.println("A) Yeni Müşteri Ekle\n"+"B) Borç Bilgileri\n"+"C) Müşteri Siparişleri\n"+"D) Müşteri Türü\n"+
                       "E) Kayıtlı Müşteriler\n");
               String m = scanner.next();
               switch (m) {
                   case "A":
                       System.out.println("Yeni Müşteri Ekle :");
                       yeniMusteriOlustur musteriOlustur = new yeniMusteriOlustur();
                       musteriOlustur.musteriEkle();

                       break;
                   case "B":
                       System.out.println("Borç Bilgileri :");
                       musteriBorc musteriborc = new musteriBorc(1,"Ömer","Kilik",5000);
                       break;
                   case "C":
                       System.out.println("Müşteri Siparişleri :");
                       musteriSiparisleri musterisiparis = new musteriSiparisleri(1,50,"Karpuz",500);
                       break;
                   case "D":
                       System.out.println("Müşteri Türü :");
                       musteriTuru musterituru = new musteriTuru(1,"Ömer","Kilik","Market");
                       break;
                   case "E":
                       System.out.println("Kayıtlı Müşteriler :");
                       musteriEkleme musteriEkle = new musteriEkleme(1, "Ömer", "Kilik","05467372875");
                       musteriEkleme musteriEkle1 = new musteriEkleme(2,"Ensar","Özdemir","05443634426");
                       break;
                   default:
                       System.out.println("!!Geçersiz seçim!!");
                       break;
               }
             break;
           case 2:
               System.out.println("Personel İşlemleri :");
           System.out.println("A) Yeni Personel Ekle\n"+"B) Personel Maas Bilgileri \n"+"C) Personel Sigorta Bilgileri\n"+"D) Personel Çalışma Saati\n"+
                   "E) Kayıtlı Personel\n");
           String p = scanner.next();
           switch (p) {
               case "A":
                   System.out.println("Yeni Personel Ekle :");
                   yeniPersonelOlustur personelOlustur = new yeniPersonelOlustur();
                   personelOlustur.personelEkle();
                   break;
               case "B":
                   System.out.println("Personel Maas Bilgileri :");
                   personelMaas personelmaas = new personelMaas(101,"Ahmet","Demir",10000,150);
                   break;
               case "C":
                   System.out.println("Personel Sigorta Bilgileri :");
                   personelSigorta personelsigorta = new personelSigorta(101,"Ahmet","Demir",1000,2000);
                   break;
               case "D":
                   System.out.println("Personel Çalışma Saati :");
                   personelSaat personelsaat = new personelSaat(101,"Ahmet","Demir",55);
                   break;
               case "E":
                   System.out.println("Kayıtlı Personel :");
                   personelEkleme personelEkle1 = new personelEkleme(101,"Ahmet","Demir","Depo Sorumlusu");
                   personelEkleme personelEkle2 = new personelEkleme(102,"Mehmet","Şahin","Şöfor");
                   break;
               default:
                   System.out.println("!!Geçersiz seçim!!");
                   break;
           }
               break;
           case 3:
               System.out.println("Toptanci İşlemleri :");
               System.out.println("A) Yeni Toptancı Ekle\n"+"B) Toptancı Borç Bilgileri\n"+"C) Toptancı Siparişleri\n"+"D) Toptancı Türü\n"+
                       "E) Kayıtlı Toptancılar\n");
               String t = scanner.next();
               switch (t) {
                   case "A":
                       System.out.println("Yeni Toptancı Ekle:");
                       yeniToptanciOlustur toptanciOlustur = new yeniToptanciOlustur();
                       toptanciOlustur.toptanciEkle();
                       break;
                   case "B":
                       System.out.println("Toptancı Borç Bilgileri :");
                       toptanciBorc toptanciborc = new toptanciBorc(1001,"Damla","Damla",15000);
                       break;
                   case "C":
                       System.out.println("Toptancı Siparişleri :");
                       toptanciSiparis toptancisiparis = new toptanciSiparis(1001,100,"Boya",15000);
                       break;
                   case "D":
                       System.out.println("Toptancı Türü :");
                       toptanciTuru toptancituru = new toptanciTuru(1001,"Damla","Damla","Hırdavat");
                       break;
                   case "E":
                       System.out.println("Kayıtlı Toptancılar :");
                       toptanciEkleme toptanciEkle1 = new toptanciEkleme(1001,"Damla","Damla", "05561611615","İstanbul");
                       toptanciEkleme toptanciEkle2 = new toptanciEkleme(1002,"Damla","Merve", "05515611615","Ankara");
                       break;
                   default:
                       System.out.println("!!Geçersiz seçim!!");
                       break;
               }
               break;
           case 4:
               System.out.println("Banka İşlemleri :");
               System.out.println("A) Müşteri Banka İşlemleri\n"+"B) Toptancı Banka İşlemleri\n");
               String b = scanner.next();
               switch (b) {
                   case "A":
                       System.out.println("Müşteri Banka İşlemleri :");
                       bankaMusteri bankamusteri = new bankaMusteri(2,"Ensar","Özdemir","TR1816169","Yapı Kredi");

                       break;
                   case "B":
                       System.out.println("Toptancı Banka İşlemleri :");
                       bankaToptanci bankatoptanci = new bankaToptanci(1002,"Damla","Merve","TR026315116","Garanti");
                       break;
                   default:
                   System.out.println("!!Geçersiz seçim!!");
                   break;
               }
               break;
           case 5:
               System.out.println("Ürün İşlemleri :");
               System.out.println("A) Yeni Ürün Ekle\n"+"B) Ürün Türü\n"+"C) Kayıtlı Ürünler\n");
               String u = scanner.next();
               switch (u) {
                   case "A":
                       System.out.println("Yeni Ürün Ekle :");
                       yeniUrunOlustur urunOlustur = new yeniUrunOlustur();
                       urunOlustur.urunEkle();
                       break;
                   case "B":
                       System.out.println("Ürün Türü :");
                       urunTuru urunturu = new urunTuru("116116516","Elma","Dag Elmaları","Meyve");
                       break;
                   case "C":
                       System.out.println("Kayıtlı Ürünler :");
                       urunEkleme urunEkle = new urunEkleme("116116516","Elma",5.5,10,"Yeşil Elma");
                       break;
                   default:
                       System.out.println("!!Geçersiz seçim!!");
                       break;
               }
               break;
           case 6:
               System.out.println("Fatura İşlemleri :");
               faturaEkrani faturaekran = new faturaEkrani();
               faturaekran.faturaEkle();
               break;
           case 7:
               System.out.println("Satış İşlemleri\nSipariş Sayısı : ");
               musteriSatisEkrani musterisatis = new musteriSatisEkrani();
               musterisatis.siparisEkle();
               break;

               default:
               System.out.println("!!Geçersiz seçim!!");
               break;
       }

   }

}


