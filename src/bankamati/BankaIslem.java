package bankamati;

public abstract class BankaIslem {
    protected BankaIslem sonraki;

    public void setSonraki(BankaIslem islem) {
        this.sonraki = islem;
    }

    public abstract void islemYap(double tutar, BankaHesap hesap);
}

