public class ornek2 {
    public static void main(String[] args) {
        System.out.println("nesne oluşturulmasdan once");
        System.out.print(Circle.nesne_sayisi);

        Circle c1 = new Circle();
        System.out.println("c1 nesnesi oluştuktan sonra");
        System.out.print(Circle.nesne_sayisi);
        System.out.println("c1 nesnesi için radius" + c1.radius);
        System.out.println("c1 nesnesi için radius" + c1.getArea());
        System.out.println("c1 icin nesne sayisi " + Circle.get_nesne_sayisi());

        Circle c2 = new Circle(3.9);
        System.out.println("c2 nesnesi oluştuktan sonra");
        System.out.println("c2 icin nesne sayisi " + Circle.get_nesne_sayisi());

        System.out.println("c2 nesnesi için radius" + c2.radius);
        System.out.println("c2 nesnesi için alan" + c2.getArea());

        c1.radius = 5.5;
        System.out.println("cq nesnesi için radius" + c1.radius);
        System.out.println("cq nesnesi için alan" + c1.getArea());

    }
}

class Circle {
    public double radius;
    public static int nesne_sayisi = 0;

    public static final double pi_sayisi = 3.14;

    Circle() {
        radius = 2.4;
        nesne_sayisi++;
    }

    Circle(double new_radius) {
        radius = new_radius;
        nesne_sayisi++;
    }

    public static int get_nesne_sayisi() {
        return nesne_sayisi;
    }

    public double getArea() {
        return radius * radius * pi_sayisi;
    }
}
