package Personel;

public class personelBilgileri {
    private int Id;
    public String ad;
    public String soyad;
    public String[] personelYeri = new String[1];

    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }

}
