
public class Person {
    //data
    String name;
    String ssn;

    //Constructor
    public Person(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }

    public Person(){
        name = ssn = "Not Initialized";
    }

    // Accessor
    public String getName(){
        return name;
    }

    public String getSSN(){
        return ssn;
    }
 

    public String toString(){
        return "person: Name=" + name + ", ssn=" + ssn;
    }

    public static void main(String[] argv){
        Person p = new Person("John","3132-2321-12312");
        System.out.println(p);
    }
}