import java.util.*;
class palindrome {
        static boolean ispalindrome(String str) {
        if(str.length()<=1)
        {
        return true;
        }
        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);
        if(first!=last) {
        return false; 
        } else {
        String s=str.substring(1,str.length()-1);
        return ispalindrome(s);
        }
        }
        public static void main(String[]arg) {
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String v=sc.nextLine();
        System.out.println(ispalindrome(v));
            
        }
}
