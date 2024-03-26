package Toptanci;

public class toptanciTuru extends toptanciBilgileri {
    public String[] toptanciTur = new String[5];

    public toptanciTuru(int Id, String ad, String soyad, String toptanciTur){

        System.out.println("Toptanci Id : " + Id + "\nToptanci Ad :" + ad + "\nToptanci Soyad : " + soyad +
"\nToptanci Türü : "+toptanciTur );
    }
}
