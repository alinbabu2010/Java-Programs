package Pack;
interface Measurements
{
  int l=85;
  int b=25;
  int h=60;
  void volume()
  {
     System.out.println("Volume of Rectangle :" +l*b*h);
  }
}
class Vrectangle
{
  public static void main(String args[])
  {
      Measurements M = new Measurements();
      M.volume();
  }
}