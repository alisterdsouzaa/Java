package DSA;

public class CircularSinglyLL {

    private int size;
    private Node head;
    private Node tail;

    public CircularSinglyLL(){
        this.size = 0;
    }
    public void size(){
        System.out.println("Size of LL is "+ size);
    }
    static class Node{
        private final int value;
        private  Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    public void insertAtFirst(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            tail.next = head;
            size++;
        }else {
            node.next = head;
            tail.next = node;
            head = node;
            size++;
            System.out.println();
        }
    }
    public void insertLast(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            tail.next = head;
        }else {
            node.next = tail.next;
            tail.next = node;
            tail = node;
        }
        size++;
    }
    public void insertAtPosition(int value, int position){
        Node node = new Node(value);
        if(position > size || position < 1){
            System.out.println("Invalid Size");
            System.exit(1);
        }
        if(position == 1){
            insertAtFirst(value);
        } else if (position == size) {
            insertLast(value);
        }
        else{
        Node temp = head;
        int count = 1;
        while(count != position-1) {
            temp = temp.next;
            count++;
        }
            node.next = temp.next;
            temp.next = node;
           size++;
        }
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("LL is empty");
        } else if (head == tail) {
            head = null;
            tail = null;
            size--;
        }
        else {
            Node temp = head;
            tail.next = head.next;
            head = head.next;
            temp.next = null;
            size--;
        }
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("LL is empty");
        } else if (head == tail) {
            head = null;
            tail = null;
            size--;
        }
        else {
            Node temp = head;
            int count = 0;
            while (count != size -1){
                temp = temp.next;
                count++;
            }
            temp.next = tail.next;
            tail.next = null;
            tail = temp;
            size--;
        }
    }

    public void deleteAtPosition(int position){
        if(position == 1){
            deleteFirst();
        } else if (position == size) {
            deleteLast();
        }
        else {
            Node temp = head;
            int count = 1;
            while (count != position -1){
                temp = temp.next;
                count++;
            }
            Node temp2 = temp.next;
            temp.next = temp.next.next;
            temp2.next = null;
            size--;
        }
    }

    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        System.out.print("START -> ");
       for (int i = 0; i<size; i++){
           System.out.print(temp.value +"-> ");
           temp = temp.next;
       }
        System.out.print(" END ");
        System.out.println();
    }

}

class Main{
    public static void main(String[] args) {
        CircularSinglyLL circularSinglyLL = new CircularSinglyLL();
      //  circularSinglyLL.display();
        circularSinglyLL.insertAtFirst(2);
        circularSinglyLL.insertAtFirst(1);
        circularSinglyLL.display();
        circularSinglyLL.insertLast(3);
        circularSinglyLL.display();
        circularSinglyLL.insertLast(5);
        circularSinglyLL.display();

        circularSinglyLL.insertAtPosition(10, 1);
        circularSinglyLL.display();
        circularSinglyLL.insertAtPosition(30, 3);
        circularSinglyLL.display();
       // circularSinglyLL.deleteFirst();
        circularSinglyLL.display();
      //  circularSinglyLL.deleteFirst();
        circularSinglyLL.display();

        circularSinglyLL.size();

        // circularSinglyLL.deleteLast();
        circularSinglyLL.display();

        circularSinglyLL.deleteAtPosition(4);
        circularSinglyLL.display();
        circularSinglyLL.deleteAtPosition(4);
        circularSinglyLL.display();


    }
}
