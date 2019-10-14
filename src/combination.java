import java.util.ArrayList;
import java.util.List;

public class combination {
    public static void  powS(int[]arr,int i,List<Integer>curr,List<List<Integer>>result){
        if(i==arr.length){
            result.add(curr);
            return;
        }
        List<Integer>currPath=new ArrayList<>(curr);
        currPath.add(arr[i]);
        powS(arr,i+1,curr,result);
        powS(arr,i+1,currPath,result);
    }
    public static List<List<Integer>>powS(int []arr){
        List<List<Integer>>result=new ArrayList<List<Integer>>();
        List<Integer>curr=new ArrayList<>();
        powS(arr,0,curr,result);

        return result;
    }
    public static void main(String[]args){
        int [] arr={1,2,3};
        List<List<Integer>>result=new ArrayList<List<Integer>>(powS(arr));
        for(List<Integer>nb:result) {
            System.out.println(nb.toString());
        }
    }

}
/*
Input:
Output:

Problem:
    -

Clarifying Questions:
    -

Data Structure:
    -

Algorithm:
    -
*/

//Code:


//Test Cases:
