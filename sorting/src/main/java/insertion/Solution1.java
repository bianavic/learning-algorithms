package insertion;

import java.util.Scanner;

// insertionSort1
public class Solution1 {

    // Complete the function below.
    static void insertionSort1(int n, int[] arr) {

        int x=arr[n-1], i;
        for(i=n-1;i>0 && arr[i-1]>x;i--){
            arr[i]=arr[i-1];
            for(int j=0;j<arr.length;j++)
                System.out.print(arr[j]+" ");
            System.out.println();
        }
        arr[i]=x;
        for(int j=0;j<arr.length;j++)
            System.out.print(arr[j]+" ");

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

        insertionSort1(n, arr);

        scanner.close();
    }
}
