import java.util.Random;

public class algoritma {
      public static void main(String[] args) {
            Random random = new Random();
            int[] frequency = new int[10]; // 1-10 arasındaki sayıların frekansı için

            // 1000 adet rastgele sayı üret ve frekans dizisini güncelle
            for (int i = 0; i < 1000; i++) {
                  int randomNumber = random.nextInt(10) + 1; // 1-10 arasında sayı
                  frequency[randomNumber - 1]++; // Frekansı artır
            }

            // Frekansları yazdır
            for (int i = 0; i < frequency.length; i++) {
                  System.out.println((i + 1) + " sayısı " + frequency[i] + " kez üretildi.");
            }

      }
}
