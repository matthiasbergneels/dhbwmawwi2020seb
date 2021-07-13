package lecture.chapter12;

public class BinarytreeExample {

    public static void main(String[] args) {
        BinaryTree<Integer> numberTree = new BinaryTree<>();

        System.out.println(numberTree.add(6));
        numberTree.add(5);
        numberTree.add(9);
        numberTree.add(10);
        numberTree.add(17);
        numberTree.add(1);
        numberTree.add(4);
        numberTree.add(8);
        System.out.println(numberTree.add(5));

        System.out.println("Baum befüllt!");
    }
}
