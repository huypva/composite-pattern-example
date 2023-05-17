package io.github.huypva.compositepattern;

/**
 * @author huypva
 */
public class Main {

  public static void main(String[] args) {
    Leaf leaf1 = new Leaf("1");
    Leaf leaf2 = new Leaf("2");

    Composite composite1 = new Composite("1");
    Composite composite2 = new Composite("2");
    composite2.add(leaf2);

    composite1.add(leaf1);
    composite1.add(composite2);

    composite1.operate();
  }
}
