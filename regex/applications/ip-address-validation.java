import java.util.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String ipv4 = "^([0-9]|[01]?[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.([0-9]|[01]?[0-9][0-9]|2[0-4][0-9]|25[0-5])){3}$";
        String ipv6 = "^([0-9a-fA-F]{1,4})(:([0-9a-fA-F]{1,4})){7}$";
        
        int n = Integer.parseInt(scan.nextLine());
        
        while(n-- > 0) {
            
            String input = scan.nextLine().trim();
            int numSections = input.split("[\\.:]").length;
            String output = 
                (numSections == 4) 
                ? "IPv4" 
                : (numSections == 8) 
                    ? "IPv6" 
                    : "Neither";
                    
            if(!output.equals("Neither")) {
                
                boolean matches = Pattern.matches((numSections > 4) ? ipv6 : ipv4, input);
                
                if(!matches) {
                    output = "Neither";
                }
            }
            
            System.out.println(output);
            
        }
        
        scan.close();
    }
}