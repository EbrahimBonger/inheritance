class Person2 extends Person {
    //data
    int age;
    /*
        mentioning the name and ssn data is not neccessary
        at this point since this child class extending the super Person class's
        memebrs which includes name and ssn
    */

    //constructor
    public Person2(String name, String ssn, int age){
        this.name = name; // extendes from supper class
        this.ssn = ssn;  // extendes from supper class
        this.age = age;
    }

    //accessor
    public int getAge(){
        return age;
    }

    public static void main(String[] argv) {
        Person2 p = new Person2("Alex", "34-34-34", 22);
        System.out.println(p + ", age =" + p.getAge());
    }
}