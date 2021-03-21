package insertion;

import java.util.Scanner;

// insertionSort2
public class Solution2 {

    // Complete the function below.
    static void insertionSort2(int n, int[] arr) {

        for( int i = 1; i<n; i++)
        {

            int key = arr[i];
            for(int j=i; j>0; j--){
                if(arr[j-1]>key){
                    int y=arr[j-1]+key;
                    arr[j-1]=y-arr[j-1];
                    arr[j]=y-arr[j-1];

                }
            }
            for(int k=0; k<n; k++){
                System.out.print(arr[k]+" ");

            }
            System.out.println();

        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort2(n, arr);

        scanner.close();
    }
}
