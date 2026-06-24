import java.awt.Color;
import java.util.ArrayList;

public class test_apstarct_demo {
      public static void main(String[] args) {
            Fruit mango = new Mango(Color.orange, true);
            Fruit banana = new Banana(Color.yellow, false);
            mango.prepare();
            banana.prepare();
            ArrayList<Fruit> fruits = new ArrayList<Fruit>();
            fruits.add(banana);
            fruits.add(mango);
            servisEt(fruits);
      }

      public static void servisEt(ArrayList<Fruit> ff) {
            for (Fruit f : ff) {
                  System.out.println(f.getColor());
                  System.out.println(f.getSeason());
                  f.prepare();
            }

      }
}

abstract class Fruit {
      private Color color;
      private boolean season;

      public Fruit(Color color, boolean season) {
            this.color = color;
            this.season = season;
      }

      public abstract void prepare();

      public Color getColor() {
            return this.color;
      }

      public boolean getSeason() {
            return this.season;
      }
}

class Mango extends Fruit {
      public Mango(Color color, boolean season) {
            super(color, season);
      }

      public void prepare() {
            System.out.println("mangoyu dilimle");

      }

}

class Banana extends Fruit {
      public Banana(Color color, boolean season) {
            super(color, season);
      }

      public void prepare() {
            System.out.println("muzun kabugunu soy");
      }
}