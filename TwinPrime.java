import java.util.Scanner;
class TwinPrime
{
  public static void main(String args[]) 
  {
     int j = 0;
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter limit of twin prime number upto which you want : ");
     int n = sc.nextInt();
     int LastPrime = 1;
     System.out.println("Twin Primes are:");
     for (int i = 1; i < n; i++) 
     {
	for (j = 2; j < i; j++) 
        {
	   if (i % j == 0) 
           {
	      break;
	   }
	}
	if (i == j) 
        {
	   if ((i - LastPrime) == 2) 
           {
	     System.out.println("("+(i-2)+","+i+")");
	   }
	   LastPrime = i;
	}
     }
  }
}