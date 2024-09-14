public class HomeWork18 {
    
    public static void main(String[] args) {
        int number = 5;
        for (int i = 1; i <=number; i++){
            int count =1;
            for (int j =1; j<=number-i; j++ ){
                System.out.print("  ");
            }
            for (int j = 1; j < 2*i; j++){ // 2*i
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
}