package testClass;

import test.testry ;
public class testerClass {

    public static void main(String[]args){
        testry ford = new testry();
      ford.glob = 4;
        testry sord = new testry();
      sord.food = 2;
      ford.food = 3;

      System.out.println(ford.glob);
      System.out.println(sord.glob);


        System.out.println(ford.food);
        System.out.println(sord.food);
    }
}
