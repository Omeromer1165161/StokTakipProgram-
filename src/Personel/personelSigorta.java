package Personel;

public class personelSigorta extends personelBilgileri{

    public int sigortaPrimi;
    public int sigortaGunu;
    public personelSigorta(int Id, String ad, String soyad, int sigortaGunu, int sigortaPrimi){

        System.out.println("Personel Id : " + Id + "\nPersonel Ad :" + ad + "\nPersonel Soyad : " + soyad +
                "\nToplam Sigorta Günü : " + sigortaGunu + "\nSigorta Primi : " + sigortaPrimi);
    }
}
