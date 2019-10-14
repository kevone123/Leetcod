package Yelp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class meals{
    String name;
    ArrayList ingred;
    meals(String name , ArrayList ingred){
        this.name = name;
        this.ingred = ingred;
    }
}
public class Equality {

    public static int checkDup(List<meals>meal){
        int count = 0;
        List ingred;
        List nxtingred;
        int result = 0;
        for( int indx = 0 ;indx < meal.size();indx++){
            ingred = meal.get(indx).ingred;
            System.out.println(ingred);
            for(int nxt = indx+1; nxt < meal.size(); nxt++){
                nxtingred = meal.get(nxt).ingred;
                System.out.println(ingred.toString());

                for(int i = 0; i < ingred.size(); i ++){
                    for( int j = 0 ; j < meal.size(); j++){
                        if(ingred.get(i) == nxtingred.get(j)){
                            count++;
                        }
                    }
                }
                System.out.println("this is count" + count);
                if( count != ingred.size()){
                    result++;
                }
                count = 0;

            }
        }

        return result;
    }
    public static void main(String[]args){

     String ing1[] = { "bread","cheese","fish"};
     String ing2 [] = {"bread","cheese","fish"};
     ArrayList list1 = new ArrayList();
     ArrayList list2 = new ArrayList();
     ArrayList list3 = new ArrayList();
     list1.add("bread");
        list1.add("rice");
        list1.add("fish");

        list2.add("bread");
        list2.add("rice");
        list2.add("fish");

        list3.add("red");
        list3.add("blue");
        list3.add("bread");



        List<meals> mealsList = new ArrayList<>();
     mealsList.add(new meals("jo burger", list1 ));
        mealsList.add(new meals("fo burger", list2 ));
        mealsList.add(new meals("bo burger", list3 ));


        System.out.println( checkDup(mealsList));




    }

}
