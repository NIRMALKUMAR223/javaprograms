class Frequency
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,4,3,2,1,7};
        boolean[] bool=new boolean[arr.length];
        for (int i=0;i<arr.length;i++)
        {
            if (bool[i])
            {
                continue;
            }
            int count=0;
            for (int j=0;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    count++;
                    bool[j]=true;
                }
            }
            System.out.println("value "+arr[i]+" : count "+ count);
        }
    }
}