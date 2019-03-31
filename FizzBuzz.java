public class FizzBuzz
{
  public static void main(String[] args) 
  {

        String fizz = "Fizz";
        String buzz = "Buzz";
        String fizzBuzz = "FizzBuzz";
        for (int i = 1; i <= 100; i++) 
        {
            if (i % 5 == 0 && i % 7 == 0)        
                System.out.print(fizzBuzz + " "); 
            else if (i % 5 == 0)                   
              System.out.print(fizz + " ");
            else if (i % 7 == 0)                 
                System.out.print(buzz + " ");
            else                                
                System.out.print(i + " ");
       }
   }
}