package setexample;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<>();

        set1.add("Guava");
        set1.add("Mango");
        set1.add("Apple");
        set1.add("Pineapple");
        set1.add("Watermelon");
        set1.add("Banana");
        set1.add("Guava");
        set1.add("Orange");

        System.out.println("set1 is : "+set1);

        set1.remove("Orange");
        set1.remove("Watermelon");
        System.out.println("after removing set1 is : "+set1);

        System.out.println("traverse using foreach");
        for(String s1 : set1){
            System.out.println(s1);
        }
    }
}
