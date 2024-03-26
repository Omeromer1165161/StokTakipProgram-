package Toptanci;

public class toptanciBilgileri {
    private int Id;
    public String ad;
    public String soyad;
    private String[] telefonNo = new String[13];
    public String[] toptanciAdres = new String[5];

    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }

    public String[] getTelefonNo() {
        return telefonNo;
    }
    public void setTelefonNo(String[] telefonNo){
        this.telefonNo = telefonNo;
    }
}
