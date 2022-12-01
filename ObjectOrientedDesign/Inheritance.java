package OjbectOrientedDesign;

import OjbectOrientedDesign.Components.Cat;

/*
 * Cat object inherits Animal class.
 */

public class Inheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("cat");
        System.out.println("Animal name: "+cat.getName());
        System.out.println("Legs: "+cat.getNumberOfLegs());
      }
}
