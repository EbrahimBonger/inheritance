

public class TestPoly {

 public static void main(String[] argv) {
  Customer c = new Customer("John", "123-12-1234", 2);
  System.out.println(c); // What gets printed?

  Employee e = new Employee("Paul", "234-23-2345", 50000);
  System.out.println(e); // What gets printed?

  // Declare some Person variables.
  Person p1, p2, p3, p4;

  // Person variables can hold Person instances
  p1 = new Person("George", "345-45-3456");
  p2 = new Person("Ringo", "456-45-4567");

  // ... as well as subclass instances
  p3 = c; // c is a Customer.
  p4 = e; // e is an Employee.

  System.out.println("Person data: ");

  // Q. Which toString() is called?
  // A. the toString() method in the super class
  System.out.println(p1);
  System.out.println(p2);

  //Q. Which toString() is called?
  
  // A. the toString() method in the Customer class
  System.out.println(p3);

  // Which toString() is called?
  // A. the toString() method in the Employee class
  System.out.println(p4);


  
    // In what cases does polymorphism work correctly for the lines below?
    // Polymorphism works for the lines of 4, 5, 8, and 9.

    // Employee e0 = new Employee ("Gullible Gus", "555-55-5678", 50000);
    // Employee e1 = new Customer ("Gullible Gus", "555-55-5678", 5);
    // Person e2 = new Employee("Zany Zoe", "112-12-1212");
    // Person p11 = new Customer ("Gullible Gus", "555-55-5678", 5);
    // Person p22 = (Person) e0;
    // Customer c1 = (Person) p11;
    // Customer c2 = p11;
    // Person p33 = (Employee) e0;
    // Person p44 = e0; 

 }
}
