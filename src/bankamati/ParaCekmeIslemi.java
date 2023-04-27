package bankamati;

public class ParaCekmeIslemi extends BankaIslem {
    @Override
    public void islemYap(double tutar, BankaHesap hesap) {
        if (hesap.getBakiye() >= tutar) {
            hesap.paraCek(tutar);
            System.out.println(tutar + " TL para çekme işlemi gerçekleştirildi. Yeni bakiye: " + hesap.getBakiye());
        } else if (sonraki != null) {
            sonraki.islemYap(tutar, hesap);
        } else {
            System.out.println("Hesapta yeterli bakiye bulunmamaktadır.");
        }
    }
}






