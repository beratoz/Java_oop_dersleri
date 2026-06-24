
import java.lang.System;

public class Stack {

      private int[] elements;
      private int size;
      public static final int default_capacity = 16;

      Stack() {
            this(default_capacity);
            System.out.println("size" + size);
      }

      Stack(int size) {
            elements = new int[size];

      }

      public void push(int value) {
            if (size >= elements.length) {
                  int[] temp = new int[elements.length * 2];
                  System.arraycopy(elements, 0, temp, 0, elements.length);
                  elements = temp;

            }

            elements[size++] = value;

      }

      public int pop() {
            return elements[--size];
      }

      public int peek() {
            return elements[size - 1];
      }

      public boolean empty() {
            return size == 0;
      }

      public int getSize() {
            return size;
      }

      public static void main(String[] args) {
            for (int i = 0; i < 20; i++) {
                  ss.push(i);
            }
            System.out.println("stack nesnesinin size degeri " + ss.getSize());
            System.out.println("stack nesnesnin peek metodu" + ss.peek());
            while (!ss.isEmpty()) {
                  System.out.println(ss.pop() + "-");
            }
            S

