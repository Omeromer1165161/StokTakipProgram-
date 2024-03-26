package Toptanci;

import java.util.Scanner;

public class yeniToptanciOlustur extends toptanciBilgileri{
    Scanner scanner = new Scanner(System.in);


    public void toptanciEkle(){
        System.out.println("Toptancı Id : ");
        int  id = scanner.nextInt();
        System.out.println("Toptancı Adı : ");
        String musteriAdi = scanner.next();
        System.out.println("Toptancı Soyadı : ");
        String soyad = scanner.next();
        System.out.println("Telefon Numarası : ");
        String telefon = scanner.next();
        System.out.println("Toptancı Adresi : ");
        String adres = scanner.next();
        System.out.println("------------------------");
        System .out.println("Toptancı Id : "+id+"\nToptancı Adı : "+musteriAdi+"\nToptancı Soyadı : "+soyad+"\nTelefon Numarası : "+telefon
        +"\nToptancı Adresi : "+adres);
    }
}
