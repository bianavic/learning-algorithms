package coutingsort;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Sort Couting Sort 2 / Simple Sort
public class Solution2 {

    // Complete the counting function below.
    static int[] countingSort(int[] arr) {

        int n = arr.length;
        int k = arr[0];
        for(int i=1;i<n;i++) {
            if(arr[i]>k) {
                k = arr[i];
            }
        }
        int count[] = new int[k+1];
        for(int i=0;i<n;i++) {
            ++count[arr[i]];
        }
        for(int i=1;i<k+1;i++) {
            count[i] = count[i]+count[i-1];
        }
        int b[] = new int[n];
        for(int i=n-1;i>=0;i--) {
            b[--count[arr[i]]] = arr[i];
        }
        for(int i=0;i<n;i++) {
            arr[i] = b[i];
        }
        return arr;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = countingSort(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
