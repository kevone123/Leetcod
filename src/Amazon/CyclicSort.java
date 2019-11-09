package Amazon;

import java.sql.SQLOutput;
import java.util.Arrays;

public class CyclicSort {
    public static void swap(int[]arry, int i, int j){
        int temp = arry[i];
        arry[i] = arry[j];
        arry[j] = temp;
    }
    public static int[] returnCyc(int[]arry){
        int temp = 0;
        /*
          [ 3 2 1 4]
              s
            is it in right spot no
             go to s[3] and
              store temp[s3]
              swap
              [1 2 3 4]
              you know you are in right spot if the current eleent
              is at a[i -1] = i
         */
        int i = 0;
        while(i < arry.length){
            int j = arry[i] - 1;
            if(arry[j] != arry[i]){
                swap(arry,i, j);
            }
            i++;
        }

        return arry;
    }

    public static void main(String[]args){
        int[]arry = {3,2,1,4};
        System.out.println(Arrays.toString(returnCyc(arry)));
    }
}

