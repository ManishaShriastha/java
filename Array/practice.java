import java.util.*;
public class practice {

    public static void binarySearch(int arr[],int n, int key){
        int s=0;
        int e=n-1;
        int mid=s+(e-s)/2;
        while(s<=e){
            if(arr[mid]==key){
                System.out.print("Element found at : "+mid);
                break;
            }else if(arr[mid]>key){
                e=mid-1;
            }else if(arr[mid]<key){
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        System.out.print("Element not found.");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        /* initialize with declaration */
        // int arr[]=new int[]{1,2,3,4,5};

        /* this way we have to initialize one by one.  */
        // int arr[]=new int[5];
        // arr[0]=1;

        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }System.out.println();

        System.out.print("Original Array : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();


        /* After reverse the array  */
        for(int i=0; i<n/2; i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        System.out.print("After array reverse : ");
        for(int k=0; k<n; k++){
            System.out.print(arr[k]+" ");
        }System.out.println();

        System.out.print("Swap Alternate : ");
        for(int i=0; i<n; i=i+2){
            if(i+1<n){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int k=0; k<n; k++){
            System.out.print(arr[k]+" ");
        }System.out.println();

        System.out.print("Binary Search : ");
        binarySearch(arr, n,2);


        

    }
}
