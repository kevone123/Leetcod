package Design;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Object;
import java.util.HashSet;
import java.util.Set;


public class Arr {
    public static void main(String[]args){
        String[] chrArray =  new String[]{"a,","b"};
        String[] rArray = new String[5];
        String[] dec = {"h","4"};
        int[]num = {1,2,3};

        //(2)
        ArrayList<?> newlist = new ArrayList<>(Arrays.asList(num));
        System.out.println(newlist);

        //(3)
          boolean containsL = Arrays.asList(dec).contains("h");
        System.out.println(containsL);

        //(4) combinrlist

        //(5) containing the provided list of elements
      // Apache common langs
       // copy twp arrays

           rArray = Arrays.copyOf(chrArray,chrArray.length);
           rArray = Arrays.copyOf(dec, dec.length);
        System.out.println(rArray.length);

        //(7) convert arraylist to array

        //(8) join elem odf string
         String allItems = String.join("",dec);
        System.out.println(Arrays.toString(rArray));

     //(9) To list and to array
        String[] stringArray = { "a", "b", "c", "d", "e" };
        ArrayList<String> newList = new ArrayList<>(Arrays.asList(stringArray));
        String[] brand = new String[ newList.size()];
        newList.toArray(brand);
        System.out.println(Arrays.toString(brand));
        Set<?> nsET = new HashSet<>(newList);
        System.out.println(nsET.toString());

    }
}
