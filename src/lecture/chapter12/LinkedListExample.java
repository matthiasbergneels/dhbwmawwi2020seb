package lecture.chapter12;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> myNameList = new LinkedList<String>();

        System.out.println("Enthält Klaus: " + myNameList.contains("Klaus"));

                                    // Komplexität
        myNameList.add("Klaus");    // O(1)
        myNameList.add("Franz");    // O(2)
        myNameList.add("Gabi");     // O(3)
        myNameList.add("Steffi");   // ...
        myNameList.add("Michel");   // O(n)
        // myNameList.add(new Object()); --> geht nicht, wegen Generic Typisierung

        System.out.println("Anzahl Elemente: " + myNameList.size());
        System.out.println("Enthält Klaus: " + myNameList.contains("Klaus"));
        System.out.println("Enthält Gabi: " + myNameList.contains("Gabi"));
        System.out.println("Enthält Michel: " + myNameList.contains("Michel"));
        System.out.println("Enthält Fritz: " + myNameList.contains("Fritz"));

        myNameList.printList();

        myNameList.print();

        System.out.println("Lösche Klaus: " + myNameList.remove("Klaus"));
        System.out.println("Lösche Gabi: " + myNameList.remove("Gabi"));
        System.out.println("Lösche Michel: " + myNameList.remove("Michel"));
        System.out.println("Lösche Fritz: " + myNameList.remove("Fritz"));

        System.out.println("Anzahl Elemente: " + myNameList.size());
    }
}
