package Google;

import java.util.*;


public class TreeMap {

    public static void main(String[]args){
        //treeMap with values sorted
        //treeMap with keys sorted
       //  TreeMap (which implements SortedMap) stores automatically the keys in the correct order:

        Map<Integer, String> map = new java.util.TreeMap();
        map.put(1, "one");
        map.put(3, "three");
        map.put(2, "two");
        List<Integer>list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(2);
// prints one two three
        for(Integer key : map.keySet()) {
            System.out.println(map.get(key));
        }
        Collections.sort(list, new Comparator()
                {

                    public int compare(Object o1, Object o2)
                    {
                        String sa = (String)o1;
                        String sb = (String)o2;

                        int v = sa.compareTo(sb);

                        return v;

                        // it can also return 0, and 1
                    }
                }
        );
        System.out.println(list.toString());
    }
}
