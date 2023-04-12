import java.util.*;

public class Solution {
    public static void main(String[] args) {
       int n = 30;
       int answer = 0;
        for (int i = 0; i <= n; i++) {
            int k = n - i;
            if (k % 2 == 0){
                answer += k;
            }
        }
        System.out.println(answer);
    }
}