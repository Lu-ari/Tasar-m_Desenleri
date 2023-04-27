package bankamati;

//BakiyeSorgulamaIslemi.java
public class BakiyeSorgulamaIslemi extends BankaIslem {
 @Override
 public void islemYap(double tutar, BankaHesap hesap) {
	 hesap.bakiyeGetir(tutar);
	 System.out.println("Bakiye sorgulama işlemi yapıldı. Hesabınızın bakiyesi: " + hesap.getBakiye());
 }

}
