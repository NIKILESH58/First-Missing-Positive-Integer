import java.io.*;
import java.util.*;
public class FirstMissingPositiveInteger
{

    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n=0,d=0;
        n = in.nextInt();
        int array[] = new int[n];
        int missingarray[] = new int[n];
        int i=0,f=1;
        for (i = 0; i < n; i++) {
           array[i]=in.nextInt();
        }
       Arrays.sort(array);
       i=0;
    while (f!=array[n-1]) {
            if(array[i]==f)
            {
                i=i+1;
                f=f+1;
            }
            else
            {
                missingarray[d]=f;
                if(missingarray[d]>0)
                {
                System.out.println(missingarray[d]); 
                break;
                }
                f=f+1;
                d=d+1;
            }
    }
    }
}
