import java.util.Scanner;
class PerfectNum
{
   public static void main(String args[])
   {
     int s=0;
     System.out.println("Enter the number");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     for(int i=1;i<n;i++)
     {
       if(n%i== 0)
         s+=i;
     }
     if(n==s)
       System.out.println("Perfect number");
     else
       System.out.println("Not perfect number");
   }
}