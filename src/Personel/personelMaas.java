package Personel;

public class personelMaas extends personelBilgileri{
    public int maasMiktari;
    public int maasPrimi;

    public personelMaas(int Id, String ad, String soyad, int maasMiktari, int maasPrimi){
        System.out.println("Personel Id : " + Id + "\nPersonel Ad :" + ad + "\nPersonel Soyad : " + soyad +"\nMaaş : "+maasMiktari+
                "\nPrim : "+maasMiktari);
    }
}
