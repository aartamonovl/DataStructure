import Homework_3_LinkedList.DoubleLinkedListT;
import Homework_3_LinkedList.LinkedListT;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedListT<Integer> list = new DoubleLinkedListT<>();
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(-1);
        list.add(8);
        list.add(5);

        list.print();
        list.removeAt(3);
        list.print();

        LinkedListT<Integer> list1 = new LinkedListT<>();
        list1.add(3);
        list1.add(1);
        list1.add(7);
        list1.add(-1);
        list1.add(8);
        list1.add(5);

        list1.print();
        list1.removeAt(3);
        list1.print();
    }
}