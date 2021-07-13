package lecture.chapter12;

public class BinaryTree<T> {

    private Node<T> root;
    private int size;

    public boolean add(T data){
        Node<T> newNode = new Node<>(data);

        if(root == null){
            root = newNode;
            size++;
            return true;
        }

        return add(root, newNode);
    }

    private boolean add(Node<T> currentNode, Node<T> newNode){

        int compareToResult = ((Comparable)currentNode.getData()).compareTo(newNode.getData());

        if(compareToResult > 0){
            if(currentNode.getLeftNode() != null){
                return add(currentNode.getLeftNode(), newNode);
            } else {
                currentNode.setLeftNode(newNode);
                size++;
                return true;
            }
        } else if (compareToResult < 0){
            if(currentNode.getRightNode() != null){
                return add(currentNode.getRightNode(), newNode);
            } else {
                currentNode.setRightNode(newNode);
                size++;
                return true;
            }
        }

        return false;
    }

    public int size(){
        return this.size;
    }

    public boolean contains(T data){
        // TODO implement contains for Binary Tree
        return false;
    }

    // path traversal

    // in order - left - (part)root - right
    public void printInOrder(){
        if(root == null){
            System.out.println("Baum ist leer");
        } else {
            System.out.println("Ausgabe Baum - In Order:");
            printInOrder(root);
        }
        System.out.println();
    }

    private void printInOrder(Node<T> currentNode){
        if(currentNode.getLeftNode() != null) {
            printInOrder(currentNode.getLeftNode());
        }

        System.out.print(currentNode.getData() + " ");

        if(currentNode.getRightNode() != null){
            printInOrder(currentNode.getRightNode());
        }
    }


    // pre order - current-left-right
    public void printPreOrder(){
        if(root == null){
            System.out.println("Baum ist leer");
        } else {
            System.out.println("Ausgabe Baum - Pre Order:");
            printPreOrder(root);
        }
        System.out.println();
    }

    private void printPreOrder(Node<T> currentNode){
        System.out.print(currentNode.getData() + " ");

        if(currentNode.getLeftNode() != null) {
            printPreOrder(currentNode.getLeftNode());
        }

        if(currentNode.getRightNode() != null){
            printPreOrder(currentNode.getRightNode());
        }
    }

    // post order - left-right-current
    public void printPostOrder(){
        if(root == null){
            System.out.println("Baum ist leer");
        } else {
            System.out.println("Ausgabe Baum - post Order:");
            printPostOrder(root);
        }
        System.out.println();
    }

    private void printPostOrder(Node<T> currentNode){
        if(currentNode.getLeftNode() != null) {
            printPostOrder(currentNode.getLeftNode());
        }

        if(currentNode.getRightNode() != null){
            printPostOrder(currentNode.getRightNode());
        }

        System.out.print(currentNode.getData() + " ");
    }

    private class Node<D> {

        private final D data;
        private Node<D> leftNode;
        private Node<D> rightNode;

        Node(D data){
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }

        D getData(){
            return this.data;
        }

        Node<D> getLeftNode(){
            return this.leftNode;
        }

        void setLeftNode(Node<D> leftNode){
            this.leftNode = leftNode;
        }

        Node<D> getRightNode(){
            return this.rightNode;
        }

        void setRightNode(Node<D> rightNode){
            this.rightNode = rightNode;
        }

    }
}
