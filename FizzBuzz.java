public class FizzBuzz {
   public static void main(String[] args) {
    // public String fizzbuzz (int number);
    int RanNum = 33;
    if( RanNum / 3 == 11) {
        System.out.println("Fizz");
    } else if( RanNum / 6 == 5 ) { 
        System.out.println("Buzz");
    } else if( RanNum / 2 == 15) {
        System.out.println("FizzBuzz");
    }
   }
}
