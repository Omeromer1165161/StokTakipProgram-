package Banka;

public class bankaMusteri extends bankaBilgileri{
    public bankaMusteri(int Id, String ad, String soyad, String iban, String bankaAdi){

        System.out.println("Müşteri Id : " + Id + "\nMüşteri Ad :" + ad + "\nMüşteri Soyad : " + soyad + "\nIban : "+ iban +
                "\nBanka Adı :"+bankaAdi);
    }
}
