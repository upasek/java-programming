import java.util.*;

public class ReverseString_2{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        
        int len = str.length();
        String rev = ""; 
        for (int i = len-1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("The string after reverse :"+rev);
    
    }

}
