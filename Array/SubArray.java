import java.util.*;
public class SubArray {
    public static void main(String [] args){

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

        System.out.println();
        System.out.println("Print all possible Sub Array : ");
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    
    



    }
}
