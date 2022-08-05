package OOP.Inheritance;

public class BoxWeight extends Box {

    double weight;

    public BoxWeight() {
       this.weight = -1;
    }
    BoxWeight (BoxWeight other){
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // call the parent class constructor
        // used to initialise values present in parent class constructor

        // Second use case is we can use super keyword as this keyword but it will used to access the super class
        // keyword
//        System.out.println(super.w);
// We can also use this keyword here but whatif both super class and child class has a variable of same name then
// this will point to the nearest variable and super will refer to the super class variable
        this.weight = weight;
    }
}
