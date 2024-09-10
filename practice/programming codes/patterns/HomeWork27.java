public class HomeWork27 {
    
    public static void main(String[] args) {
        int number = 5;
        for (int i = 1; i <=number; i++){
            int count =1;
            for (int j =1; j<=number-i; j++ ){
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(count++ +" ");
            }
            for (int j=1; j<i; j++){
                System.out.print(count++ + " ");
            } 
            System.out.println();
        }
        for (int i = 1; i <=number; i++){
            int count =1;
            for (int j =1; j<=i; j++ ){
                System.out.print("  ");
            }
            for (int j=1; j<=number-i; j++){
                System.out.print(count++ + " ");
            }
            for (int j=1; j<number-i; j++){
                System.out.print(count++ + " ");
            } 
            System.out.println();
        }
    }

}
