package lecture.chapter12;

public class BinaryTree<T> {

    private Node<T> root;

    public boolean add(T data){
        Node<T> newNode = new Node<>(data);

        if(root == null){
            root = newNode;
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
                return true;
            }
        } else if (compareToResult < 0){
            if(currentNode.getRightNode() != null){
                return add(currentNode.getRightNode(), newNode);
            } else {
                currentNode.setRightNode(newNode);
                return true;
            }
        }

        return false;
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
