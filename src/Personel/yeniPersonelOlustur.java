package Personel;

import java.util.Scanner;

public class yeniPersonelOlustur extends personelBilgileri{
    Scanner scanner = new Scanner(System.in);


    public void personelEkle(){
        System.out.println("Personel Id : ");
        int  id = scanner.nextInt();
        System.out.println("Personel Adı : ");
        String musteriAdi = scanner.next();
        System.out.println("Personel Soyadı : ");
        String soyad = scanner.next();
        System.out.println("Personel Çalışma Yeri : ");
        String yer = scanner.next();
        System.out.println("------------------------");
        System .out.println("Personel Id : "+id+"\nPersonel Adı : "+musteriAdi+"\nPersonel Soyadı : "+soyad+"\nPersonel Çalışma Yeri : "+yer);
    }
}
