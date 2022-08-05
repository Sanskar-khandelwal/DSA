package OOP;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(22, "Kunal Kushwaha", 10000, false);
        Human rahul = new Human(16, "Rahul Kushwaha", 15000, true);

        System.out.println(kunal.population);
        System.out.println(rahul.population);
        // this will work but don't do it, whenever you access or modify static variable always use class Name

//        greeting(); //error
//        // non static method greeting can not be accessed in static method
// A static method can only access static data it can not access non static data


        //you cannot access not static stuff without referencing their instances in a static context

        // here we are referecing it
        Main obj = new Main();
        obj.greeting();


    }
// we know something that is not static belongs to an object
    void greeting() {
        System.out.println("Hello world ");
    }
// this is not dependent on object
    static void fun(){
//        greeting();  // and this is dependent on object

//        System.out.println(this);
        // you can not use this inside static because obviously this is dependent on object or we can say this points
        // to an object and static doesnot depends on object
    }


}
