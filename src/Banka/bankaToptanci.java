package Banka;

public class bankaToptanci extends bankaBilgileri{
    public bankaToptanci(int Id, String ad, String soyad, String iban, String bankaAdi){

        System.out.println("Toptanci Id : " + Id + "\nToptanci Ad :" + ad + "\nToptanci Soyad : " + soyad + "\nIban : "+ iban +
                "\nBanka Adı :"+bankaAdi);
    }
}
