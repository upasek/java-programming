import java.util.*;

public class ReverseString{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        
        StringBuffer tr = new StringBuffer(str);
        
        System.out.println("The original string is : "+tr);
        System.out.println("The string after reverse :"+tr.reverse());
    
    }

}
