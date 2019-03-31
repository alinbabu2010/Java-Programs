class Shape
{
  int x;
  int y;
  void getData(int x,int y)
  {
    this.x=x;
    this.y=y;
  }
  void Area()
  {
    }
}
class Rectangle extends Shape
{
   void Area()
   {
      System.out.println("Area of Rectangle : "+x*y);
   }
}
class Triangle extends Shape
{
   void Area()
   {
      System.out.println("Area of Triangle : "+0.5*x*y);
   }
}
class circle extends Shape
{
   void Area()
   {
      System.out.println("Area of Circle : "+3.14*x*x);
   }
}
class Sarea
{
  public static void main(String args[])
  {
    Rectangle R = new Rectangle();
    R.getData(10,20);
    R.Area();
    Triangle t = new Triangle();
    t.getData(10,20);
    t.Area();
    circle c = new circle();
    c.getData(10,0);
    c.Area();
  }
}