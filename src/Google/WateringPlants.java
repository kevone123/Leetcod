package Google;


public class WateringPlants {

    public static int water(int[]plants,int capacity){
        int count = 0;
        int cap = capacity;
        for(int i = 0; i < plants.length; i++){
            count++;
            if(cap >= plants[i]){
                cap -= plants[i];
            } else{
                count += (2*i);
                cap = capacity;
                cap -= plants[i];
            }
        }
        return count;

    }
    public static void main(String[]args){
         int [] array = { 2, 4, 5, 1,2,3,4};
         System.out.println(water(array, 6));
    }
}
