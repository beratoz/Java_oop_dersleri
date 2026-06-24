
import java.util.Scanner;

public class TestMyInteger {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            MyInteger testObj1 = new MyInteger(123);

            MyInteger testObj2 = new MyInteger(24);

            String deger1 = "";
            String deger2 = "";

            if (testObj1.isEven()) {
                deger1 += "Çift";
            } else if (testObj1.isOdd()) {
                deger1 += "Tek";
            } else if (testObj1.isPrime()) {
                deger1 += "Asal";
            }

            System.out.println("testobj1:  " + testObj1.getValue() + " tür ve bu sayı : " + deger1 + " dır.");

            ///////////////////
            if (testObj2.isEven()) {
                deger2 += "Çift";
            } else if (testObj2.isOdd()) {
                deger2 += "Tek";
            } else if (testObj2.isPrime()) {
                deger2 += "Asal";
            }

            System.out.println("testobj2:  " + testObj2.getValue() + " tür ve bu sayı : " + deger2 + " dır.");

            //////////////////
            String deger3 = "";

            System.out.println("pozitif bir sayı giriniz:");

            int j = input.nextInt();

            if (testObj1.equals(j)) {

                deger3 += "eşit";
            } else if (!testObj1.equals(j)) {
                deger3 += "eşit değil";
            }

            System.out.println(
                    "Sayı " + j + " ve testobj1  " + testObj1.getValue() + " birbirlerine " + deger3 + " tir.");
        }

        /////////////

        char[] arr = { 'd', 'e', 'n', 'e', 'm', 'e' };
        System.out.println("harflerin sayısal karşılıkları toplamı:  " + MyInteger.parseInt(arr));

    }
}
