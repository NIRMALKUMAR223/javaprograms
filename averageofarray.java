public class averageofarray {
    
    static void averageOfArray(int[] arr)
    {
        int numberOfArray=arr.length;
        int countofarray=0;
        int average;
        for (int i=0;i<arr.length;i++)
        {
            countofarray+=arr[i];
        }
        average=countofarray/numberOfArray;
        System.out.println(average);
    }
    
    public static void main(String[] args) {
        int[] num={10,20,30,40,50,60,70,80,90,100};
        averageOfArray(num);
    }   
}
