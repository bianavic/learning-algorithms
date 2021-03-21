package quicksort;

import java.util.Scanner;

// QuickSort In-Place (advanced)
public class Solution3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);

        int N= in.nextInt();
        int sum=0;
        int[] arr = new int[N];
        int[] a = new int[100];
        for(int i=0;i<N;i++){

            arr[i]=in.nextInt();
            String s =in.next();
            a[arr[i]]++;
        }
        for(int j=0;j<100;j++){
            sum = sum + a[j];
            System.out.print(sum +" ");
        }
    }
}
