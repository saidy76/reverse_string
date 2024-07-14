

package reversestring;

import java.util.Scanner;
public class ReverseString {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a String :");
        String original = sc.nextLine();
        String reverse = reversestring(original);
        System.out.println("The reversed String is :"+reverse);
    }
    
    public static String reversestring(String s)
    {
        String Original = s;
        String reverse="";
        for(int i=Original.length()-1;i>=0;i--){
            reverse += Original.charAt(i);
        }
        return reverse;
    }
}
