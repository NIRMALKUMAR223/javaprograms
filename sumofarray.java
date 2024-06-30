public class sumofarray {

    static void sumOfArray(int[] arr)
    {
        int count=0;
        for (int i=0;i<arr.length;i++)
        {
            count+=arr[i];
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int[] n={10,20,30,40,50,60,70,80,90,100};
        sumOfArray(n);
    }
}