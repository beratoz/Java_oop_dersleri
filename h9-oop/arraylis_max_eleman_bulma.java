import java.util.ArrayList;
import java.util.Scanner;

public class arraylis_max_eleman_bulma {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("sifirdan farkli bir sayi gir,sayı girmeyi bırak=0");
            ArrayList<Integer> list = new ArrayList<Integer>();
            Integer integer;
            while ((integer = sc.nextInt()) != 0) {
                  list.add(integer);

            }
            System.out.println("girilen sayilar icinde en buyugu" + EnBuyukBul(list));

      }

      public static Integer EnBuyukBul(ArrayList<Integer> listem) {
            if (listem.isEmpty() == true || listem == null) {
                  return null;
            }
            Integer enbuyuksayi = listem.get(0);
            for (Integer ii : listem) {
                  enbuyuksayi = Math.max(enbuyuksayi, ii);
            }
            return enbuyuksayi;
      }

}
