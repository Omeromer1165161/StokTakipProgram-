package Musteri;

public class musteriTuru extends musteriBilgileri{

    public String[] musteriTur = new String[5];

    public musteriTuru(int Id, String ad, String soyad, String musteriTur){

        System.out.println("Müşteri Id : " + Id + "\nMüşteri Ad :" + ad + "\nMüşteri Soyad : " + soyad + "\nMüşteri Türü : " + musteriTur);
    }


}
