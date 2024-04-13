



import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLinkedList {

    public static void main(String[] args) {
        int n = 100000; // high quantity of elements
        // ArrayList
        ArrayList<Integer> ArrayList = new ArrayList<>();

        // Add in tail
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            ArrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Add in tail in ArrayList: " + (endTime - startTime) + " ns");

        // Add in head
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            ArrayList.add(0, i);
        }
        endTime = System.nanoTime();
        System.out.println("Add in head in ArrayList: " + (endTime - startTime) + " ns");

        // Add in the middle
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            ArrayList.add(n / 2, i);
        }
        endTime = System.nanoTime();
        System.out.println("Add in the middle in ArrayList: " + (endTime - startTime) + " ns");

        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add in tail
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.addLast(i);
        }
        endTime = System.nanoTime();
        System.out.println("Add in tail in LinkedList: " + (endTime - startTime) + " ns");

        // Add in head
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.addFirst(i);
        }
        endTime = System.nanoTime();
        System.out.println("Add in head in LinkedList: " + (endTime - startTime) + " ns");

        // Add in the middle
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.add(n / 2, i);
        }
        endTime = System.nanoTime();
        System.out.println("Add in the middle in LinkedList: " + (endTime - startTime) + " ns");
        int sum = 0;
        for (Integer num : linkedList) {
            sum += num;
        }

        String longestString = "";
        for (Integer str : linkedList) {
            if (str.longValue() > longestString.length()) {
                longestString = String.valueOf(str);
            }
        }
        System.out.println("Longest String LinkedList: " + longestString);

        int maxElement = Integer.MIN_VALUE;
        for (Integer num : linkedList) {
            if (num > maxElement) {
                maxElement = num;
            }
        }
        System.out.println("Largest element LinkedList: " + maxElement);

        String searchString = "someString";
        int index = -1;
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).equals(searchString)) {
                index = i;
                break;
            }


        }

    }
}


