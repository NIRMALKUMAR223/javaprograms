public class HomeWork21 {
    
    public static void main(String[] args) {
        int number = 10;
        for (int i = 1; i <=number; i++){
            for (int j =1; j<number; j++ ){
                if (i==j || i+j == number){
                    System.out.print("*" +" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
