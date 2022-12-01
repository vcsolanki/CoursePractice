
package OjbectOrientedDesign;

import OjbectOrientedDesign.Components.Animal;

public class Abstraction {
  public static void main(String[] args) {
    Animal anim = new Animal();
    anim.setName("cat");
    System.out.println("Animal name: "+anim.getName());
  }
}
