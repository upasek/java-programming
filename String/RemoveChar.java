import java.util.*;

public class RemoveChar{

    public static void main(String args[]){
        String str = "This is java";
        System.out.println("The original string is : "+str);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position : ");
        int pos = sc.nextInt();
        String str2 = str.substring(0,pos) + str.substring(pos+1);

        System.out.println("New string is : "+str2);

    }

}
