public class Reverse54321 {
    public static void main(String[] args) {
        int number =5;
        for (int i = 1; i <= number; i++){
            for (int j = i; j >=1; j--){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
