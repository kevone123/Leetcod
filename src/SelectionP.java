import java.util.*;
public class SelectionP {


    public static  List<List<Integer>> combinations(int[] n) {
        List<List<Integer>> results = new LinkedList();
        combinations(n, 0, results, new LinkedList<Integer>());
        return results;
    }

    public static void combinations(int[] n, int i, List<List<Integer>> results, List<Integer> path) {
          if (i == n.length) {
            results.add(path);
            return;
        }

        List<Integer> pathWithCurrent = new LinkedList(path);
        pathWithCurrent.add(n[i]);

        // Find all the combinations that exclude the current item
        combinations(n, i+1, results, path);

        // Find all the combinations that include the current item
        combinations(n, i+1, results, pathWithCurrent);
    }

public static void main(String[]args){
    int arr[]={1,2,4};
    List<List<Integer>> results = new LinkedList(combinations(arr));
    for(List<Integer>rs:results){
        System.out.println(rs.toString());
    }

}
/*
Input: an array
Output: an array result

Problem:
    -generate all the different combination
    - I don't get the recursive tree of the problem

Clarifying Questions:
    - how to generate all diff combination

Data Structure:
    -list of List
    -List

Algorithm:
    -select each item in our list
*/

//Code:


//Test Cases:
}
