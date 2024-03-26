import java.util.Scanner;

public class kullaniciGirisi {

   Scanner scanner = new Scanner(System.in);
   public String kullaniciAdi = "admin";
   private final String kullaniciSifre = "12345";

   public String getKullaniciSifre(){
        return this.kullaniciSifre;
    }
    public void kullaniciEkle() {
        System.out.println("\nKullanıcı adını giriniz:");
        String adi = scanner.next();
        System.out.println("Şifrenizi giriniz:");
        String sifre = scanner.next();
        if (kullaniciAdi.equals(adi) && kullaniciSifre.equals(sifre))
        {
            System.out.println ("Sisteme başarıyla girildi!");

        }
        else
        {

            System.out.println ("Kullanıcı adı veya şifre yanlış!\nKontrol ederek tekarar deneyiniz.");
            System.exit(0);
        }
    }
}







