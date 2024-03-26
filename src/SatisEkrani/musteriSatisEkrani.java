package SatisEkrani;
import Urunler.*;
import java.util.Scanner;
import java.lang.Float;
public class musteriSatisEkrani extends urunBilgileri{

      Scanner scanner = new Scanner(System.in);

      float miktar;
      float birimFiyat;
      float toplamFiyat;
      float a;

      public void siparisEkle(){

          int siparisSayisi = scanner.nextInt();
          System.out.printf("Sipariş Sayısı : %d\n",siparisSayisi);
          System.out.println("\n|  Barkod  |   " + "  |  Miktar  |  " + "  |  Birim Fiyat  |  " + "  |  Toplam Fiyat  |");
          for (int i = 1;i<=siparisSayisi;i++){
              System.out.printf("%8s %15.0f %22.2f %27.3f",scanner.next(),scanner.nextFloat(),scanner.nextFloat(),toplamFiyat = scanner.nextFloat() * scanner.nextFloat());
              a += toplamFiyat;
          }
          System.out.println("\n\n\n                                       Genel Toplam Tutar : "+a);
      }



}
