package Yelp;


import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.Array;
import java.util.*;

class Event{
    String eventType;
    int Id;
    int occurrence;
    public Event(String eventType, int occurrence, int Id){
        this.Id = Id;
        this.occurrence = occurrence;
        this.eventType = eventType;
    }
}
public class ActBuissness {

    public static List ActBussiness(List<Event>events){
        List<Integer> result = new ArrayList<>();
        double avgAd = 0,addOcc = 0, addCount = 0, adAct = 0;
        double avgPageView = 0,pageOcc = 0, pageCount = 0,pageAct ;
        double avgPhoto_View = 0,photoOcc = 0, photoCount = 0, pohotAct = 0;
        double avgReviews = 0,reviewOcc = 0, reviewCount = 0, revAct = 0;
        String eventTtype = "";
        double eventOcc = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int eventId = 0;
        for( int i = 0 ; i < events.size() ; i++){
            eventTtype = events.get(i).eventType;
            eventOcc = events.get(i) .occurrence;
            switch (eventTtype){
                case "ads" :
                     addOcc += eventOcc;
                     addCount++;
                     break;
                case "page_views":
                    pageOcc += eventOcc;
                    pageCount++;
                    break;
                case "review":
                    reviewOcc += eventOcc;
                    reviewCount++;
                    break;
                case "photo_views":
                    photoOcc += eventOcc;
                    photoCount++;
                    break;
                default:
                    System.out.println("no event");
            }
        }
        avgAd = addOcc / addCount;
        avgPageView = avgPageView / pageCount;
        avgPhoto_View = photoOcc / photoCount;
        avgReviews = reviewOcc / reviewCount;

        for(int i = 0 ; i < events.size() ; i++ ){
            eventId = events.get(i).Id;
            eventTtype = events.get(i).eventType;
            double eventOccrInst = events.get(i).occurrence;
            switch (eventTtype){
                case "ads" :
                    if(avgAd <= eventOccrInst ){map.put(eventId,map.getOrDefault(eventId, 0)+1);}
                    break;
                case "page_views":
                    if(avgPageView <= eventOccrInst ){map.put(eventId,map.getOrDefault(eventId, 0)+1);}
                    break;
                case "review":
                    if(avgReviews <= eventOccrInst ){map.put(eventId,map.getOrDefault(eventId, 0)+1);}
                    break;
                case "photo_views":
                    if(avgPhoto_View <= eventOccrInst ){map.put(eventId,map.getOrDefault(eventId, 0)+1);}
                    break;
            default:
                    System.out.println("no event");
            }
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.printf("Id is %d and value is %d ", entry.getKey(), entry.getValue());
            if(entry.getValue() >= 2){
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);
    return result;

    }
    public static void main(String[]args){
        List<Event>events = new ArrayList<>();
        events.add(new Event("ads",7,3));
        events.add(new Event("ads",8,2));
        events.add(new Event("ads",5,1));
        events.add(new Event("page_views",11,2));
        events.add(new Event("page_views",12,3));
        events.add(new Event("page_views",10,3));
        events.add(new Event("review",7,2));
        System.out.println(ActBussiness(events).toString());

    }
}
