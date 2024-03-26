package FaturaEkrani;
import java.util.Scanner;
public class faturaEkrani {
    private int faturaId;
    public String urunAdi;
    public int siparisMiktari;
    public float birimFiyat;
    public float kdvOrani;
    public float toplamFiyat;
    float gecici = 0,a = 100;

    Scanner scanner = new Scanner(System.in);



    public void faturaEkle(){
        System.out.println("Fatura Id : ");
        int  id = scanner.nextInt();
        System.out.println("Ürün Adı : ");
        String urunadi = scanner.next();
        System.out.println("Sipaiş Miktari : ");
        int miktar = scanner.nextInt();
        System.out.println("Ürün Birim Fiyatı : ");
        float birim = scanner.nextFloat();
        System.out.println("Kdv Oranı : %");
        float kdv = scanner.nextFloat();
        System.out.println("------------------------");
        gecici = (birim * kdv)/a;
        toplamFiyat = gecici + scanner.nextFloat();
        System.out.println("Fatura Id : "+id+"\nÜrün Adı : "+urunadi+"\nSipaiş Miktari : "+miktar+"\nÜrün Birim Fiyatı : "
        +birim+"\nKdv Oranı : %"+kdv+"\nGenel Toplam Fiyat : "+toplamFiyat);
    }

}
