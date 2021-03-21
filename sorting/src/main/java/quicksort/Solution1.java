package quicksort;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Partition
public class Solution1 {

    // Complete the quickSort function below.
    static int[] quickSort(int[] arr) {

        int p = arr[0]; // pivot value

        int left = 1;
        int right = arr.length-1;
        while (left < right) {
            if (arr[left] > p && arr[right] < p) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            if (arr[left] < p) left++;
            if (arr[right] > p) right--;
        }

        // rearrange the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < p) {
                arr[i-1] = arr[i];
            } else {
                arr[i-1] = p;
                break;
            }
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

        int[] result = quickSort(arr);

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
