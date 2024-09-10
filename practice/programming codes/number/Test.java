class Test{
   public static boolean checkPrime(int number){
      if (number<=1){
         return false;
      }
      for (int i = 2; i<=number/2;i++){
         if (number%i==0){
            return false;
         }
      }
      return true;
   }
   public static void main(String[] args) {
      int number = 56;
      int prime = 2;
      while (true){
         if (checkPrime(prime)){
            System.out.println(prime);
         }
         if (prime==number){
            break;
         }
         prime++;
      }
   }
}