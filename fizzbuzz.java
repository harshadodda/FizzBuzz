k = 0;
while (k < 100){
  if (k % 3 == 0 && k % 5 == 0){
    System.out.println("BuzzFizz")
    k++;
  }
  else
    if (k % 3 == 0){
      System.out.println("Buzz");
      k++;
    }
    else
      if (k % 5 == 0){
        System.out.println("Fizz");
        k++;
      }
        else
          System.out.format("%d",k);
}

//and i pray to god to kiss uuuuuuuuuuu