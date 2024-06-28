public class transpose 
{
    public static void main(String[] args) {
        int arr[][]=new int[2][2];
        arr[0][0]=9;
        arr[0][1]=5;
        arr[1][0]=3;
        arr[1][1]=2;
        int one[][]=new int[2][2];
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                one[j][i]=arr[i][j];
            }
        }
        for (int i=0;i<arr.length;i++)
        {
            for (int j =0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();

        }
        System.out.println("-------After transpose--------");
        for (int i=0;i<one.length;i++)
        {
            for (int j =0;j<one[i].length;j++)
            {
                System.out.print(one[i][j]);
            }
            System.out.println();

        }
    }
    
}