class program39{
    public static void main(String[] args) {
        int arr[] = {121,43,45,56,78,7,43,121};
        int max = 0;
        int max2=0;
        for (int i =0 ; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max){
                max2 = arr[i];
            }
        }
        System.out.println(max + " "+ max2);        
    }
}