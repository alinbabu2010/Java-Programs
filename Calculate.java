package Pack;
interface Volume
{
   int l=10;
   int b=20;
   int h=5; 
   void volume();
}
class Rectangle implements Volume
{
   public void volume()
   {
     System.out.println("Volume : "+l*b*h);
   }
}
public class Calculate
{
  public static void main(String args[])
  {
     Rectangle r=new Rectangle();
     r.volume();
  }
}