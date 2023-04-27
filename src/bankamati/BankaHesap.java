package bankamati;

//BankaHesap.java
public class BankaHesap {
 private int hesapNo;
 private double bakiye;

 public BankaHesap(int hesapNo, double bakiye) {
     this.hesapNo = hesapNo;
     this.bakiye = bakiye;
 }

 public int getHesapNo() {
     return hesapNo;
 }

 public double getBakiye() {
     return bakiye;
 }

 public void paraCek(double tutar) {
     bakiye -= tutar;
 }

 public void paraYatir(double tutar) {
     bakiye += tutar;
 }
 public double bakiyeGetir(double bakiye) {
     return bakiye; 
 }
}