import java.util.*;
public class ReverseArray {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] arr=new int[n];

        // taking input of array
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        // output of array 
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

        // lets reverse the array 
        for(int i=0; i<n/2;  i++){
            // swap(arr[i], arr[n-1-i]);
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        
        }

        System.out.println();
        System.out.println("Array after reverse : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    
}
