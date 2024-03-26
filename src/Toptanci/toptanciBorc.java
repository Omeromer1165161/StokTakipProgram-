package Toptanci;

public class toptanciBorc extends toptanciBilgileri {
    public int toptanciBorcMiktari;

    public toptanciBorc(int Id, String ad, String soyad, int toptanciBorcMiktari){

        System.out.println("Toptanci Id : " + Id + "\nToptanci Ad :" + ad + "\nToptanci Soyad : " + soyad + "\nToptanci Borç Miktarı : " + toptanciBorcMiktari);
    }
}
