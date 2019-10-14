package Yelp;

import java.util.*;

/**
 * Business class that consists of a business name and a hashmap of nearby businesses.
 */
class Business {
    /**
     * The name of the business.
     */
    String name;

    /**
     * A Map of nearbyBusinesses where the key is the nearby Business object
     * and the value is distance from the current Business to the nearby Business.
     */
    Map<Business, Integer> nearbyBusinesses;

    public Business(String name) {
        this.name = name;
        this.nearbyBusinesses = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

    public Map<Business, Integer> getNearbyBusinesses() {
        return this.nearbyBusinesses;
    }
}

class Solution {

    static List <String> nameBs;

    public static void visit(Business startingBuisness, int crrDistance, Map<Business, Integer> nearBy){
        if(nearBy.size() == 0){
            return;
        }
        Business nextNearBy;
        int nextNearByDistance;
        int DistV = crrDistance;
        for(Map.Entry<Business, Integer> entry: nearBy.entrySet()){
            nextNearBy = entry.getKey();
            nextNearByDistance = entry.getValue();
            if(nextNearByDistance <= DistV){
                nameBs.add(nextNearBy.getName());
                crrDistance = DistV - nextNearByDistance;
                visit(nextNearBy, crrDistance, nextNearBy.getNearbyBusinesses());
            }
        }
    }
    public static List<String> findReachableBusinesses(Business startingBusiness, int distance) {
        // todo
        nameBs = new ArrayList<>();
        visit(startingBusiness,distance,startingBusiness.getNearbyBusinesses());
        return nameBs;
    }

    public static void main(String[]args){
       Business businessA = new Business("A");
       Business businessB = new Business("B");
       Business businessC = new Business("C");
       Business businessD = new Business("D");
       businessA.getNearbyBusinesses().put(businessB,2);
        businessA.getNearbyBusinesses().put(businessC,4);
        businessB.getNearbyBusinesses().put(businessD,5);

        System.out.println(getClosestToK(businessA, 7).toString());

    }



    public static List getClosestToK(Business start,int K) {
        List result = new ArrayList<>();
        Map<Business, Integer> parentDistanceMap = new HashMap<>();
        parentDistanceMap.put(start, 0);

        Queue<Business> queue = new LinkedList<>();
        queue.add(start);

        while(!queue.isEmpty()) {
            Business curr = queue.poll();
            for(Map.Entry<Business, Integer> business : curr.getNearbyBusinesses().entrySet()) {
                Integer distance = business.getValue() + parentDistanceMap.get(curr);
                if(distance <= K) {
                    queue.add(business.getKey());
                    parentDistanceMap.put(business.getKey(), distance);
                }
            }
        }


        for(Map.Entry<Business, Integer> entry : parentDistanceMap.entrySet()) {
            if(entry.getKey() != start) {
                result.add(entry.getKey().getName());
            }
        }
        return result;
    }




}