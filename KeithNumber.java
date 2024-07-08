public class KeithNumber {
    
    static void find (int[] arr,int size,int number)
    {
        int in=1;
        int sum=0;
        while (in<=3)
        {
            sum+=arr[arr.length-in];
            in++;
        }
        int[] array=new int[size+1];
        for (int i=0;i<arr.length;i++)
        {
            array[i]=arr[i];
        }
        array[array.length-1]=sum;
        for (int i: array)
        {
            System.out.print( i+" ");
        }
        System.out.println();
        if (number==array[array.length-1])
        {
            System.out.println();
            System.out.println(array[array.length-1]+" keith number..!");    
        }
        else
        {
            find(array, array.length,number);
        }
        }
    

    static int[] arrayCreating(int number,int size)
    {
        int rev=0;
        while (number!=0)
        {
            int last=number%10;
            rev=(rev*10)+last;
            number/=10;
        }
        int[] arr=new int[size];
        int i=0;
        while (rev!=0)
        {
            arr[i]=rev%10;     
            rev/=10;
            i++;
        }
        return arr;
    }
    static int length(int number) 
    {
        int count=0;
        while (number!=0)
        {
            count++;
            number/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        int number=742;
        int len=length(number);
        int[] arr=arrayCreating(number, len);
        find(arr, arr.length,number);
    }
}

