package LinkedList_Problem;

public class Lecture_2 extends Lecture_1{
    public static void main(String[] args) {
        int[] arr={12,3,4,5,6,7};
        Node head=Node.convertArray2LinkedList(arr);

        Node.printlist(head);
    }

}
