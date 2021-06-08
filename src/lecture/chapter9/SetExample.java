package lecture.chapter9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        Set<String> myNameSet = new TreeSet<>();

        myNameSet.add("Colin");
        myNameSet.add("Zeus");
        myNameSet.add("Dietmar");
        myNameSet.add("Gabi");
        System.out.println("Hinzugefügt?: " + myNameSet.add("Colin"));
        System.out.println("Hinzugefügt?: " + myNameSet.add("Susanne"));

        System.out.println("Anzahl Namen: " + myNameSet.size());
        System.out.println("Enthält Zeus? " + myNameSet.contains("Zeus"));

        for(String name : myNameSet){
            System.out.println(name);
        }

        Iterator<String> myNameSetIterator = myNameSet.iterator();
        while(myNameSetIterator.hasNext()){
            String name = myNameSetIterator.next();
            System.out.println("Name: " + name);
            if(name.equals("Dietmar")){
                myNameSetIterator.remove();
            }
        }

        System.out.println("Anzahl Namen: " + myNameSet.size());

    }
}
