package DSA;

public class Stack {

    public static Node head;
    public int size;
    static class Node{
        private final int value;
        private Node next;

        Node(int value){
            this.value = value;
        }
    }

    public void push(int value){
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
        size++;
    }

    public  int pop(){
        if(head == null){
            return -1;
        }
        int top = head.value;
        head = head.next;
        return top;
    }

    public int peek(){
       if(head == null){
           return -1;
       }
       return head.value;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(10);

       int popElement = stack.pop();
       System.out.println(popElement);

        while (head != null){
            System.out.println(stack.peek());
            stack.pop();
        }


    }
}
