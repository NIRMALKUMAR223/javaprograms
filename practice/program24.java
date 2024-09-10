class program24{
    static void finder(int[] arr){
        int[] New = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            int mul=1;
            for (int j=0; j<arr.length; j++){
                if (arr[i]!=arr[j]){
                    mul*=arr[j];
                }
            }
            System.out.print(mul);
            New[i]=mul;
        }
        System.out.println();
        for (int i : New){
            System.out.print(i +" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        finder(arr);
    }
}