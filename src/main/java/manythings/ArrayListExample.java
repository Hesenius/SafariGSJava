package manythings;

import java.util.ArrayList;

public class ArrayListExample {
  public static void main(String[] args) {
    // <String> is COMPILE TIME ONLY...
    // provides consistency of use checking
    ArrayList<String> stuff = new ArrayList();
    // no subscript access
    stuff.add("Hello");
    stuff.add("Bonjour");

    // basic syntax does not validate what's added to the structure
//    stuff.add(99);
    System.out.println(stuff);
    System.out.println(stuff.get(0));

    // with "generics" <String>, cast is created for us by the compiler
    String s = stuff.get(0);

//    String s = (String)stuff.get(2);// not safe if this is int...
//    System.out.println(s);

    // List interface
    // exceptions
    // methods more generally
    // classes/objects
  }
}
