/*
 *    Queue DS Implementation
 * ================================
 * File Path     : Queue.java
 * Author        : Alister D'Souza
 * Date          : 12/02/2023
 *
 */

package DSA;

public class Queue {

    public Node first;
    public Node rear;
    public int size = 0;

    static class Node {
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            next = null;
        }
    }

    /*
        Pushes data into the Queue at rear of the Queue.
     */
    public void push(int value) {
        Node node = new Node(value);
        if (first == null) {
           rear = first = node;
        }else{
            rear.next = node;
            rear = node;
            size++;
        }
    }

    /*
      Prints the first element of the Queue
     */
    public void peek(){
        if (first == null) {
            System.out.println("Q is empty");
        }else{
            System.out.println(first.value);
        }
    }

    /*
        pop() : Deletes the first node of the Queue.
     */
    public void pop(){
        if (first == null) {
            System.out.println("Q is empty");
        }else if(first == rear){
            System.out.println(first.value);
            first = rear = null;
        }
        else {
           // System.out.println(first.value);
            first = first.next;
        }
    }

    /*******************************************
     * main routine
     *******************************************/

    public static void main(String[] args) {
            Queue q = new Queue();
            q.push(1);
            q.push(2);
            q.push(3);
            q.push(4);

            q.peek();
            q.pop();
            q.peek();
            q.pop();
            q.pop();
            q.peek();
    }

}
