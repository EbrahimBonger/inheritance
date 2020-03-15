class Employee extends Person {

 int salary;

 // New constructor calling parent's constructor
 public Employee(String name, String ssn, int salaryIn) {
  super(name, ssn);
  salary = salaryIn;
 }

 public void paySalary() {
   System.out.println(name + " was just paid $" + salary);
 }

 // Override the toString() method in Person.
 public String toString() {
  return "Employee: name=" + name + ", salary=" + salary;
 }
}