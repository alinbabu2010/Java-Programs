class point{
void show(){
System.out.println("This is the Point Base class");
}
}
class shape extends point{
void display(){
System.out.println("Different shapes can be developed with different number of points");
}
}
class rectangle extends shape{
int l,b;
void getdata(int x,int y){
l=x;b=y;
}
void area(){
System.out.println("Length:"+l);
System.out.println("Breadth:"+b);
System.out.println("Area:"+(l*b));
}
}
class square extends shape{
int a;
void gdata(int x){
a=x;
}
void area(){
System.out.println("Side:"+a);
System.out.println("Area:"+(a*a));
}
}
class circle extends shape{
int r;
void get(int x){
r=x;
}
void area(){
System.out.println("Radius:"+r);
System.out.println("Area:"+(3.14*r*r));
}
}
class triangle extends shape{
int b,h;
void tdata(int x,int y){
b=x;h=y;
}
void area(){
System.out.println("Base:"+b);
System.out.println("Height:"+h);
System.out.println("Area:"+(0.5*b*h));
}
}
class ShapeTest{
public static void main(String args[]){
rectangle r = new rectangle();
square s = new square();
circle c = new circle();
triangle t = new triangle();
r.show();
s.display();
System.out.println("");
System.out.println("Rectangle:");
System.out.println();
r.getdata(12,6);
r.area();
System.out.println("");
System.out.println("Square:");
System.out.println();
s.gdata(7);
s.area();
System.out.println("");
System.out.println("Circle:");
System.out.println();
c.get(5);
c.area();
System.out.println("");
System.out.println("Triangle:");
System.out.println();
t.tdata(4,7);
t.area();
}
}
