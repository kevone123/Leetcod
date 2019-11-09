package Amazon;

import java.util.Arrays;

public class MergeSort {


    public static void mergeSort(int[] mergeArray, int start , int end, int [] array){
         // split into two half until the two pointers are past each other

        if( start >= end) return;

        int mid = (start+end)/2;

        mergeSort(mergeArray,start,mid,array);
        mergeSort(mergeArray, mid + 1 , end , array);
        merge(mergeArray, start,mid,end, array);

    }

    public static void merge(int[] mergeArray, int low, int mid, int high,int[] array){
        int start = low;
        int startEnd = mid;
        int rightStart = mid + 1;
        int rightEnd = high;
        int indx = startEnd;
        int sideze =  rightEnd - rightStart + 1;
        while( start <= startEnd  && rightStart <= rightEnd){
            if(array[start] <= array[rightStart]){
                mergeArray[indx] = array[start];
                start++;
            } else {
                mergeArray[indx] = array[startEnd];
                rightStart++;
            }
            indx++;
        }
        //copy start adnd end to new array
        System.arraycopy(array,start,mergeArray,indx,startEnd - start + 1);
        System.arraycopy(array,start,mergeArray,indx,rightEnd - rightStart + 1);
        System.arraycopy(mergeArray,start,array,start, sideze);

       /*
          start from  start +  middle
          start from mid+1
          compare them
          //rightstart = middle+1
          // while start is less than middle and middle start < midle end
            //if the element at the start is less than the element at rightStart
                  //element at the start will go first i ntemp else the opposite

             coppy all of temps to the merge Array
          store the new comparisons in the array
        */
    }

    public static void main(String[]args){
        //repeatedly split
        // replitedy merge when equal to 1
        /*
          do this recursively3

          merege: looks at two sudo sub arrays
          defined by variables
         */
        int [] orig = { 5, 8 ,4, 5 ,8};
        int [] newA = new int [50];
        mergeSort(newA,0,orig.length - 1, orig);
        System.out.print(Arrays.toString(orig));


    }
}
