// find last index 
//
public class LastIndex{

    public static void main(String args[]){
        String str = "Hello World ,Hello Reader";
        int lastindex = str.lastIndexOf("Hello");

        if (lastindex == -1){
            System.out.println("Hello not found");
        }else{
            System.out.println("Last occurrence of Hello is at index "+lastindex);
        }
    }
}
