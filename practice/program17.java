class program17
{
    static int largest(int[] arr)
    {
        int large=arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i]>large)
            {
                large=arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
    {
        int[] arr={10,20,30,40,50};
        System.out.println(largest(arr));
    }
    }
}