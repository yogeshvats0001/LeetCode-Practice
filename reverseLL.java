/* 206. Reverse Linked List
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * 
 * Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
 * 
 * Input: head = [1,2]
Output: [2,1]
 * 
 * Input: head = []
Output: []

 * Important Question for placement!!
 */

import java.util.Scanner;

public class reverseLL {
    public static Scanner scan = new Scanner(System.in);

    public static Node takeInput(){
        Node head = null, tail = null;
        int data = scan.nextInt();
        while(data != -1){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = tail.next;
            }
            data = scan.nextInt();
        }
        return head;
    }

    public static void print(Node head){
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static Node reverse(Node head){
        //BC
        if(head == null || head.next == null) return head;

        //RC+Processing(Head Recursion)
        Node smallerNode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return smallerNode;
    }

    public static void main(String[] args) {
        Node head = takeInput();
        System.out.println("Original LL: ");
        print(head);
        head = reverse(head);
        System.out.println("Reversed LL:");
        print(head);
    }
}


class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
}
