package Toptanci;

public class toptanciSiparis extends toptanciBilgileri {

    public int toptanciSiparisAdedi;
    public String toptanciSiparisTuru;
    public int toptanciSiparisToplami;

    public toptanciSiparis(int Id, int toptanciSiparisAdedi, String toptanciSiparisTuru, int toptanciSiparisToplami){

        System.out.println("Toptanci Id : " + Id + "\nSipariş Adedi : " + toptanciSiparisAdedi + "\nSipariş Türü : " + toptanciSiparisTuru +
                "\nSipariş Tutarı : " + toptanciSiparisToplami);
    }
}
