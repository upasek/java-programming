public class StringCompare_1{

    public static void main (String args[]){
        String str = "Hello World";
        String anotherString = "hello world";
        Object objstr = str;

        System.out.println(str.compareTo(anotherString));
        System.out.println(str.compareToIgnoreCase(anotherString) );
        System.out.println(str.compareTo(objstr.toString() ) );
    
    }

}
