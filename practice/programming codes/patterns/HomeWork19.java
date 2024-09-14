public class HomeWork19 {
    
    public static void main(String[] args) {
        int number = 5;
        for (int i = 1; i <=number; i++){
            char ch ='A';
            for (int j =1; j<=number-i; j++ ){
                System.out.print("  ");
            }
            for (int j = 1; j < 2*i; j++){
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }
}
