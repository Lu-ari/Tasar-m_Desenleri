package bankamati;

public class BankaMakinesi {
    private BankaIslem islem;

    public void setIslem(BankaIslem islem) {
        this.islem = islem;
    }

    public void islemYap(double tutar, BankaHesap hesap) {
        islem.islemYap(tutar, hesap);
        if (tutar == 0) {
            islem = new BakiyeSorgulamaIslemi();
        }
        
    }
    
    
    public static void main(String[] args) {
        BankaHesap hesap = new BankaHesap(123456, 1000);

        BankaIslem paraCekmeIslemi = new ParaCekmeIslemi();

        BankaIslem paraYatirmaIslemi = new ParaYatirmaIslemi();

        BankaIslem bakiyeSorgulamaIslemi = new BakiyeSorgulamaIslemi();

        paraCekmeIslemi.setSonraki(paraYatirmaIslemi);

        paraYatirmaIslemi.setSonraki(bakiyeSorgulamaIslemi);

        BankaMakinesi makine = new BankaMakinesi();
        
        makine.setIslem(bakiyeSorgulamaIslemi);
        // Bakiye sorgulama işlemi yapılır
       
        makine.islemYap(0, hesap);
        
        makine.setIslem(paraCekmeIslemi);

        // Para çekme işlemi yapılır, hesapta yeterli bakiye olduğu için işlem gerçekleştirilir
        makine.islemYap(500, hesap);
        
        makine.setIslem(paraYatirmaIslemi);
        // Para çekme işlemi yapılır, hesapta yeterli bakiye olmadığı için sonraki işlem olan para yatırma işlemi gerçekleştirilir
        makine.islemYap(700, hesap);

        makine.setIslem(bakiyeSorgulamaIslemi);
        // Bakiye sorgulama işlemi yapılır
        makine.islemYap(0, hesap);
    }}

