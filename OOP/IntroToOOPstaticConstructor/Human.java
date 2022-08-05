package OOP.IntroToOOPstaticConstructor;

import javax.sound.sampled.SourceDataLine;

public class Human {
   int age;
   String name;
   int salary;
   boolean married;
  static long population;
  //when a member a declared static it can be accessed before any of the object of the class is being created and
   // without referecing to an object


   public Human(int age, String name, int salary, boolean married) {
      this.age = age;
      this.name = name;
      this.salary = salary;
      this.married = married;
      this.population +=1;

      //In order to access static variable we should use class name



   }

//what if there is some property which is common to all the Human
// Population is common for all the human so we can make it static
   //it means  static is not dependent on object
   // it is not logically related to object






}


