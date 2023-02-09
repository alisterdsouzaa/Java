package DSA;

public class SinglyLinearLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public int getSize(){
        return  size;
    }

    public SinglyLinearLinkedList() {
        this.size = 0;
    }
    // Insert first
    public  void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtPos(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        } else if (index == size) {
            insertLast(val);
            return;
        }
        int count = 0;
        Node temp = head;
        while (count == index - 1){
            temp = temp.next;
            count++;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;

    }

    public void deleteFirst(){
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;
    }

    public void deleteLast(){
        Node temp = head;
        while (temp.next != null){
            if(temp.next.next == null){
                break;
            }
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }

    public void deleteAtPos(int position){
        if(position == 0){
            deleteFirst();
            return;
        }
        else if(position == size){
            deleteLast();
            return;
        }

        int iCnt = 1;
        Node temp = head;
        while (iCnt !=position-1){
            temp = temp.next;
            iCnt++;
        }
        Node temp2 = temp.next;
        temp.next = temp.next.next;
        temp2.next = null;
        size--;

    }


    // Display function
    public void display(){
        Node temp = head;
        System.out.print("START ->");
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }




    // Node
    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        
    }

    public static void main(String[] args) {
        SinglyLinearLinkedList list = new SinglyLinearLinkedList();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(78);
        list.insertFirst(75);

        list.display();

        list.insertLast(50);
        list.display();

        list.insertAtPos(2, 2);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        list.deleteAtPos(2);
        list.display();

        System.out.println(list.getSize());
    }
}
