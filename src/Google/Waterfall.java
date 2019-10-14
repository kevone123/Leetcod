package Google;

public class Waterfall {

    public static int water(int[]arr, int cap){
        int steps = 0;
        int sCount = 0;
        int refCount = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum+= arr[i];
            sCount++;
            refCount++;
            if(sum == cap){
                steps+=sCount + refCount;
                sum = 0;
            }
        }
        return steps;
    }
    public static void main(String[]args){
        int [] array = { 2, 4, 5, 1,2};
        System.out.println(water(array, 6));
    }
}
