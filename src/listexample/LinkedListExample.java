package listexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        //declaring ArrayList
        LinkedList<Integer> list1 = new LinkedList<>();

        // add the values
        list1.add(34);
        list1.add(56);
        list1.add(33);
        list1.add(12);
        list1.add(90);
        list1.add(56);
        //list1.add(null);
        list1.add(33);
        list1.add(10);
        //list1.add(null);
        list1.add(5);

        System.out.println("list1 is : "+list1);

        // removing
        list1.remove(3);
        System.out.println("list1 after removing 3rd index : "+list1);
        list1.remove(0);
        System.out.println("list1 after removing 0th index : "+list1);

        //search
        System.out.println("2nd index element is : "+list1.get(2));
        System.out.println("5th index element is : "+list1.get(5));

        //size
        System.out.println("length of list1 is : "+list1.size());

        //sort
        Collections.sort(list1);//sort in ascending order
        System.out.println("list1 in ascending order : "+list1);

        Collections.sort(list1, Collections.reverseOrder());//sort in descending order
        System.out.println("list1 in descending order : "+list1);

        // traverse using foreach
        System.out.println("traverse using foreach");
        for(Integer l1 : list1){
            System.out.println(l1);
        }
    }
}
