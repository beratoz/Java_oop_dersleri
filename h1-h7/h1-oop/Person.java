
public class Person {
      private String name;
      private int age;

      public Person(String name, int age) {
            // ad parametresi
            this.name = name;
            this.age = age;
      }

      // kisi adi almak icin
      public String getName() {
            return name;

      }

      public int GetAge() {
            return age;
      }

      // kisinin adini ayarlama yontemi
      public void setName(String name) {
            this.name = name;

      }

      public void setAge(int age) {
            this.age = age;
      }

      public static void main(String[] args) {
            Person person1 = new Person("berat", 20);
            Person person2 = new Person("selen", 20);

            System.out.println(person1.getName() + "is" + person1.GetAge() + "age");
            System.out.println(person2.getName() + "is" + person2.GetAge() + "age");
            // setAge for modify
            person1.setAge(21);
            System.out.println("new age");
            System.out.println(person1.GetAge());

      }
}
