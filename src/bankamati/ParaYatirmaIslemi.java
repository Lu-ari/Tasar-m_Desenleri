package bankamati;

//ParaYatirmaIslemi.java
public class ParaYatirmaIslemi extends BankaIslem {
 @Override
 public void islemYap(double tutar, BankaHesap hesap) {
     hesap.paraYatir(tutar);
     System.out.println(tutar + " TL para yatırma işlemi gerçekleştirildi. Yeni bakiye: " + hesap.getBakiye());
 }
}