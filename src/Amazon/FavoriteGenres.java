package Amazon;

import java.util.*;

public class FavoriteGenres {
    public static Map<String, Integer> countSongs;
    public static Map<String, List<String>> result;

    public static void addCounts(Set<String> songs, Map<String, List<String>> songGenres, String user) {
        countSongs = new HashMap<>();
        Set<String> set;
        for (String song : songs) {
            //System.out.println(song);
            for (Map.Entry<String, List<String>> entry : songGenres.entrySet()) {
                set = new HashSet();
                List<String> temp = entry.getValue();
                set.addAll(temp);
                //System.out.println(set.toString());
                if(set.contains(song)){
                    int val = countSongs.getOrDefault(entry.getKey(),0)+1;
                    //System.out.println(val);
                    countSongs.put(entry.getKey(),countSongs.getOrDefault(entry.getKey(),0)+1);
                }

            }
        }
        //System.out.println(countSongs.toString());
        // always create a new set inside for each object you are instantiating
        // get the max integer in a hashSet
        //how do u get the second, third other genres csame ocunt
        //check if DT is enpty
        String genre = "";
        int max = 0;
        for(Map.Entry<String, Integer>entry: countSongs.entrySet()){
            int crr = entry.getValue();
            if(crr>max){
                max = crr;
                genre = entry.getKey();
            }
        }
        //System.out.println("this is user"+ user);
         List<String> userGenres = new ArrayList<>();
        //System.out.println(userGenres.toString());
        if(!userGenres.contains(genre)) {
            userGenres.add(genre);
        }
         result.put(user,userGenres);
       // System.out.println(result.toString());
        //System.out.println(max);

        for(Map.Entry<String, Integer>entry: countSongs.entrySet()) {
            int crr = entry.getValue();
            genre = entry.getKey();
            if( crr == max ){
                if(!userGenres.contains(genre)) {
                    userGenres.add(genre);
                    result.put(user, userGenres);
                }
            }
        }

    }

    public static Map<String, List<String>> favoriteGenres(Map<String, List<String>> userSongs, Map<String, List<String>> songGenres ){
        Set<String> set;
        if( songGenres == null){
           for(Map.Entry<String, List<String>> entry:userSongs.entrySet()){
               result.put(entry.getKey(),new ArrayList<>());
           }
        }
        for(Map.Entry<String, List<String>>entry: userSongs.entrySet()){
            set = new HashSet();
            List<String>temp = entry.getValue();
            set.addAll(temp);
            //System.out.println(set.toString());
            addCounts(set,songGenres,entry.getKey());
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Map<String, List<String>> userSongs = new HashMap<String, List<String>>();
        Map<String, List<String>> songGenres = new HashMap<String, List<String>>();
        userSongs.put("David", new ArrayList<String>(Arrays.asList("song1", "song2", "song3", "song4", "song8")));
        userSongs.put("Emma", new ArrayList<String>(Arrays.asList("song5", "song6", "song7")));

        songGenres.put("Rock", new ArrayList<String>(Arrays.asList("song1", "song3")));
        songGenres.put("Dubstep", new ArrayList<String>(Arrays.asList("song7")));
        songGenres.put("Techno", new ArrayList<String>(Arrays.asList("song2", "song4")));
        songGenres.put("Pop", new ArrayList<String>(Arrays.asList("song5", "song6")));
        songGenres.put("Jazz", new ArrayList<String>(Arrays.asList("song8", "song9")));
        countSongs = new HashMap<>();
        result = new HashMap<>();
        favoriteGenres(userSongs, songGenres);
        System.out.println(result.toString());

    }
    /*

      if songGeneres is empty return nothing
      create a set which cintains the songds for each user
      store the number of songs they have in each genre
         in there user songs count if the songs are found in the genre

      Add the maximum and if anything is equal to the maximum
      add the genre to the map
       return map


     */

}
