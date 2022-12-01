
package ObjectOrientedDesign;

import ObjectOrientedDesign.Components.Animal;

/*
 * Animal class contains all the information related to only animal.
 * It is generalized class for animal. An abstract information.
 */

public class Abstraction {
  public static void main(String[] args) {
    Animal anim = new Animal();
    anim.setName("cat");
    System.out.println("Animal name: "+anim.getName());
  }
}
