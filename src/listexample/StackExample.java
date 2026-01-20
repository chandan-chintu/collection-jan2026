package listexample;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> stck1 = new Stack<>();

        stck1.push("Mango");
        stck1.push("Guava");
        stck1.push("Watermelon");
        stck1.push("Pineapple");
        stck1.push("apple");
        stck1.push("orange");
        stck1.push(null);
        stck1.push("Guava");

        System.out.println("stck1 is : "+stck1);

        stck1.pop();
        System.out.println("stck1 after 1st pop : "+stck1);
        stck1.pop();
        System.out.println("stck1 after 2nd pop : "+stck1);

        System.out.println("traverse using foreach");
        for (String s1:stck1){
            System.out.println(s1);
        }
    }
}
