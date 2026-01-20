package mapexample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> map1 = new HashMap<>();

        map1.put(107,"Guava");
        map1.put(104,"Apple");
        map1.put(103,"Mango");
        map1.put(110,"Watermelon");
        map1.put(105,"Orange");
        map1.put(106,"Grapes");
        map1.put(null,"Pineapple");
        map1.put(102,"Mango");
        map1.put(102,"Banana");// old value gets removed and new value gets added

        System.out.println("map1 is : "+map1);

        map1.remove(105);
        System.out.println("map1 after removing 105 key : "+map1);

        System.out.println("Traverse using foreach");
        for(Map.Entry m1 : map1.entrySet()){
            System.out.println(m1.getKey() + "----"+m1.getValue());
        }
    }
}
