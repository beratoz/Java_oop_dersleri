public class crcle3 {
      private double radius = 1;
      private static int numberOfobjects = 0;

      public crcle3() {
            numberOfobjects++;
      }

      public crcle3(double new_radius) {
            radius = new_radius;
            numberOfobjects++;

      }

      public double getRadius() {
            return radius;

      }

      public void setRadius(double new_radius) {
            radius = (new_radius >= 0) ? new_radius : 0;

      }

      public static int getNumberOfObjects() {
            return numberOfobjects;
      }

      public double getArea() {
            return radius * radius * Math.PI;
      }

}
