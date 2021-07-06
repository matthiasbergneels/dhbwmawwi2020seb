package lecture.chapter12;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> myNameList = new LinkedList<String>();

        System.out.println("Klaus: " + myNameList.contains("Klaus"));

        myNameList.add("Klaus");
        myNameList.add("Franz");
        myNameList.add("Gabi");
        myNameList.add("Steffi");
        myNameList.add("Michel");
        // myNameList.add(new Object()); --> geht nicht, wegen Generic Typisierung


        System.out.println("Klaus: " + myNameList.contains("Klaus"));
        System.out.println("Gabi: " + myNameList.contains("Gabi"));
        System.out.println("Michel: " + myNameList.contains("Michel"));
        System.out.println("Fritz: " + myNameList.contains("Fritz"));

        myNameList.printList();

        myNameList.print();

    }
}
