  
public class SumArray {     
    
    public static void main(String[] args)  { 
        // getting sum of array values 
        int sum = 0; 
        int arr[] = {3, 1, 2, 5, 4};

        System.out.print("The given array is : ");
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            System.out.print(arr[i]+ " ");
        }
          
        System.out.println("\nsum of array values : " + sum); 
    }

} 
