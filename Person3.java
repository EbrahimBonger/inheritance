class Person3 extends Person {
    //data
    int age;
    /*
        mentioning the name and ssn data is not neccessary
        at this point since this child class extending the super Person class's
        memebrs which includes name and ssn
    */

    //constructor
    public Person3(String name, String ssn, int age){
        this.name = name; // extendes from supper class
        this.ssn = ssn;  // extendes from supper class
        this.age = age;
    }

    //accessor
    public int getAge(){
        return age;
    }

    // The child class can overidee the parent class's method
    public String toString(){
        return "person3: Name=" + name + ", ssn=" + ssn + ", age=" + age;
    }

    public static void main(String[] argv) {
        Person3 p = new Person3("David", "766-34343-34", 37);
        System.out.println(p);
    }
}