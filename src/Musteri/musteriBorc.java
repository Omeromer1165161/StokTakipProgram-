package Musteri;

public class musteriBorc extends musteriBilgileri{

    public int musteriborcMiktari;

    public musteriBorc(int Id, String ad, String soyad,int musteriborcMiktari){
        System.out.println("Müşteri Id : " + Id + "\nMüşteri Ad :" + ad + "\nMüşteri Soyad : " + soyad +"\nMüşteri Borç Miktarı :"
        + musteriborcMiktari);
    }



}
