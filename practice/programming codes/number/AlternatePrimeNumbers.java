public class  AlternatePrimeNumbers {

    public static boolean isPrimes(int number){
        if (number<=1){
            return false;
        }
        for (int i=2; i<=number/2; i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=20;
        int count =0;
        for(int i=2; i<=n; i++){
            if (isPrimes(i)){
                count++;
                if(count%2!=0){
                    System.out.println(i);
                }
            }
        }
    }
}
