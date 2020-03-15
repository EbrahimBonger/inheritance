Public class Person {
    //data
    String name;
    String ssn;

    //Constructor
    Public Person(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }

    Public Person(){
        name = ssn = "Not Initialized";
    }

    // Accessor
    Public String getName(){
        return name;
    }

    Public String getSSN(){
        return = ssn;
    }
}