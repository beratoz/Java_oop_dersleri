import java.lang.reflect.Array;
import java.util.ArrayList;

public class test_stack_of_integers_arraylist {
      public static void main(String[] args) {
            MyStack_ArrayList my = new MyStack_ArrayList();
            System.out.println("liste bos mu" + my.isempty());
            for (int i = 0; i < 20; i++) {
                  my.push(i);

            }
            System.out.println("arraylist yeni boyut" + my.getsize());
            System.out.println("arraylist peek sonucu" + my.peek());
            while (!my.isempty()) {
                  System.out.println("arraylist pop sonuc" + my.pop());

            }
            System.out.println("pop sonrası yeni size" + my.getsize());
            my.push(5);
            my.push(7);
            my.push(5);
            my.push(5);
            my.push(5);
            int[] gelenindeks = new int[2];
            gelenindeks = my.searchfirstlast(5);
            for (int i = 0; i < gelenindeks.length; i++) {
                  System.out.println("gelen indeks" + gelenindeks[i]);
            }
            ArrayList<Integer> tumIndeksler = new ArrayList<Integer>();
            tumIndeksler = my.search(5);
            System.out.println(tumIndeksler.toString());

      }
}

class MyStack_ArrayList {
      ArrayList<Integer> listem;

      public MyStack_ArrayList() {
            listem = new ArrayList<Integer>();
      }

      public boolean isempty() {
            return listem.isEmpty();
      }

      public int getsize() {
            return listem.size();
      }

      public int peek() {
            return listem.get(listem.size() - 1);
      }

      public void push(int a) {
            listem.add(a);
      }

      public int pop() {
            int deger = listem.get(listem.size() - 1);
            listem.remove(deger);
            return deger;
      }

      public ArrayList<Integer> search(int a) {
            ArrayList<Integer> indeksler = new ArrayList<Integer>();
            for (int i = 0; i < listem.size() - 1; i++) {
                  if (listem.get(i) == a) {
                        indeksler.add(i);
                  }
            }
            return indeksler;
      }

      public int[] searchfirstlast(int a) {
            int[] dizim = new int[2];
            dizim[0] = listem.indexOf(a);
            dizim[1] = listem.lastIndexOf(a);
            return dizim;
      }

      public String toString() {
            return listem.toString();
      }
}
