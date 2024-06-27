public class sortarray {
    public static void main(String[] args) {
        int temp;
        int arr[]=new int[5];
        arr[0]=5;
        arr[1]=4;
        arr[2]=3;
        arr[3]=2;
        arr[4]=1;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<=i;j++)
            {
                if (arr[j]>arr[i])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
