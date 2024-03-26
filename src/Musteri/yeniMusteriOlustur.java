package Musteri;
import java.util.Scanner;

public class yeniMusteriOlustur extends musteriBilgileri{
    Scanner scanner = new Scanner(System.in);


    public void musteriEkle(){
        System.out.println("Müşteri Id : ");
        int  id = scanner.nextInt();
        System.out.println("Müşteri Adı : ");
        String musteriAdi = scanner.next();
        System.out.println("Müşteri Soyadı : ");
        String soyad = scanner.next();
        System.out.println("Telefon Numarası : ");
        String telefon = scanner.next();
        System.out.println("------------------------");
        System .out.println("Müşteri Id : "+id+"\nMüşteri Adı : "+musteriAdi+"\nMüşteri Soyadı : "+soyad+"\nTelefon Numarası : "+telefon);
    }

}
