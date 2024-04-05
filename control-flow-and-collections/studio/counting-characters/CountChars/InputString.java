package CountChars;

import java.util.HashMap;

public class InputString {


    public static HashMap<Character, Integer> uniqueChars(String input) {
        char[] orig = input.toCharArray();
        HashMap<Character, Integer> charList = new HashMap<>();
        for (char i : orig) {
           if (charList.containsKey(i)) {
               charList.put(i, charList.get(i)+1);
           }
           else
               charList.put(i,1);
        }

        return charList;
    }

    public static void main (String[] args) {
        String testString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        System.out.println(uniqueChars(testString));
    }


}
