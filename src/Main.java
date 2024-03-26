import Musteri.*;
import Personel.*;
import Toptanci.*;
import Urunler.*;
import Banka.*;
import SatisEkrani.*;
import FaturaEkrani.*;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        String baslik = "STOK TAKİP PROGRAMINA HOŞGELDİNİZ";
        SimpleDateFormat sekil = new SimpleDateFormat("d/M/y h:m:s");
        Date tarih = new Date();
        System.out.printf("\n%150s",sekil.format(tarih));
        System.out.printf("\n%90s",baslik);
        kullaniciGirisi kullanicigirisi = new kullaniciGirisi();
        kullanicigirisi.kullaniciEkle();
        girisEkrani grsekran = new girisEkrani();
        grsekran.anaKategori();


    }
}