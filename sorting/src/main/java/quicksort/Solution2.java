package quicksort;

import java.util.ArrayList;
import java.util.Scanner;

// QuickSort 2
public class Solution2 {

    static void quickSort(int ar[], int minpos, int maxpos){
        if(minpos >= maxpos)
            return;
        int p = ar[minpos];
        ArrayList<Integer> leftlist = new ArrayList<Integer>();
        ArrayList<Integer> rightlist = new ArrayList<Integer>();
        for(int i = minpos+1 ; i <= maxpos; i++)
        {
            if(ar[i] > p)
                rightlist.add(ar[i]);
            else
                leftlist.add(ar[i]);
        }
        int ppos=minpos;
        for(int num : leftlist)
            ar[ppos++] = num;
        ar[ppos++] = p;
        for(int num : rightlist)
            ar[ppos++] = num;
        quickSort(ar,minpos,minpos + leftlist.size()-1);
        quickSort(ar,minpos + leftlist.size()+1,maxpos);
        printArray(ar,minpos, maxpos);
    }
    static void printArray(int[] ar,int start, int end) {
        for(int i = start; i <= end;i++)
            System.out.print(ar[i]+" ");
        System.out.println("");
    }

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        quickSort(ar,0,n-1);
    }
}
