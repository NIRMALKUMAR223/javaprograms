public class sortMatrix {
    static int[] sort(int[] arr)
    {
        for (int i=0;i<arr.length;i++)          
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }    
        return arr;
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3,1},{4,5,6,2},{7,8,9,3}};
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sort(arr[i]);
        }
        for (int[] i:arr)
        {
            for (int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
