import java.io.*;
class Evenodd
{
  public static void main(String args[]) throws IOException
  {
    int a;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the number\n");
    a=Integer.parseInt(br.readLine());
    if(a%2==0)
      System.out.print("Number is even");
    else
      System.out.print("Number is odd");
  }
} 