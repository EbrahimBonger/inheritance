class Customer extends Person {
    // data
    int loyality;
    
    //constructor
    public Customer(String name, String ssn, int loyality){
        super(name, ssn);
        this.name  = name;
        this.ssn = ssn;
        this.loyality = loyality;
    }

    // overiding toString() method
    public String toString() {
        return "Customer: name=" + name + ", " + loyality + " years with the company";
    }

    // a new method
    public double discountRate(){
        if( (loyality >= 1) && (loyality < 5) ){
            return 0.95;
        } else if ( (loyality >= 5) && (loyality < 10) ){
           return 0.75;
        } else if( loyality >= 10 ){
            return 0.50;
        } else {
            return 1.0;
        }
    }

}