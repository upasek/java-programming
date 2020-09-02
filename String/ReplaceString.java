public class ReplaceString{

    public static void main(String args[]){

        String str = "Hello World";
        System.out.println("The original string : "+str);
        System.out.println( str.replace('H', 'W'));
        System.out.println( str.replaceFirst("He", "Wa"));
        System.out.println( str.replaceAll("He", "Ha"));

    }

}
