import java.util.*;

public class Main {
    public static boolean checkBrackets(String str) {
        int count = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;

                if (count < 0) {
                    return false;
                }
            }
        }

        return count == 0;
    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "(()()((())))";
        String s3 = "(((())()";
        System.out.println(checkBrackets(s1));
        System.out.println(checkBrackets(s2));
        System.out.println(checkBrackets(s3));
    }
}