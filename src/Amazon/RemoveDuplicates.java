package Amazon;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[]array) {

        /*
           [ 1 1]
           [1 2 2 2 3 3 3]
                      s f

            s = 1
            f = 2
            count = 1
            while f < l - 1
              look for nextr element not equal to s
                 sawp to the element in front
                 fast = slow + 1
                 count+
                 s++

         */
        int count = 1;
        int slow = 1;
        int fast = 1;
        while (slow < array.length - 1) {
            if (array[slow + 1] != array[slow]) {
                    array[slow + 1] = array[fast];
                    fast++;
            }
            slow++;
        }

        return fast;
    }


    public static void main(String[] args){
        int[] array = { 2 , 2, 2, 2, 2, 2};
        System.out.println(removeDuplicates(array));
    }
}
