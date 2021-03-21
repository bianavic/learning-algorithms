package coutingsort;

import java.util.Scanner;

//  Full CountSort (advanced)
public class Solution4 {

    // Complete the function below.
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int n =in.nextInt();
        StringBuffer str[]=new StringBuffer[100];
        for(int i=0;i<100;i++)
        {
            str[i]=new StringBuffer();
        }
        for(int i=0;i<n;i++)
        {
            int k = in.nextInt();
            String s = in.next();
            if(i<n/2)
                s="- ";
            else
                s=s+" ";
            str[k]=str[k].append(s);
        }
        for(int i=0;i<100;i++)
        {
            System.out.print(str[i]);
        }
    }
}


