package Toptanci;


public class toptanciEkleme extends toptanciBilgileri {
    public toptanciEkleme(int Id, String ad, String soyad, String telefonNo, String toptanciAdres){

        System.out.println("Toptanci Id : " + Id + "\nToptanci Ad :" + ad + "\nToptanci Soyad : " + soyad + "\nToptanci Telefon No : " + telefonNo +
                "\nToptancının Bulunduğu Şehir : " + toptanciAdres);
    }
}
