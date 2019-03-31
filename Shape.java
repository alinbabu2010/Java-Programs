class Shape
{
  int x;
  int y;
  void getData(int x,int y)
  {
    this.x=x;
    this.y=y;
  }
  void Area();
}
class rectangle extends Shape
{
   void Area()
   {
      System.out.println("Area of Rectamgle : "+x*y);
   }
}