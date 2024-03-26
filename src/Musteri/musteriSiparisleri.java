package Musteri;

public class musteriSiparisleri extends musteriBilgileri{

    public int musteriSiparisAdedi;
    public String musteriSiparisTuru;
    public int musteriSiparisToplami;


    public musteriSiparisleri(int Id, int musteriSiparisAdedi, String musteriSiparisTuru, int musteriSiparisToplami){

        System.out.println("Müşteri Id : " + Id + "\nSipariş Adedi : " + musteriSiparisAdedi + "\nSipariş Türü : " + musteriSiparisTuru +
                "\nSipariş Tutarı : " + musteriSiparisToplami);
    }


}
