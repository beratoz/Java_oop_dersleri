public class visibilit_modifieres {
      public static void main(String[] args) {
            A a1 = new A("sinifin disindan public bir yapici methoda erisildi");
            System.out.println(a1.msg);
            a1.display();

      }

}

class A {
      public String msg = "sinifin disindan sinifa ait public bir degiskene erisildi";
      String info;

      public void display() {
            System.out.println("sinifin disindan public bir methoda erisidi");
            System.out.println(info);
      }

      public A(String info) {
            this.info = info;
      }
}