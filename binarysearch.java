import java.util.*;
public class binarysearch {
    
    static void binarySearch(int[] array,int search,int lower,int higher)
    {

        if (lower<=higher)
        {
            int middle=lower+(higher-lower)/2;
            if (search==array[middle])
            {
                System.out.println("found : "+search+" index "+middle);
            }
            else if ( search>array[middle])
            {
                binarySearch(array,search,middle++,higher);
            }
            else if ( search<array[middle])
            {
                binarySearch(array, search, lower, middle--);
            }
        else
        {
            System.out.println("element not found");
        }
        
    }
    
    }

    static int[] sort(int[] arr)
    {
        int temp;
        for ( int i=0;i<arr.length;i++)
        {
            for (int j=0;j<=i;j++)
            {
                if (arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        int sort[]=sort(arr);
        int search=sc.nextInt();
        int lower=0;
        int higher=sort.length;
        binarySearch(sort,search,lower,higher);
        for (int i : sort)
        {
            System.out.print(i +" ");
        }
        sc.close();
    }
}
