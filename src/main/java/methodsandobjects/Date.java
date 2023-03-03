package methodsandobjects;

import java.util.ArrayList;
import java.util.List;

public class Date {
  // private in Java is "anywhere inside the enclosing TOP-LEVEL curly braces"
  private int day;
  private int month;
  private int year;

  public static int getDay(Date self) {
    return self.day;
  }

  public /*static*/ int getDay(Date /*self*/ this) {
    return this.day;
  }

  public static void setDay(Date self, int day) {
    int daysInMonth = daysInMonth(self.month, self.year);

    if (day > 0 && day <= daysInMonth){
      self.day = day;
    } else {
      throw new IllegalArgumentException("Invalid day for this month/year");
    }
  }

  // called "constructor" (from C++) but is actually "Initializer"
  // new alloctes and zeroes the object, then passes it to this
  // for "fillin in the data"
  // passed as an implicit/hidden variable called "this"
  // NOTE, no "return type" not a method
  // Java assumes, if you provide ZERO constructors, it allows
  // non-initialization with zero args. This is REMOVED after we
  // add any constructor of our own
  public Date(int day, int month, int year) {
    // validate the proposed date! throw an exception is bad...
//    super(); // implicit
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public Date(int day, int month) {
    this(day, month, 2023);
    //
  }

  public static boolean isLeapYear(int year) {
    // && || short-circuiting logical and / or
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }

  public static String monthName(int month) {
    // List.of Java 9 or newer...
    List<String> names = List.of("January", "Feburary" /* and more */);
    return names.get(month - 1);
  }

  public static int daysInMonth(int month, int year) {
    // expression form of switch
    return switch(month) {
      case 9, 4, 6, 11 -> 30;
      case 2 -> isLeapYear(year) ? 29 : 28;
      default -> 31;
    };
  }
  // methods in Java can be "overloaded" the real "name"
  // INCLUDES the argument type sequence
  // all argument passing is positional

  public static void tomorrow(Date self) {
    self.day++; // grossly inadequate logic!!!
  }
  // called an "override" argument type sequence is identical
  // to a method in the parent (in this case, the parent is java.lang.Object
  public String toString(Date this) {
    return "Date: d=" + this.day + " m=" + this.month;
  }
}

class Holiday extends Date {
  private String name;
  public Holiday(int d, int m, int y, String name) {
    super(d, m, y); // must be first
    this.name = name;
  }

  @Override
  public String toString(){
    return "Holiday d=" + this.getDay() + " named " + name;
  }
}

class UseDates {
  public static void main(String[] args) {
    System.out.println("is 2000 a leap year " + Date.isLeapYear(2000));

    int birthDay = 12;
    int birthMonth = 9;
    int birthYear = 2020;

//    List<int, int, int> // NOPE, list is of single "things"
//    Date birth = new Date();
//    System.out.println(birth.day);
//    birth.day = 12;
//    birth.month = 9;
//    birth.year = 2023;
//
    Date birth = new Date(12, 9, 2023);
//    System.out.println(birth.day);
    System.out.println(Date.getDay(birth));
    System.out.println(birth.getDay());

    List<Date> ld = new ArrayList<>();
    ld.add(birth);

    Date.tomorrow(birth);
//    System.out.println(birth.day);
    System.out.println(Date.getDay(birth));
    System.out.println(birth.getDay());

//    birth.day = 99; // INVALID!!!
//    Date.setDay(birth, 99); // INVALID!!!
    System.out.println(Date.getDay(birth));
    System.out.println(birth.getDay());

    // Holiday is a Date
    Date h1 = new Holiday(1, 1, 2024, "New Year's Day");

    System.out.println(birth);
    System.out.println(h1);

  }
}
