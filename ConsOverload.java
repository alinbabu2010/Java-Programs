class  Demo
{
  int  a,b,c;
  Demo()
  {  
    System.out.println(“Default  constructor”);
  }  
  Demo(int a, int b)
  {
    a=10;
    b=20;
    System.out.println(“ Two  parameterized   constructor “+  “a =“+a +”\tb=“+b);
  }
  Demo(int a)
  { 
    a=10;
    System.out.println(“This is single parameterized “+a);
  }
}
Class  ConsOverload
{
   public  static  void  main(String args[])
   {
     System.out.println(“Constructor  overloading”);
     Demo  d = new  Demo();
     Demo  d1 = new  Demo(10);
     Demo d2 = new  Demo(10,20);
   }
}


