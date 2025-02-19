import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayToLinkedList {
    public static void main(String[] args) {
    
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);

        System.out.println("LinkedList: " + linkedList);
    }
}
