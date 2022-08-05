package OOP.IntroToOOPstaticConstructor;
// outside classes can not be static: because it itself is not dependent on any class
// only inner classes can be static
public class InnerClasses {

    class Test{
     String name;

        public Test(String name) {
            this.name = name;
        }
    }


    public static void main(String[] args) {
//        Test a = new Test("Sansksar");

    }
}

