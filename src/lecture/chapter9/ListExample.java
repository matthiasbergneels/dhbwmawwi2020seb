package lecture.chapter9;

import lecture.chapter5.Student;
import lecture.chapter6.Bird;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> myNameList = new ArrayList<>();

        myNameList.add("Klaus");
        myNameList.add("Fritz");
        myNameList.add("Dietmar");
        myNameList.add("Colin");
        myNameList.add("Gabi");
        //myNameList.add(new Student());
        //myNameList.add(new Bird(true));


        System.out.println("Name Index 2: " + myNameList.get(2));
        System.out.println("Enthält Colin? " + myNameList.contains("Colin"));
        System.out.println("Anzahl an Namen: " + myNameList.size());

        System.out.println("Iteration: For-Each");
        for(String name : myNameList){
            System.out.println("Name: " + name);
            /* merke - modifizieren der Liste während der Iteration problematisch --> Colin fehlt! :,-(
            if(myNameList.get(i).equals("Dietmar")){
                myNameList.remove(i);
            }
            */
        }

        System.out.println("Iteration: For");
        for(int i = 0; i < myNameList.size(); i++){
            System.out.println("Name("+i+"): " + myNameList.get(i));
            /* merke - modifizieren der Liste während der Iteration problematisch --> Colin fehlt! :,-(
            if(myNameList.get(i).equals("Dietmar")){
                myNameList.remove(i);
            }
            */
        }

        // Sequentieller Zugriff mit Iterartor
        System.out.println("Iteration: Iterator");
        Iterator<String> myNameListIterator = myNameList.iterator();
        // myNameList.add("Gabi"); --> RuntimeException: java.util.ConcurrentModificationException
        while(myNameListIterator.hasNext()){
            String name = myNameListIterator.next();
            System.out.println("Name: " + name);
            if(name.equals("Dietmar")){
                myNameListIterator.remove(); // --> Colin ist noch da! :-D
            }
        }

    }
}
