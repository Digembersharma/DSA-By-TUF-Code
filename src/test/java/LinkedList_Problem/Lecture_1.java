package LinkedList_Problem;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }


    public static Node convertArray2LinkedList(int[] arr) {
        // what we have to solve the following condition how we can do this

        Node head = new Node(arr[0]);

        Node mover = head;
        for (int i = 1; i < arr.length;i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover=temp;

        }
        return head;// here we can do all the following condition in the sprite anc voice artist

    }

    public static void printlist(Node head) {
        Node mover = head;
        while (mover != null) {

            System.out.print(mover.data + " ");
            mover = mover.next;


        }
        System.out.println();
    }

    // triversing the linked
    public static int size(Node head) {
        Node mover = head;
        int count = 0;
        // when we have give the elmentt
        while (mover != null) {

            mover = mover.next;
            count++;


        }
        return count;
    }
    public static void find_cyclic_or_not(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;
            if(slow.data==fast.data){
                System.out.println("there is a cycle present");
                return;
            }
            else{
                System.out.println("there is no data present");
            }
        }
    }
}


    public class Lecture_1 {
        public static boolean find_cyclic_or_not(Node head){
            boolean answer=false;
            if(head==null){
                return answer;
            }
            Node slow = head;
            Node fast = head;
            while(fast!=null && fast.next!=null){
                slow= slow.next;
                fast=fast.next.next;
                if(slow.data==fast.data){
                    System.out.println("there is a cycle present");
                    return true;

                }



            }
            System.out.println("there is no data present");
            return answer;
        }
    // how we can do it and solve the following condition coming in the starting point coming in the rather problmem
        public static void main(String[] args) {
            // how we cansolve tthe following condition
            Node node = new Node(32);
            System.out.println(node.data);
            int[] arr = { 3,2,0,-4};
           Node head =  Node.convertArray2LinkedList(arr);
            System.out.println(" the linked list is");
            Node.printlist(head);
             int ans = Node.size(head);
            System.out.println(" the size of linked list is=");
            System.out.println(ans);
            System.out.println(find_cyclic_or_not(head));


        }
    }

