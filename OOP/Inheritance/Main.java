package OOP.Inheritance;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(box1);


//        System.out.println(box1.l + " " + box1.w + " " + box1.h);
//        System.out.println(box2.l + " " + box2.w + " " + box2.h);
        // l is private here change it to public in main to access it


     //It is type of the reference variable that determine what variable can be accessed


        Box box5 = new BoxWeight(2,3,4,8);
    }

}
