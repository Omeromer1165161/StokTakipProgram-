package Personel;

public class personelSaat extends personelBilgileri{
     public int haftalikCalismaSaati;

     public personelSaat(int Id, String ad, String soyad, int haftalikCalismaSaati){

          System.out.println("Personel Id : " + Id + "\nPersonel Ad :" + ad + "\nPersonel Soyad : " + soyad + "\nHaftalık Çalışılan Saat : " + haftalikCalismaSaati);
     }
}
