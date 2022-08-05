package OOP.IntroToOOPstaticConstructor;
// when we want only one instance to be created that is only one object is allowed
public class Singleton {


    // it is just a class that can only creat one object

    // if we want only one object we should not allow any one to call contructor of this class

//    just make the construtor private

private static Singleton instance;


     private static Singleton getInstance() {
        if(instance == null)
            instance = new Singleton();

        return instance;
    }

}
