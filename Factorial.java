import java.util.*;
class Factorial
{
  public static void main(String args[])
  {
    int a,fact=1;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number\n");
    a=sc.nextInt();
    for(int i=1;i<=a;i++)
      fact=fact*i;
    System.out.print("Factorial is "+fact);
  }
}