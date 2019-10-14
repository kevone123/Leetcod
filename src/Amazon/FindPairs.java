package Amazon;
import java.io.*;
import java.util.*;

public class FindPairs {


    static int[][] findPairsWithGivenDifference(int[] arr, int k) {

        HashMap<Integer,Integer> map = new HashMap();
        ArrayList<Integer[]> result = new ArrayList();
        for(int i = 0; i < arr.length; i++){
            int val = arr[i] - k; //x-k .  going back through, you are wanting to fin d a y such that y = x-k
            map.put(val,arr[i]); //map: x-k = y;   ((x-k),  x) . y
        }
        for(int i = 0; i < arr.length; i++){
            int y = arr[i];
            result = new ArrayList();  //ArrayList<>()?
            Integer [] current = new Integer[2];
            if(map.containsKey(y)){
                current[0] = map.get(y); //Should not this be your x value?
                current[1] =  arr[i]; //should be your y value?
            }
            result.add(current);
        }
        int m = result.size();
        int n = result.get(0).length;
        int [][] finalArray = new int[m][n];
        for(int i = 0; i < result.size(); i++){
            if(result.contains(i)) {
                Integer[] innerArray = result.get(i);
                for (int j = 0; j < n; j++) {
                    finalArray[i][0] = innerArray[0];
                    finalArray[i][1] = innerArray[1];

                }
            }
        }
        return finalArray;
   /*
       a[0]

   */



        //int[][] finalArray = new int [m][n];
        // your code goes here
    /*


       ue a hashmao to store all the numbers in the araray
       key as the number and index as the value

       traverse the array
         get the x - k = y      elemt in the map
       simply store it in a an array and
       store the array insdie 2d array

        return the 2d array

    */
    }

    public static void main(String[] args) {
        int [] arr = {1,5,11,7};
        int k = 1;
        int[][] answ = findPairsWithGivenDifference(arr,k);
        System.out.print(Arrays.deepToString(answ));

    }





}
