import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(sc.nextLine());
            sb.append("\n");
        }

        String s = sb.toString();

        String[] words = s.split("(\\s+|\\W+)");

        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            int count = 0;
            String word = sc.nextLine();
            for (String thisWord : words) {
                if (thisWord.equals(word))
                    count += 1;
            }

            System.out.println(count);
        }
    }
}


