
public class TestHesap {

    public static void main(String[] args) {

        Hesap h1 = new Hesap(2311, 20000, 4.5, 4, 500000);

        h1.paraCek(2500);
        h1.paraYatir(3000);

        double[] arr = h1.aylikOdemeGetir();
        double aylikFaizOrani = arr[0];
        double aylikOdeme = arr[1];

        System.out.println("bakiye: " + h1.getBakiye() + "-aylık faiz oranı: " + aylikFaizOrani
                + "-aylik ödeme miktarı: " + aylikOdeme + "-hesap tarihi: " + h1.getolusturulanTarih());

    }
}
