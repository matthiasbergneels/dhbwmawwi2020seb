package lecture.chapter12;

public class LinkedList<T> {

    private Node<T> firstNode;


    public void add(T data){
        Node<T> newNode = new Node<T>(data);

        if(firstNode == null){
            firstNode = newNode;
            return;
        }

        Node currentNode = firstNode;
        while(currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }

        currentNode.setNextNode(newNode);
    }

    public boolean contains(T data){

        if(firstNode == null){
            return false;
        }

        Node<T> currentNode = firstNode;
        while(currentNode.getNextNode() != null){
            if(currentNode.getData().equals(data)){
                return true;
            }
            currentNode = currentNode.getNextNode();
        }

        if(currentNode.getData().equals(data)){
            return true;
        }

        return false;
    }
    
    public boolean remove(T data){
        return false;
    }

    public int size(){
        return 0;
    }



    public void printList(){
        if (firstNode == null) {
            System.out.println("Liste ist leer");
            return;
        }

        System.out.println("Liste:");
        Node<T> currentNode = firstNode;
        System.out.println(currentNode.getData());
        while(currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
            System.out.println(currentNode.getData());
        }

        System.out.println("Ende der Liste");
    }

    public void print(){
        if (firstNode == null) {
            System.out.println("Liste ist leer");
            return;
        }

        System.out.println("Liste:");
        print(firstNode);
        System.out.println("Ende der Liste");
    }

    private void print(Node<T> currentNode){
        System.out.println(currentNode.getData());
        if(currentNode.getNextNode() != null){
            print(currentNode.getNextNode());
        }
    }

    private class Node<D>{

        private D data;
        private Node nextNode;

        public Node(D data){
            this.data = data;
            this.nextNode = null;
        }

        public void setNextNode(Node nextNode){
            this.nextNode = nextNode;
        }

        public Node getNextNode(){
            return this.nextNode;
        }

        public D getData(){
            return this.data;
        }
    }
}
