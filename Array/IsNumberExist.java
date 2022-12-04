import java.util.*;

public class IsNumberExist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ifNumExist(arr, n, k);
    }

    public static void ifNumExist(int arr[], int n, int k) {
        // method body
        for (int i = 0; i < n; i++) {
            if (arr[i] == k)
                System.out.println("Number Exist");  
        }
    }
}
