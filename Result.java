class  Test
{
 int  mark1,mark2;
 void  getMarks(int m1,int m2)
 {
   mark1=m1;
   mark2=m2;
 }
 void  putmarks()
 {
   System.out.println("Marks");
   System.out.println("Marks1 :" +mark1);
   System.out.println("Mark2 :" +mark2);
 }
}
interface  sports
{
   final int sportwt=6;
   void putwt();
}
class Result extends Test implements sports
{
  int   total;
  public void putwt()
  {
    System.out.println("sportwt="+sportwt);
  } 
  void display()
  {
    total =mark1+mark2+sportwt;
    putmarks();
    putwt();
    System.out.println("Total Score="+total);
  }
}

