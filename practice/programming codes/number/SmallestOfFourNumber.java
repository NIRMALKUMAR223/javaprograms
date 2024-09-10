public class SmallestOfFourNumber {
    public static void main(String[] args){
        int number1 = 10;
        int number2 = 20;
        int number3 = 30;
        int number4 = 40;
        int result = (number1 < number2 && number1<number3 && number1 < number4)? 
        number1:(number2 < number3 && number2 < number4)?number2:(number3 < number4)?number3:number4;
        System.out.println(result);
    }
}
