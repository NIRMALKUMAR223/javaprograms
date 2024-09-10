public class program23 {
    static void removeGivenElement(int[] arr,int number){
        int[] arr1=new int[arr.length];
        int k=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]!=number){
                arr1[k]=arr[i];
                k++;
            }
        }
        for (int i=0; i<k; i++){
  
                System.out.print(arr1[i]+" ");
        }
    }
    public static void main(String[] args) {
    int[] arr={7,3,2,8,2,3};
    int val=3;
    removeGivenElement(arr,val);
}
}