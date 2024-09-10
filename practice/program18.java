class prograam18
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,4,3,2,1,7};
        // boolean[] bool=new boolean[arr.length];
        int visited=-1;
        for (int i=0;i<arr.length;i++)
        {
            // if (bool[i])
            if (arr[i]==visited)
            {
                continue;
            }
            int count=1;
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    count++;
                    // bool[j]=true;
                    arr[j]=visited;
                }
            }
            System.out.println("value "+arr[i]+" : count "+ count);
        }
    }
}