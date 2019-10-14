package Yelp;

import java.util.*;


//Find topic occurrences in reviews

public class YelpOA {

    public static int numOccurrences(Map<String,List<String>> allTopics, List<String> reviews){
        int occurNum = 0;
        Set<String> set = new HashSet<>();

        //fill set with topics from hmap
        for(List<String> topics : allTopics.values())
            for(String topic : topics)
                if(!set.contains(topic)) set.add(topic);


        //find occurrences in reviews
        for(String review : reviews){
            String[] words = review.split(" ");
            for(String word : words) if(set.contains(word)) occurNum++;
        }

        return occurNum;

    }

    public static  int numbOcc(Map<String,List<String>> topics, List<String>reviews){
        // turn the map into a set
        // loop through topics
        // if you see a topic the same as reviews
        // incretemnt count
        //return count
        Set list = new HashSet();
        for(List<String>lists:topics.values()){
            for(String top: lists){
                if(!list.contains(top)) list.add(top);
            }
        }
        int count = 0;
        String top = "";
        for(Iterator<String> it = list.iterator(); it.hasNext();){
            top = it.next();
            for(int fast = 0 ; fast <  reviews.size(); fast ++)
                if(reviews.get(fast).contains(top)) {
                    count++;
                }
            }
        return count;
        }

        public static void main(String[]args) {
         /*
 topics={"Price":["cheap","expensive","price"],"Business":["gnome","gnomes"],"Harry":["harry"]}
rev = "Harry shurb did Harry cheap price price harry of the gnome gnomes"
          */
            Map<String, List<String>> topics = new HashMap<>();
            ArrayList<Integer> arList = new ArrayList<Integer>();
            arList.addAll(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21));
            List<String> reviews = Arrays.asList("cheap", "expensive", "price");

            List<String> lister = Arrays.asList("cheap", "expensive", "price");
            List<String> seclister = Arrays.asList("cheap", "good", "bad");
            List<String> thirdlister = Arrays.asList("false", "expensive", "price");
            topics.put("Price", lister);
            topics.put("Business", seclister);
            topics.put("harry", thirdlister);
            System.out.println(numOccurrences(topics, reviews));

            String wierd = "cheap expensive price";
            String other = "chea";
            String word[] = wierd.split(" ");
            for (String let : word) {
                System.out.println(let.equals(other));
            }
        }





}
