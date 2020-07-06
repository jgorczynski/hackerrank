import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int query = scan.nextInt();
        Pattern p = Pattern.compile("^[a-z]{0,3}\\d{2,8}[A-Z]{3,}");
        Matcher m;
        while(scan.hasNext()){
            m = p.matcher(scan.next());
            if(m.find() == true)
                System.out.println("VALID");
            else
                System.out.println("INVALID");
        }
    }
}