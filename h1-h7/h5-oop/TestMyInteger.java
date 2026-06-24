import java.util.Scanner;

class MyInteger {
      private int value;

      // Constructor: ilk değeri this anahtar kelimesi ile atıyoruz
      public MyInteger(int value) {
            this.value = value;
      }

      // Value'yu döndüren get metodu
      public int getValue() {
            return value;
      }

      // Sınıfın içindeki değere göre çift olup olmadığını kontrol eden metot
      public boolean isEven() {
            return value % 2 == 0;
      }

      // Sınıfın içindeki değere göre tek olup olmadığını kontrol eden metot
      public boolean isOdd() {
            return value % 2 != 0;
      }

      // Sınıfın içindeki değere göre asal olup olmadığını kontrol eden metot
      public boolean isPrime() {
            if (value < 2)
                  return false;
            for (int i = 2; i <= Math.sqrt(value); i++) {
                  if (value % i == 0)
                        return false;
            }
            return true;
      }

      // Parametre olarak verilen değere göre çift olup olmadığını kontrol eden static
      // metot
      public static boolean isEven(int number) {
            return number % 2 == 0;
      }

      // Parametre olarak verilen değere göre tek olup olmadığını kontrol eden static
      // metot
      public static boolean isOdd(int number) {
            return number % 2 != 0;
      }

      // Parametre olarak verilen değere göre asal olup olmadığını kontrol eden static
      // metot
      public static boolean isPrime(int number) {
            if (number < 2)
                  return false;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                  if (number % i == 0)
                        return false;
            }
            return true;
      }

      // Gelen parametre değeri, value değişkenine eşit mi kontrol eden metot
      public boolean equals(int otherValue) {
            return this.value == otherValue;
      }

      // Verilen char dizisinin sayısal karşılıklarını toplayan static metot
      public static int parseInt(char[] charArray) {
            int sum = 0;
            for (char c : charArray) {
                  sum += (int) c; // Her karakterin ASCII karşılığını topluyoruz
            }
            return sum;
      }
}

public class TestMyInteger {
      public static void main(String[] args) {
            // testObj1 ve testObj2 nesnelerini oluşturuyoruz
            MyInteger testObj1 = new MyInteger(123);
            MyInteger testObj2 = new MyInteger(24);

            // testObj1 ve testObj2'nin tek mi, çift mi, asal mı olduğunu ekrana
            // yazdırıyoruz
            System.out.println("testObj1 (123) çift mi? " + testObj1.isEven());
            System.out.println("testObj1 (123) tek mi? " + testObj1.isOdd());
            System.out.println("testObj1 (123) asal mı? " + testObj1.isPrime());

            System.out.println("testObj2 (24) çift mi? " + testObj2.isEven());
            System.out.println("testObj2 (24) tek mi? " + testObj2.isOdd());
            System.out.println("testObj2 (24) asal mı? " + testObj2.isPrime());

            // Kullanıcıdan pozitif bir sayı alıyoruz
            Scanner scanner = new Scanner(System.in);
            System.out.print("Pozitif bir sayı giriniz: ");
            int userInput = scanner.nextInt();

            // Girilen sayı testObj1'in value değeri ile eşit mi kontrol edip ekrana
            // yazıyoruz
            System.out.println("Girilen sayı testObj1'in değeri ile eşit mi? " + testObj1.equals(userInput));

            // 'd', 'e', 'n', 'e', 'm', 'e' karakter dizisini parseInt metoduna gönderiyoruz
            char[] charArray = { 'd', 'e', 'n', 'e', 'm', 'e' };
            int charSum = MyInteger.parseInt(charArray);

            // Karakterlerin sayısal karşılıklarının toplamını ekrana yazdırıyoruz
            System.out.println("Karakter dizisinin sayısal karşılıklarının toplamı: " + charSum);
      }
}
