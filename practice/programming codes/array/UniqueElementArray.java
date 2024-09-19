class UniqueElementArray{
    public static void main(String[] args) {
        int[] arr ={1,3,6,8,45,71,1,3};
        for (int i=0; i<arr.length; i++){
            int count = 1;
            for (int j=0; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    count+=1;
                }
            }
            if (count==2){
                System.out.print(arr[i] +" ");
            }
        }
    }
}