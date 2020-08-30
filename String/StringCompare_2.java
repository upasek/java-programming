//compare strings by using equals() 

public class StringCompare_2{

    public static void main(String args[]){

        String s1 = "engineering";
        String s2 = "engineering";
        String s3 = new String("Engi neering");

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
    
    }

}
