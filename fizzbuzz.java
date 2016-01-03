
public class FizzBuzz {

  /**
   * Write a program that prints integers form 1 to 100
   * and 
   *  1) if the integer is a multiple of 3, print Fizz instead
   *  2) if the integer is a multiple of 5, print Buzz instead 
   *  3) if the integer is a multiple of 3 and 5, print FizzBuzz instead
   *
   */
  public static void main(String[] args) {
    int k = 1;
    while (k < 101){
      if (k % 3 == 0 && k % 5 == 0){
        System.out.println("FizzBuzz");
        k++;
      }
      else if (k % 3 == 0){
        System.out.println("Fizz");
        k++;
      }
      else if (k % 5 == 0){
        System.out.println("Buzz");
            k++;
      }
      else{
            System.out.println(k);
            k++;
      }
    }

  }

}
