/*1290. Convert Binary Number in a Linked List to Integer
 * Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
 Return the decimal value of the number in the linked list.
 The most significant bit is at the head of the linked list.
 *
 * Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
 *
 * Input: head = [0]
Output: 0
 */
import java.util.*;
public class binaryToIntegerLL {
    //we will use recursion for solving this problem
    public static int getDecimalValue(ListNode head, String binary){
        //Base Case
        if(head == null){
            return Integer.parseInt(binary,2);
        }

        //My Call
        binary += Integer.toString(head.val);

        //Recursive Call
        return getDecimalValue(head.next, binary);
    }

    public static int getDecimalValue(ListNode head){
        String binary = "";
        return getDecimalValue(head, binary);
    }

    public static ListNode takeInput(){
        ListNode head = null, tail = null;
        Scanner scan = new Scanner(System.in);
        int data = scan.nextInt();
        while(data != -1){
            ListNode newNode = new ListNode(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
            data = scan.nextInt();
        }
        scan.close();
        return head;
    }

    public static void print(ListNode head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        ListNode head = takeInput();
        System.out.print("Entered Node:");
        print(head);
        System.out.println();
        System.out.println("Decimal Value of given Node: " + getDecimalValue(head));
    }
}

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
        next = null;
    }
}


//Note: In Java, we do have functions like Integer.parseInt(String,2) to convert any string to the decimal value and Integer.toString(int) for converting the int value to string.