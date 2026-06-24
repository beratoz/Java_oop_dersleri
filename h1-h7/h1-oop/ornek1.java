
public class ornek1 {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.getArea());
        Circle c2 = new Circle(5.6);
        System.out.println(c2.getArea());

    }
}

class Circle {
    public double radius;

    Circle() {
        radius = 3.2;
    }

    Circle(double new_radius) {
        radius = new_radius;

    }

    public double getArea() {
        return radius * radius * Math.PI;

    }

}
