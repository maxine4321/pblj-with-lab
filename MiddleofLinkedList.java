import java.util.LinkedList;

public class MiddleofLinkedList {
    public static void main(String[] args) {
       
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        int middleIndex = list.size() / 2;
     
        System.out.println("The middle element is: " + list.get(middleIndex));
    }
}
