public class polymorphism {

      public static void main(String[] args) {
            Car car = new Car();
            car.speedUp();
            Motorcycle motorcycle = new Motorcycle();
            motorcycle.speedUp();
            Cycle cycle = new Cycle();
            System.out.println("cycle " + cycle.getSpeed());
            System.out.println(car.getSpeed());
            System.out.println("motorun hizi" + motorcycle.getSpeed());

      }
}

class vehicle {
      private int speed;

      public void speedUp() {
            speed += 10;
      }

      public void speedDown() {
            speed += -10;
      }

      public void setSpeedDown(int speed) {
            this.speed = speed;
      }

      public void setSpeed(int speed) {
            this.speed = speed;
      }

      public int getSpeed() {
            return speed;
      }
}

class Car extends vehicle {
      @Override
      public void speedUp() {
            super.speedUp();
            setSpeed(getSpeed() + 12);

      }
}

class Motorcycle extends vehicle {
      @Override
      public void speedUp() {
            super.speedUp();
            setSpeed(getSpeed() + 15);
      }
}

class Cycle extends vehicle {
      @Override
      public void speedDown() {
            super.speedDown();
            setSpeedDown(getSpeed() - 15);
      }
}