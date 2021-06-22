package lecture.chapter9;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        Map<String, String> myColorMap = new HashMap<>();

        myColorMap.put("blue", "0000FF");
        myColorMap.put("red", "FF0000");
        myColorMap.put("green", "00FF00");

        System.out.println("Anzahl Farben: " + myColorMap.size());
        System.out.println("Code für Rot: " + myColorMap.get("red"));
        System.out.println("Blau enthalten? " + myColorMap.containsKey("blue"));

        Set myColorKeys = myColorMap.keySet();

        for(Object colorKey : myColorKeys){
            System.out.println("Key: " + colorKey + " - Value: " + myColorMap.get(colorKey));
        }

        System.out.println("TreeSet? " + (myColorKeys instanceof SortedSet));


        Map<Integer, String> myCityMap = new TreeMap<>();

        //myCityMap.put(new Integer(69190), "Walldorf"); --> Konstruktor ist deprecated
        myCityMap.put(Integer.valueOf(69190), "Walldorf");
        myCityMap.put(69181, "Leimen"); // --> auto-boxing (ein Wert einfachen Typs wird in ein Objekt der Wrapper Klasse umgewandelt)

        System.out.println("PLZ 69190: " + myCityMap.get(69190)); // --> auto-boxing

        Set<Integer> myPostalCodes = myCityMap.keySet();

        for(int postalCode : myPostalCodes){ // --> auto-unboxing
            System.out.println("Key: " + postalCode);
        }
    }
}
