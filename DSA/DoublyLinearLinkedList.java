package DSA;

public class DoublyLinearLinkedList {

    private int size;
    private Node head;
    private Node tail;

    public void size(){
        System.out.println("Size of LL is "+size);
    }

    class Node {
        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
            next = null;
            previous = null;
        }
    }

        public void insertFirst(int value){
            Node node = new Node(value);
            if(head == null){
                head = node;
                tail = node;
                size++;
            }else{
                node.next = head;
                head.previous = node;
                head = node;
                size++;
            }
        }
        public void insertLast(int value){
            Node node = new Node(value);
            if(head == null){
               insertFirst(value);
            }else{
                tail.next = node;
                node.previous = tail;
                tail = node;
                size++;
            }
        }
        public void insertAtPos(int value, int index){
            if(index > size){
                System.out.println("Index out of bound");
                return;
            }
            if(index == 1){
                insertFirst(value);
            } else if (index == size) {
                insertLast(value);
            }else {
                Node temp = head;
                int iCnt = 0;
                while (iCnt != index -1){
                    temp = temp.next;
                    iCnt++;
                }
                Node node = new Node(value);
                node.next = temp;
                node.previous = temp.previous;
                temp.previous.next = node;
                temp.next.previous = node;
                size++;
            }
            display();
        }
        public void deleteFirst(){
            if(head == null){
                System.out.println("LL is empty");
            } else if (head== tail) {
                head = tail = null;
                size--;
            }
            else{
                head = head.next;
                head.previous = null;
                size--;
            }
        }
        public void deleteLast(){
            if(head == null){
                System.out.println("LL is empty");
            } else if (head== tail) {
                head = tail = null;
                size--;
            }
            else {
                tail = tail.previous;
                tail.next = null;
                size--;
            }
        }
        public void deleteAtPos(int index) {
        if(index > size){
            System.out.println("Index out of bound. The size of LL is :"+ size);
            return;
        }
        if (index == 1) {
            deleteFirst();
        } else if (index == size -1) {
            deleteLast();
        }else {
            Node temp = head;
            int iCnt = 0;
            while (iCnt != index-1){
                temp = temp.next;
                iCnt++;
            }
            temp.previous.next = temp.next;
            temp.next.previous = temp.previous;
            temp.next = temp.previous = null;

            size--;
        }
        display();

    }

        public void display(){
        if(head == null){
            System.out.println("List is empty");
        }else{
            Node temp = head;
            System.out.print("START->");
            int count = 0;
            while(count < size){
                System.out.print(temp.value+"->");
                temp = temp.next;
                count++;
            }
            System.out.print("END");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        DoublyLinearLinkedList doublyLinkedList = new DoublyLinearLinkedList();
        doublyLinkedList.display();
        doublyLinkedList.insertFirst(9);
        doublyLinkedList.insertFirst(3);
        doublyLinkedList.insertFirst(2);
        doublyLinkedList.insertFirst(22);
        doublyLinkedList.insertFirst(25);
        doublyLinkedList.insertFirst(28);
        doublyLinkedList.insertFirst(19);
        doublyLinkedList.display();

        // Insert Node at Last Pos.
        doublyLinkedList.insertLast(10);
        doublyLinkedList.insertLast(13);
        doublyLinkedList.display();

        // Delete first node in LL
        doublyLinkedList.deleteFirst();
        doublyLinkedList.display();

        //Delete last node
        doublyLinkedList.deleteLast();
        doublyLinkedList.display();

        //Delete node a position.
        doublyLinkedList.deleteAtPos(1);
        //doublyLinkedList.display();

        // Insert node at Position
        doublyLinkedList.insertAtPos(10, 1);

        doublyLinkedList.size();

    }
    }
