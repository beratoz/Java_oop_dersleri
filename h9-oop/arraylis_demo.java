import java.time.LocalDate;
import java.util.ArrayList;

public class arraylis_demo {
      public static void main(String[] args) {
            ArrayList<String> citylist = new ArrayList<String>();
            citylist.add("ankara");
            citylist.add("bursa");
            citylist.add("konya");
            citylist.add("van");
            citylist.add("ankara");
            System.out.println("arralist ilk hali" + citylist);
            System.out.println("arralist boyutu" + citylist.size());
            System.out.println("balıkesir ogesini içeriyor mu" + citylist.contains("balikesir"));
            System.out.println("ankaranın bulunduğu ilk indeks" + citylist.indexOf("ankara"));
            System.out.println("ankaranın bulunduğ son indeks" + citylist.indexOf("ankara"));
            citylist.add(2, "elazig");
            System.out.println("citylis elazıg eklendiği hali" + citylist);
            citylist.remove("van");
            System.out.println("van kaldırıldıktan sonrakı hali" + citylist);
            citylist.remove(1);
            System.out.println("1 kaldırıldaktan sonrakı hali" + citylist);
            System.out.println("citiy icerigi tostring ile gosterilebilir " + citylist.toString());
            for (int i = citylist.size() - 1; i >= 0; i--) {
                  System.out.println(citylist.get(i) + "-");
            }
            System.out.println(" ");

            ArrayList<Circle> daireler = new ArrayList<Circle>();
            daireler.add(new Circle(5.0, "yesli"));
            daireler.add(new Circle(3.5, "mor"));
            System.out.println("" + daireler.get(0).getArea());
            System.out.println("dairele arraylistin ikinci indeksindeki nesne" + daireler.get(1).getArea());
      }

}

class Circle {
      private double radius;
      private String color;
      private LocalDate date;

      public Circle() {
            date = LocalDate.now();
      }

      public Circle(double radius, String color) {
            this.radius = radius;
            this.color = color;
      }

      public String getColor() {
            return this.color;
      }

      public double getRadius() {
            return this.radius;
      }

      public double getArea() {
            return Math.PI * radius * radius;
      }
}