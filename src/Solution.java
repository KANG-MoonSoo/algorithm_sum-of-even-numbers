import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String my_string = "abcdef";
        String letter = "b";
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != letter.charAt(0)){
                answer += my_string.charAt(i);
            }
        }
        System.out.println(answer);
    }
}