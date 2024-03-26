package Musteri;

public class musteriBilgileri {
    private int Id;
    public String ad;
    public String soyad;
    private String[] telefonNo = new String[1];


   public int getId(){
        return Id;
    }


    public String[] getTelefonNo() {
        return telefonNo;
    }

}
